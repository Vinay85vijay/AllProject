package com.mirafra.email.mailservice;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.mirafra.email.dto.MailRequest;
import com.mirafra.email.dto.MailResponse;
import com.mirafra.email.employee_details.Employe_Details;

import jakarta.mail.Message;
import jakarta.mail.Message.RecipientType;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;

@Service
public class EmailService {
	@Autowired
	private JavaMailSender sender;
	@Autowired
	private Employe_Details details;
//	@Autowired
//	private Configuration  config;

	public MailResponse sendMail(MailRequest request, Map<String, Object> model) {
		MailResponse response = new MailResponse();
		MimeMessage message = sender.createMimeMessage();
		try {
			MimeMultipart mimeMultipart = new MimeMultipart();
			MimeBodyPart mimeMessage = new MimeBodyPart();
			MimeBodyPart mimeAttachment = new MimeBodyPart();
			mimeMessage.setText("Resignation letter ");

			File file = new File("C:\\Users\\Admin\\Downloads\\mirafra Logo.jpg");
			mimeMessage.setContentMD5("<h2> am living the company for so n so reasons</h2>");

			mimeAttachment.attachFile(file);
			mimeMultipart.addBodyPart(mimeAttachment);
			mimeMultipart.addBodyPart(mimeMessage);

			message.setFrom("v.gouda85@gmail.com");
			RecipientType type = Message.RecipientType.TO;
			message.addRecipients(type, request.getTo());
			message.setSubject("Resignation letter");

			message.setContent(mimeMultipart);
			sender.send(message);

//	 helper.setTo(request.getTo());
//	 helper.setText(html,true);
//	 helper.setSubject(request.getSubject());
//	 helper.setFrom(request.getFrom());
//	 sender.send(message);
			response.setMessage("mail send to : " + request.getTo());
			response.setStatus("TRUE");

		} catch (MessagingException | IOException e) {

			response.setMessage("mail Sending failure : " + e.getMessage());
			response.setStatus("FALSE");
		}
		return response;
	}

}
