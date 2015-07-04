package com.example.spring.mail;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailParseException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

/**
 * @author Maulik
 * 
 */
public class MailSenderWithAttachmentImpl {

	private JavaMailSender mailSender;
	private SimpleMailMessage simpleMailMessage;

	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	public void setSimpleMailMessage(SimpleMailMessage simpleMailMessage) {
		this.simpleMailMessage = simpleMailMessage;
	}

	public void sendMail(String dear, String content) {
		MimeMessage mimeMessage = mailSender.createMimeMessage();
		try {
			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
			helper.setTo(simpleMailMessage.getTo());
			helper.setSubject(simpleMailMessage.getSubject());
			helper.setText(String.format(simpleMailMessage.getText(), dear,
					content));
			FileSystemResource file = new FileSystemResource(
					"C:\\Users\\Maulik\\Desktop\\Praposal.png");
			helper.addAttachment(file.getFilename(), file);
		} catch (MessagingException e) {
			throw new MailParseException(e);
		}
		mailSender.send(mimeMessage);
	}

}
