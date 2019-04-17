package com.sdp.test;

import java.io.IOException;

import com.sdp.beans.IMessageConverter;
import com.sdp.beans.MessageWriter;
import com.sdp.helper.AppsFactory;
import com.sdp.helper.MessageConverterFactory;

public class Test {
	public static void main(String[] args)
			throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		IMessageConverter messageConverter = null;
		MessageWriter mw = null;

		// Still my class is tightly coupled with other class and is been open
		// to create the object for other class
		// so we need to see some alternate for this
		
		 /* MessageWriter mw1 = new MessageWriter();
		  messageConverter =MessageConverterFactory.convertFactory("ht");
		  mw.setMessageConverter(messageConverter);
		  mw.writeMessage("welcome to sdp....");*/
		 

		mw = (MessageWriter) AppsFactory.getObject("messageWriter");
		messageConverter = (IMessageConverter) AppsFactory.getObject("messageConverter");
		mw.setMessageConverter(messageConverter);
		mw.writeMessage("welcome to sdp....");
	}
}
