package com.sdp.beans;

/*
 * this class is meant for writing a message either in pdf of html way
 */
public class MessageWriter {
	IMessageConverter messageConverter = null;

	public void writeMessage(String message) {
		//messageConverter = MessageConverterFactory.convertFactory("html");//still this is some tightly coupled with logical class name of another class so
		//there is some amount of couplling between the classes , so it make our class tightly coupled , in future if i need to change anything again we need to 
		//chage html to pdf so its not a minimal change but it will re cast while going to production environment .
		String msg=messageConverter.convert(message);
		System.out.println(msg);
	}

	public void setMessageConverter(IMessageConverter messageConverter) {
		this.messageConverter = messageConverter;
	}
	
}
