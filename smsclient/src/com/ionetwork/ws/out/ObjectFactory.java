
package com.ionetwork.ws.out;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.ionetwork.ws.out package.
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
	
	private final static QName _ResultMessage_QNAME = new QName("http://www.ionetwork.com/", "resultMessage");
	private final static QName _ResultMessageResponse_QNAME = new QName("http://www.ionetwork.com/", "resultMessageResponse");
	private final static QName _ReceiveMessageResponse_QNAME = new QName("http://www.ionetwork.com/", "receiveMessageResponse");
	private final static QName _ReceiveMessage_QNAME = new QName("http://www.ionetwork.com/", "receiveMessage");
	
	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.ionetwork.ws.out
	 * 
	 */
	public ObjectFactory() {
	}
	
	/**
	 * Create an instance of {@link ResultMessageResponse }
	 * 
	 */
	public ResultMessageResponse createResultMessageResponse() {
		return new ResultMessageResponse();
	}
	
	/**
	 * Create an instance of {@link ReceiveMessageResponse }
	 * 
	 */
	public ReceiveMessageResponse createReceiveMessageResponse() {
		return new ReceiveMessageResponse();
	}
	
	/**
	 * Create an instance of {@link ResultMessage }
	 * 
	 */
	public ResultMessage createResultMessage() {
		return new ResultMessage();
	}
	
	/**
	 * Create an instance of {@link ReceiveMessage }
	 * 
	 */
	public ReceiveMessage createReceiveMessage() {
		return new ReceiveMessage();
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ResultMessage }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.ionetwork.com/", name = "resultMessage")
	public JAXBElement<ResultMessage> createResultMessage(ResultMessage value) {
		return new JAXBElement<ResultMessage>(_ResultMessage_QNAME, ResultMessage.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link ResultMessageResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.ionetwork.com/", name = "resultMessageResponse")
	public JAXBElement<ResultMessageResponse> createResultMessageResponse(ResultMessageResponse value) {
		return new JAXBElement<ResultMessageResponse>(_ResultMessageResponse_QNAME, ResultMessageResponse.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link ReceiveMessageResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.ionetwork.com/", name = "receiveMessageResponse")
	public JAXBElement<ReceiveMessageResponse> createReceiveMessageResponse(ReceiveMessageResponse value) {
		return new JAXBElement<ReceiveMessageResponse>(_ReceiveMessageResponse_QNAME, ReceiveMessageResponse.class, null, value);
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveMessage }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.ionetwork.com/", name = "receiveMessage")
	public JAXBElement<ReceiveMessage> createReceiveMessage(ReceiveMessage value) {
		return new JAXBElement<ReceiveMessage>(_ReceiveMessage_QNAME, ReceiveMessage.class, null, value);
	}
	
}
