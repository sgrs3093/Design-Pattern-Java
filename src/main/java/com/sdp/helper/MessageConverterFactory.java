package com.sdp.helper;

import com.sdp.beans.HtmlMessageConverter;
import com.sdp.beans.IMessageConverter;
import com.sdp.beans.PdfMessageConverter;

/*
 * Factory class for creating the objects for class 
 * 
 * In this factory class we are creating an object related to html or pdf whatever we need based 
 * on that we are creating the object and returning to the calli method or class
 * If we need to create the object for PDFMessageConverter class then we need to send type as a PDF and we can create the object for PDFMessageConverter 
 * class or else HTML 
 */
public class MessageConverterFactory {
	public static IMessageConverter convertFactory(String type) {
		IMessageConverter messagCnverter = null;
		if (type.equals("html")) {
			messagCnverter = new HtmlMessageConverter();
		} else if (type.equals("pdf")) {
			messagCnverter = new PdfMessageConverter();
		}
		return messagCnverter;
	}
}
