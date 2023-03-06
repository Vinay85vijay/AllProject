package com.springlearning.service;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import com.springlearning.model.EMail;

import freemarker.template.Configuration;

@Service
public class MailSenderSpring {
	@Autowired
	JavaMailSender javaMailSender;
	@Qualifier("getFreeMarkerConfiguration")
	
	@Autowired
	Configuration fmConfiguration;
//
//	public void sendEmail(EMail mail) {
//		SimpleMailMessage msg = new SimpleMailMessage();
//		msg.setTo(mail.getTo());
//		msg.setFrom(mail.getFrom());
//		msg.setSubject(mail.getSubject());
//		msg.setText(mail.getContent());
//		javaMailSender.send(msg);
//	}

//	public void sendEmailWithAttachment(EMail mail) throws MessagingException, IOException {
//		MimeMessage msg = javaMailSender.createMimeMessage();
//		// true = multipart message
//		MimeMessageHelper helper = new MimeMessageHelper(msg, true);
//
//		helper.setTo(mail.getTo());
//		helper.setFrom(mail.getFrom());
//		helper.setSubject(mail.getSubject());
//		helper.setText(mail.getContent());
//
//		// hard coded a file path
//		// FileSystemResource file = new FileSystemResource(new File("path/img.png"));
//		// helper.addAttachment("Google Photo",file);
//		helper.addAttachment("Mirafra Logo", new ClassPathResource("C:\\Users\\Admin\\Downloads\\mirafra Logo.jpg"));
//		javaMailSender.send(msg);
//	}

	public void sendEmailWithTemplate(EMail mail) throws IOException {
		MimeMessage message = javaMailSender.createMimeMessage();
		
		
		try {

			MimeMultipart mimeMultipart = new MimeMultipart();
		MimeBodyPart mimeMessage = new MimeBodyPart();
			MimeBodyPart mimeAttachment = new MimeBodyPart();
			MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(message,"utf-8");

			mimeMessageHelper.setSubject(mail.getSubject());
			mimeMessageHelper.setFrom(mail.getFrom());
		mimeMessageHelper.setTo(mail.getTo());
			//mail.setContent(geContentFromTemplate(mail.getModel()));
			
			
			 
		//mimeMessageHelper.setText("hi all");
		//	mimeMessageHelper.setText(mail.getContent(),true);
			mimeMessageHelper.setText(
					
					 "<!DOCTYPE html>\r\n"
					+ "<html>\r\n"
					+ "<head>\r\n"
					+ "<meta charset=\"ISO-8859-1\">\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "<title>Resignation submition</title>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "	<div>\r\n"
					+ "\r\n"
					+ "		<h2 align=\"center\">Resignation submitted</h2>\r\n"
					+ "		<div align=\"center\">\r\n"
					+ "		\r\n"
					+ "		<img src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRHaj1R5DkdN1sk6jJnM9vlFqu6YlJztGZCXg&usqp=CAU\"  alt=\"shake hand\" width=\"100\" height=\"100\">\r\n"
					+ "	</div>"
					+ "<body>\r\n"
					+ "	<h2>  Resignation Letter</h2>\r\n"
					+ "	<br></br>\r\n"
					+ "	<br></br>\r\n"
					+ "	<h2 align=center>\r\n"
					+ "		Hi am  vinay with Employee\r\n"
					+ "		ID : <span>4571</span> <br>\r\n"
					+ "		leaving the company for my so n so reasons\r\n"
					+ "	</h2>\r\n"
					+ "	<br></br>\r\n"
					+ "	<br></br>\r\n"
					+ "</body>\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "</body>\r\n"
					+ "</html>",true);

		//	File file = new File("C:\\Users\\Admin\\Downloads\\mirafra Logo.jpg");
//			FileSystemResource file= new FileSystemResource (new File("C:\\Users\\Admin\\Downloads\\mirafra Logo.jpg"));
//		 mimeMessageHelper.addInline("mirafra logo", file);
		//	mimeMultipart.addBodyPart(mimeAttachment);
		//	mimeMultipart.addBodyPart(mimeMessage);
		//	mimeMessageHelper.addAttachment("Mirafra_logo.jpg", new ClassPathResource("C:\\Users\\Admin\\Downloads\\mirafra Logo.jpg"));

		//	javaMailSender.send(mimeMessageHelper.getMimeMessage());
		
		//	message.setContent(mimeMultipart);
		 	javaMailSender.send(message);
		 	
			System.out.println("mail sent Successfully");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
//
////	public String geContentFromTemplate(Map<String, Object> model) {
////		StringBuffer content = new StringBuffer();
////
////		try {
////			content.append(FreeMarkerTemplateUtils
////					.processTemplateIntoString(fmConfiguration.getTemplate("email.flth"), model));
////		} catch (Exception e) {
////			e.printStackTrace();
	//	}
//		return content.toString();
//	}
	
	
//	public String sendEmailWithAttachment(EMail emailDto) throws Exception{
//
//	    MimeMessage message = emailSender.createMimeMessage();
//	    MimeMessageHelper helper = new MimeMessageHelper(message, "utf-8");
//	    helper.setFrom("noreply@mirafra.com");
//	    //helper.set
//	    helper.setSubject(emailDto.getSubject());
//	    helper.setText(emailDto.getMessage(),true); 
//	   if(emailDto.getBccMailId()!=null && !emailDto.getBccMailId().isEmpty()){
//	        System.out.println("inside  bcc email");
//	    String[] bccEmail =  emailDto.getBccMailId().toArray(String[]::new);
//	    helper.setBcc(bccEmail);
//	    }
//	    if(emailDto.getCcMailId()!=null && !emailDto.getCcMailId().isEmpty()){
//	        System.out.println("inside  cc email");
//	     String[] ccEmail =  emailDto.getCcMailId().toArray(String[]::new);
//	      helper.setCc(ccEmail);
//	    }
//	    if(emailDto.getToMailId()!=null && !emailDto.getToMailId().isEmpty()){
//	        System.out.println("inside  to email");
//	        String[] toEmail =  emailDto.getToMailId().toArray(String[]::new);
//	        helper.setTo(toEmail);
//	    }
//	  //  helper.setTo(emailDto.getToMailId());
//	    emailSender.send(message);
//	    return "Email send successfully";
//	}
}
