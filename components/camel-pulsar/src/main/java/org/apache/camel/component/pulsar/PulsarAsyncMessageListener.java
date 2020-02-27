/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.pulsar;

import org.apache.camel.AsyncProcessor;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.pulsar.utils.message.PulsarMessageHeaders;
import org.apache.camel.component.pulsar.utils.message.PulsarMessageUtils;
import org.apache.camel.spi.ExceptionHandler;
import org.apache.camel.support.AsyncProcessorConverterHelper;
import org.apache.pulsar.client.api.Consumer;
import org.apache.pulsar.client.api.Message;

public class PulsarAsyncMessageListener extends PulsarMessageListener {

    private AsyncProcessor asyncProcessor;

    public PulsarAsyncMessageListener(PulsarEndpoint endpoint, ExceptionHandler exceptionHandler, Processor processor) {
        super(endpoint, exceptionHandler, processor);
        asyncProcessor = AsyncProcessorConverterHelper.convert(processor);
    }

    @Override
    public void received(final Consumer<byte[]> consumer, final Message<byte[]> message) {
        final Exchange exchange = PulsarMessageUtils.updateExchange(message, endpoint.createExchange());

        try {
            if (endpoint.getPulsarConfiguration().isAllowManualAcknowledgement()) {
                exchange.getIn().setHeader(PulsarMessageHeaders.MESSAGE_RECEIPT, endpoint.getComponent().getPulsarMessageReceiptFactory().newInstance(exchange, message, consumer));
                asyncProcessor.processAsync(exchange);
            } else {
                asyncProcessor.processAsync(exchange);
                consumer.acknowledge(message.getMessageId());
            }
        } catch (Exception exception) {
            handleProcessorException(exchange, exception);
        }
    }

    private void handleProcessorException(final Exchange exchange, final Exception exception) {
        final Exchange exchangeWithException = PulsarMessageUtils.updateExchangeWithException(exception, exchange);

        exceptionHandler.handleException("An error occurred", exchangeWithException, exception);
    }
}
