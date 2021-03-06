/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jms;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class JmsComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        JmsComponent target = (JmsComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "clientid":
        case "clientId": target.setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "connectionfactory":
        case "connectionFactory": target.setConnectionFactory(property(camelContext, javax.jms.ConnectionFactory.class, value)); return true;
        case "durablesubscriptionname":
        case "durableSubscriptionName": target.setDurableSubscriptionName(property(camelContext, java.lang.String.class, value)); return true;
        case "testconnectiononstartup":
        case "testConnectionOnStartup": target.setTestConnectionOnStartup(property(camelContext, boolean.class, value)); return true;
        case "acknowledgementmode":
        case "acknowledgementMode": target.setAcknowledgementMode(property(camelContext, int.class, value)); return true;
        case "acknowledgementmodename":
        case "acknowledgementModeName": target.setAcknowledgementModeName(property(camelContext, java.lang.String.class, value)); return true;
        case "asyncconsumer":
        case "asyncConsumer": target.setAsyncConsumer(property(camelContext, boolean.class, value)); return true;
        case "autostartup":
        case "autoStartup": target.setAutoStartup(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "cachelevel":
        case "cacheLevel": target.setCacheLevel(property(camelContext, int.class, value)); return true;
        case "cachelevelname":
        case "cacheLevelName": target.setCacheLevelName(property(camelContext, java.lang.String.class, value)); return true;
        case "concurrentconsumers":
        case "concurrentConsumers": target.setConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "maxconcurrentconsumers":
        case "maxConcurrentConsumers": target.setMaxConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "subscriptiondurable":
        case "subscriptionDurable": target.setSubscriptionDurable(property(camelContext, boolean.class, value)); return true;
        case "subscriptionname":
        case "subscriptionName": target.setSubscriptionName(property(camelContext, java.lang.String.class, value)); return true;
        case "subscriptionshared":
        case "subscriptionShared": target.setSubscriptionShared(property(camelContext, boolean.class, value)); return true;
        case "acceptmessageswhilestopping":
        case "acceptMessagesWhileStopping": target.setAcceptMessagesWhileStopping(property(camelContext, boolean.class, value)); return true;
        case "allowreplymanagerquickstop":
        case "allowReplyManagerQuickStop": target.setAllowReplyManagerQuickStop(property(camelContext, boolean.class, value)); return true;
        case "defaulttaskexecutortype":
        case "defaultTaskExecutorType": target.setDefaultTaskExecutorType(property(camelContext, org.apache.camel.component.jms.DefaultTaskExecutorType.class, value)); return true;
        case "eagerloadingofproperties":
        case "eagerLoadingOfProperties": target.setEagerLoadingOfProperties(property(camelContext, boolean.class, value)); return true;
        case "eagerpoisonbody":
        case "eagerPoisonBody": target.setEagerPoisonBody(property(camelContext, java.lang.String.class, value)); return true;
        case "exposelistenersession":
        case "exposeListenerSession": target.setExposeListenerSession(property(camelContext, boolean.class, value)); return true;
        case "taskexecutor":
        case "taskExecutor": target.setTaskExecutor(property(camelContext, org.springframework.core.task.TaskExecutor.class, value)); return true;
        case "deliverymode":
        case "deliveryMode": target.setDeliveryMode(property(camelContext, java.lang.Integer.class, value)); return true;
        case "deliverypersistent":
        case "deliveryPersistent": target.setDeliveryPersistent(property(camelContext, boolean.class, value)); return true;
        case "explicitqosenabled":
        case "explicitQosEnabled": target.setExplicitQosEnabled(property(camelContext, boolean.class, value)); return true;
        case "formatdateheaderstoiso8601":
        case "formatDateHeadersToIso8601": target.setFormatDateHeadersToIso8601(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "preservemessageqos":
        case "preserveMessageQos": target.setPreserveMessageQos(property(camelContext, boolean.class, value)); return true;
        case "priority": target.setPriority(property(camelContext, int.class, value)); return true;
        case "replyontimeouttomaxconcurrentconsumers":
        case "replyOnTimeoutToMaxConcurrentConsumers": target.setReplyOnTimeoutToMaxConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "replytoconcurrentconsumers":
        case "replyToConcurrentConsumers": target.setReplyToConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "replytomaxconcurrentconsumers":
        case "replyToMaxConcurrentConsumers": target.setReplyToMaxConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "replytotype":
        case "replyToType": target.setReplyToType(property(camelContext, org.apache.camel.component.jms.ReplyToType.class, value)); return true;
        case "requesttimeout":
        case "requestTimeout": target.setRequestTimeout(property(camelContext, long.class, value)); return true;
        case "timetolive":
        case "timeToLive": target.setTimeToLive(property(camelContext, long.class, value)); return true;
        case "allowadditionalheaders":
        case "allowAdditionalHeaders": target.setAllowAdditionalHeaders(property(camelContext, java.lang.String.class, value)); return true;
        case "allownullbody":
        case "allowNullBody": target.setAllowNullBody(property(camelContext, boolean.class, value)); return true;
        case "alwayscopymessage":
        case "alwaysCopyMessage": target.setAlwaysCopyMessage(property(camelContext, boolean.class, value)); return true;
        case "correlationproperty":
        case "correlationProperty": target.setCorrelationProperty(property(camelContext, java.lang.String.class, value)); return true;
        case "forcesendoriginalmessage":
        case "forceSendOriginalMessage": target.setForceSendOriginalMessage(property(camelContext, boolean.class, value)); return true;
        case "includesentjmsmessageid":
        case "includeSentJMSMessageID": target.setIncludeSentJMSMessageID(property(camelContext, boolean.class, value)); return true;
        case "replytocachelevelname":
        case "replyToCacheLevelName": target.setReplyToCacheLevelName(property(camelContext, java.lang.String.class, value)); return true;
        case "streammessagetypeenabled":
        case "streamMessageTypeEnabled": target.setStreamMessageTypeEnabled(property(camelContext, boolean.class, value)); return true;
        case "allowautowiredconnectionfactory":
        case "allowAutoWiredConnectionFactory": target.setAllowAutoWiredConnectionFactory(property(camelContext, boolean.class, value)); return true;
        case "allowautowireddestinationresolver":
        case "allowAutoWiredDestinationResolver": target.setAllowAutoWiredDestinationResolver(property(camelContext, boolean.class, value)); return true;
        case "asyncstartlistener":
        case "asyncStartListener": target.setAsyncStartListener(property(camelContext, boolean.class, value)); return true;
        case "asyncstoplistener":
        case "asyncStopListener": target.setAsyncStopListener(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.jms.JmsConfiguration.class, value)); return true;
        case "destinationresolver":
        case "destinationResolver": target.setDestinationResolver(property(camelContext, org.springframework.jms.support.destination.DestinationResolver.class, value)); return true;
        case "errorhandler":
        case "errorHandler": target.setErrorHandler(property(camelContext, org.springframework.util.ErrorHandler.class, value)); return true;
        case "exceptionlistener":
        case "exceptionListener": target.setExceptionListener(property(camelContext, javax.jms.ExceptionListener.class, value)); return true;
        case "idleconsumerlimit":
        case "idleConsumerLimit": target.setIdleConsumerLimit(property(camelContext, int.class, value)); return true;
        case "idletaskexecutionlimit":
        case "idleTaskExecutionLimit": target.setIdleTaskExecutionLimit(property(camelContext, int.class, value)); return true;
        case "includealljmsxproperties":
        case "includeAllJMSXProperties": target.setIncludeAllJMSXProperties(property(camelContext, boolean.class, value)); return true;
        case "jmskeyformatstrategy":
        case "jmsKeyFormatStrategy": target.setJmsKeyFormatStrategy(property(camelContext, org.apache.camel.component.jms.JmsKeyFormatStrategy.class, value)); return true;
        case "jmsoperations":
        case "jmsOperations": target.setJmsOperations(property(camelContext, org.springframework.jms.core.JmsOperations.class, value)); return true;
        case "mapjmsmessage":
        case "mapJmsMessage": target.setMapJmsMessage(property(camelContext, boolean.class, value)); return true;
        case "maxmessagespertask":
        case "maxMessagesPerTask": target.setMaxMessagesPerTask(property(camelContext, int.class, value)); return true;
        case "messageconverter":
        case "messageConverter": target.setMessageConverter(property(camelContext, org.springframework.jms.support.converter.MessageConverter.class, value)); return true;
        case "messagecreatedstrategy":
        case "messageCreatedStrategy": target.setMessageCreatedStrategy(property(camelContext, org.apache.camel.component.jms.MessageCreatedStrategy.class, value)); return true;
        case "messageidenabled":
        case "messageIdEnabled": target.setMessageIdEnabled(property(camelContext, boolean.class, value)); return true;
        case "messagetimestampenabled":
        case "messageTimestampEnabled": target.setMessageTimestampEnabled(property(camelContext, boolean.class, value)); return true;
        case "pubsubnolocal":
        case "pubSubNoLocal": target.setPubSubNoLocal(property(camelContext, boolean.class, value)); return true;
        case "queuebrowsestrategy":
        case "queueBrowseStrategy": target.setQueueBrowseStrategy(property(camelContext, org.apache.camel.component.jms.QueueBrowseStrategy.class, value)); return true;
        case "receivetimeout":
        case "receiveTimeout": target.setReceiveTimeout(property(camelContext, long.class, value)); return true;
        case "recoveryinterval":
        case "recoveryInterval": target.setRecoveryInterval(property(camelContext, long.class, value)); return true;
        case "requesttimeoutcheckerinterval":
        case "requestTimeoutCheckerInterval": target.setRequestTimeoutCheckerInterval(property(camelContext, long.class, value)); return true;
        case "transferexception":
        case "transferException": target.setTransferException(property(camelContext, boolean.class, value)); return true;
        case "transferexchange":
        case "transferExchange": target.setTransferExchange(property(camelContext, boolean.class, value)); return true;
        case "usemessageidascorrelationid":
        case "useMessageIDAsCorrelationID": target.setUseMessageIDAsCorrelationID(property(camelContext, boolean.class, value)); return true;
        case "waitforprovisioncorrelationtobeupdatedcounter":
        case "waitForProvisionCorrelationToBeUpdatedCounter": target.setWaitForProvisionCorrelationToBeUpdatedCounter(property(camelContext, int.class, value)); return true;
        case "waitforprovisioncorrelationtobeupdatedthreadsleepingtime":
        case "waitForProvisionCorrelationToBeUpdatedThreadSleepingTime": target.setWaitForProvisionCorrelationToBeUpdatedThreadSleepingTime(property(camelContext, long.class, value)); return true;
        case "errorhandlerlogginglevel":
        case "errorHandlerLoggingLevel": target.setErrorHandlerLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "errorhandlerlogstacktrace":
        case "errorHandlerLogStackTrace": target.setErrorHandlerLogStackTrace(property(camelContext, boolean.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "username": target.setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "transacted": target.setTransacted(property(camelContext, boolean.class, value)); return true;
        case "lazycreatetransactionmanager":
        case "lazyCreateTransactionManager": target.setLazyCreateTransactionManager(property(camelContext, boolean.class, value)); return true;
        case "transactionmanager":
        case "transactionManager": target.setTransactionManager(property(camelContext, org.springframework.transaction.PlatformTransactionManager.class, value)); return true;
        case "transactionname":
        case "transactionName": target.setTransactionName(property(camelContext, java.lang.String.class, value)); return true;
        case "transactiontimeout":
        case "transactionTimeout": target.setTransactionTimeout(property(camelContext, int.class, value)); return true;
        default: return false;
        }
    }

}

