package com.jason.mvnbook.account.email;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import com.jason.mvnbook.account.account_email.exceptions.AccountEmailException;

public class AccountEmailServiceImpl implements AccountEmailService {

	private JavaMailSender javaMailSender;
	
	private String systemEmail;
	
	
	
	public void sendMail(String to, String subject, String htmlText) throws AccountEmailException {
		// TODO Auto-generated method stub
		
		try {
			MimeMessage msg = javaMailSender.createMimeMessage();
			MimeMessageHelper msgHelper = new MimeMessageHelper(msg);
			
			msgHelper.setFrom(systemEmail);
			msgHelper.setTo(to);
			msgHelper.setSubject(subject);
			msgHelper.setText(htmlText,true);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			throw new AccountEmailException("Failed to send mail.",e);
		}

	}
	
	
	public JavaMailSender getJavaMailSender(){
		return javaMailSender;
	}

	public void setJavaMailSender(JavaMailSender javaMailSender){
		this.javaMailSender = javaMailSender;
	}
	
	public String getSystemEmail(){
		return systemEmail;
	}
	
	public void setSystemEmail(String systemEmail){
		this.systemEmail = systemEmail;
	}
}
