
package com.ionetwork.ws.in;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 *
 * <pre>
 * SMSPortInService service = new SMSPortInService();
 * SMSPortInDelegate portType = service.getPortIn();
 * portType.sendMessage(...);
 * </pre>
 *
 * </p>
 *
 */
@WebServiceClient(name = "SMSPortInService", targetNamespace = "http://www.ionetwork.com/", wsdlLocation = "http://172.16.1.69:7070/SMSService/PortIn?wsdl")
public class SMSPortInService extends Service {
	
	private final static URL SMSPORTINSERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger.getLogger(com.ionetwork.ws.in.SMSPortInService.class.getName());
	
	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.ionetwork.ws.in.SMSPortInService.class.getResource(".");
			url = new URL(baseUrl, "http://172.16.1.69:7070/SMSService/PortIn?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://172.16.1.69:7070/SMSService/PortIn?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		SMSPORTINSERVICE_WSDL_LOCATION = url;
	}
	
	public SMSPortInService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}
	
	public SMSPortInService() {
		super(SMSPORTINSERVICE_WSDL_LOCATION, new QName("http://www.ionetwork.com/", "SMSPortInService"));
	}
	
	/**
	 *
	 * @return returns SMSPortInDelegate
	 */
	@WebEndpoint(name = "PortIn")
	public SMSPortInDelegate getPortIn() {
		return super.getPort(new QName("http://www.ionetwork.com/", "PortIn"), SMSPortInDelegate.class);
	}
	
}
