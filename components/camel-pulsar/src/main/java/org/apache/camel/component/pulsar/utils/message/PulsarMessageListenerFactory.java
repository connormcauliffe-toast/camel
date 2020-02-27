package org.apache.camel.component.pulsar.utils.message;

import org.apache.camel.Processor;
import org.apache.camel.component.pulsar.PulsarAsyncMessageListener;
import org.apache.camel.component.pulsar.PulsarEndpoint;
import org.apache.camel.component.pulsar.PulsarMessageListener;
import org.apache.camel.component.pulsar.configuration.PulsarConfiguration;
import org.apache.camel.spi.ExceptionHandler;

public class PulsarMessageListenerFactory {

    public static PulsarMessageListener create(PulsarEndpoint endpoint, ExceptionHandler exceptionHandler, Processor processor) {
        PulsarConfiguration configuration = endpoint.getPulsarConfiguration();
        if (configuration.isProcessAsync()) {
            return new PulsarAsyncMessageListener(endpoint, exceptionHandler, processor);
        }
        return new PulsarMessageListener(endpoint, exceptionHandler, processor);
    }
}
