package com.example.spring.mail;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Maulik
 * 
 */
public class MailSenderWithAttachementDemo {

	static Logger logger = Logger
			.getLogger(MailSenderWithAttachementDemo.class);

	public static void main(String[] args) {

		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"MailApplicationContext.xml");

		MailSenderWithAttachmentImpl mm = applicationContext.getBean(
				"mailSenderImplWithAttachment",
				MailSenderWithAttachmentImpl.class);
		mm.sendMail("Maulik Patel",
				"Test Message For Spring Mail Demo With Attchment");

		logger.info("Mail Sent SucessFully With Attchement...!!!");

		applicationContext.close();

	}

}
