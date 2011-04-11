/**
 *
 */
package com.ionetwork.ws;

import javax.xml.namespace.QName;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.math.RandomUtils;

import com.ionetwork.ws.in.SMSPortInDelegate;
import com.ionetwork.ws.in.SMSPortInService;
import com.ionetwork.ws.out.SMSPortOutDelegate;
import com.ionetwork.ws.out.SMSPortOutService;
import com.ionetwork.ws.util.DateUtils;

/**
 * @author nghidt
 *
 */
public class WebServiceClient {
	//static private String PRIVATE_KEY = "aW9uZXR3b3JkX3Ntc19rZXk=";
	static private String PRIVATE_KEY = "aW9uZXR3b3JkX3Ntc19rZXk=";
	/**
	 * @param args
	 */
	public static boolean postSMS(final String infoMessage, final String phoneNumber) {
		final String serviceNumber = "19001520" ;
		//final String phoneNumber = "01265772361" ;
		final String mobileOperator = "VMS" ;
		final String commandCode = "VERA" ;
		//final String infoMessage = "Test sending sms through gateway" ;
		final String messageID = "1000002" ;
		final String messageID1 = "0" ;
		
		String wsdlURL = "http://172.16.1.69:7070/SMSService/PortIn?wsdl";
		String namespace = "null";
		String serviceName = "callback";
		QName serviceQN = new QName(namespace, serviceName);
		
		
		try {
			String sbegin = "Begin : " + DateUtils.format(DateUtils.getTime(), "hh:mm:ss") ;
			
			SMSPortInService s = new SMSPortInService();
			final SMSPortInDelegate servicePort1 = s.getPortIn();
			
			SMSPortOutService service = new SMSPortOutService();
			final SMSPortOutDelegate servicePort = service.getPortOut();
			
			//for (int i = 0; i < 1; i++) {
				final int  id = 0 ;
				(new Thread(new Runnable(){
					public void run() {
						//SMSPortOut Service service = new SMSPortOutService();
						//SMSPortOutDelegate servicePort = service.getPortOut();
						
						System.out.println("thread runs");
						
						//for (int j = 0; j <1; j++) {
							try {
								Thread.currentThread().sleep(2) ;
							} catch (Exception e) {
								// TODO: handle exception
							}
							
							long sendTime = DateUtils.getTime() ;
							int iret = 0 ;
							if (RandomUtils.nextBoolean()) {
								System.out.println("ID [0]: " +  id + " >>> sendTime : " + sendTime);
								//iret = servicePort.receiveMessage(messageID,phoneNumber, serviceNumber, mobileOperator, commandCode, infoMessage,sendTime, getSignKey(serviceNumber,phoneNumber,commandCode,infoMessage,sendTime));
								//System.out.println("ID [0]: " + id + " >>> return code : " + iret);
								iret = servicePort1.sendMessage(phoneNumber, infoMessage, messageID1, getSignKey(new Object[] {phoneNumber,infoMessage,messageID1} ));
								System.out.println("ID [0]: " + id + " >1> return code : " + iret);
							} else {
								System.out.println("ID [1]: " +  id + " >>> sendTime : " + sendTime);
								long messageId = RandomUtils.nextLong() ;
								//iret = servicePort1.sendMessage(phoneNumber, infoMessage, messageID1, getSignKey(new Object[] {phoneNumber,infoMessage,messageID1} ));
								
								//int iret =  servicePort.resultMessage(messageId , 200, getSignKey(messageId,200));
								//System.out.println("ID [0]: " + id + " >>> return code : " + iret);
								iret = servicePort1.sendMessage(phoneNumber, infoMessage, messageID1, getSignKey(new Object[] {phoneNumber,infoMessage,messageID1} ));
								System.out.println("ID [1]: " + id + " >1> return code : " + iret);
							}
						//}//for
					}
				}
			)).run() ;
			//}//for
			System.out.println(sbegin);
			System.out.println("End : " +  DateUtils.format(DateUtils.getTime(), "hh:mm:ss"));
			
			
			//System.out.println(sd.getStatus());
			//sd.doSend();
			System.out.println(".");
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	
	public static String getSignKey( String serviceNumber, String phoneNumber, String commandCode, String infoMessage, long sendTime) {
		StringBuffer sb = new StringBuffer();
		sb.append(serviceNumber).append("_").append(phoneNumber).append("_").append(commandCode).append("_").append(infoMessage).append("_").append(sendTime).append("_").append(PRIVATE_KEY) ;
		DigestUtils.md5Hex(sb.toString()) ;
		return DigestUtils.md5Hex(sb.toString()).toLowerCase();
	}
	
	public static String getSignKey(long messageId, int result) {
		StringBuffer sb = new StringBuffer();
		sb.append(messageId).append("_").append(result).append("_").append(PRIVATE_KEY) ;
		DigestUtils.md5Hex(sb.toString()) ;
		return DigestUtils.md5Hex(sb.toString()).toLowerCase();
	}
	public static String getSignKey(Object[] params) {
		StringBuffer sb = new StringBuffer();
		for (int k = 0; k<params.length; k++){
			Object object = params[k];
//		for (Object object : params) {
			sb.append(object).append("_");
		}
		sb.append(PRIVATE_KEY) ;
		DigestUtils.md5Hex(sb.toString()) ;
		return DigestUtils.md5Hex(sb.toString()).toLowerCase();
	}
}
