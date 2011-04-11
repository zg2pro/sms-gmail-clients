package com.ionetwork;

import javax.mail.MessagingException;

import com.ionetwork.mail.MailClient;
import com.ionetwork.ws.WebServiceClient;

public class Main {

	public static boolean sendSMS (String text, String phoneNumber){
		return WebServiceClient.postSMS(text, phoneNumber);
	}
	
	public static boolean sendEMail (String obj, String to, String text) throws MessagingException{
		return MailClient.postMail(new String[]{to}, obj, text, "no-reply@ionetwork.com");
	}
	
	/**
	 * @param args
	 * @throws MessagingException 
	 */
	public static void main(String[] args) throws MessagingException {
		// TODO Auto-generated method stub
		Main.sendEMail("test", "anne.gregory@ionetwork.com", "test email");
		Main.sendSMS("test", "01265772361");
	}

}
