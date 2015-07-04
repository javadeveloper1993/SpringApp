package com.example.spring.mail;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Maulik
 * 
 */
public class MailSenderDemo {

	static Logger logger = Logger.getLogger(MailSenderDemo.class);

	public static void main(String[] args) {

		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"MailApplicationContext.xml");

		MailSenderImpl mm = applicationContext.getBean("mailSenderImpl",
				MailSenderImpl.class);
		// mm.sendMail("cemaulik007@gmail.com", "Spring Mail Demo",
		// "Test Message For Spring Mail Demo");

		mm.sendMail("maulikp55@gmail.com", "Spring Mail Demo",
				"Test Message For Spring Mail Demo");

		logger.info("Mail Sent SucessFully...!!!");

		applicationContext.close();

	}

}
