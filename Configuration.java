package com.sample;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import com.ibm.mq.jms.MQConnectionFactory;

public class Configuration {
	
	@Autowired
	JmsTemplate jmsTemplate;
	
	String sendQueueName;

	public MQConnectionFactory  connectionFactory() throws JMSException {
		MQConnectionFactory mqIbmFactory=new MQConnectionFactory();
		mqIbmFactory.setChannel("");
		mqIbmFactory.setHostName("");
		mqIbmFactory.setPort(1111);
		mqIbmFactory.setSSLCipherSuite("");
		mqIbmFactory.setQueueManager("");
		
		return mqIbmFactory;
	}
	
	public DefaultJmsListenerContainerFactory jmsListenerContainerFactory() throws JMSException {
		DefaultJmsListenerContainerFactory factory
		=new DefaultJmsListenerContainerFactory();
		factory.setConnectionFactory(connectionFactory());
		factory.setSessionAcknowledgeMode(Session.AUTO_ACKNOWLEDGE);
		return factory;
		
	}  
	
	public JmsTemplate jmsTemplate() throws JMSException {
		JmsTemplate template=new JmsTemplate();
		template.setConnectionFactory(connectionFactory());
		
		return template;
	}
	
	@JmsListener(destination="QUEUE.NAME",containerFactory="jmsListenerContainerFactory")
	
	public void reciveMessage() {
		
	}
	
	
	public void sendMessage(final String textMessage) {
		jmsTemplate.send(sendQueueName, new MessageCreator() {
			
			public Message createMessage(Session session) throws JMSException {
				// TODO Auto-generated method stub
				return session.createTextMessage(textMessage);
			}
		});
	}
	
}
