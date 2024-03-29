
package com.ionetwork.ws.in;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.ionetwork.ws.in package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {
	
	private final static QName _SendMessage_QNAME = new QName("http://www.ionetwork.com/", "sendMessage");
	private final static QName _SendMessageResponse_QNAME = new QName("http://www.ionetwork.com/", "sendMessageResponse");
	
	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.ionetwork.ws.in
	 * 
	 */
	public ObjectFactory() {
	}
	
	/**
	 * Create an instance of {@link SendMessageResponse }
	 * 
	 */
	public SendMessageResponse createSendMessageResponse() {
		return new SendMessageResponse();
	}
	
	/**
	 * Create an instance of {@link SendMessage }
	 * 
	 */
	public SendMessage createSendMessage() {
		return new SendMessage();
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SendMessage }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.ionetwork.com/", name = "sendMessage")
	public JAXBElement<SendMessage> createSendMessage(SendMessage value) {
		return new JAXBElement<SendMessage>(_SendMessage_QNAME, SendMessage.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link SendMessageResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.ionetwork.com/", name = "sendMessageResponse")
	public JAXBElement<SendMessageResponse> createSendMessageResponse(SendMessageResponse value) {
		return new JAXBElement<SendMessageResponse>(_SendMessageResponse_QNAME, SendMessageResponse.class, null, value);
	}
	
}
