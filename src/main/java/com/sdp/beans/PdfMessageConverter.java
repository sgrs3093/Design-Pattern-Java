package com.sdp.beans;

public class PdfMessageConverter implements IMessageConverter{

	@Override
	public String convert(String message) {
		return "<pdf>" + message + "</pdf>";
	}

}
