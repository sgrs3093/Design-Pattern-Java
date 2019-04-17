package com.sdp.beans;

public class HtmlMessageConverter implements IMessageConverter {
	@Override
	public String convert(String message) {
		return "<html><body>" + message + "</body></html>";
	}
}
