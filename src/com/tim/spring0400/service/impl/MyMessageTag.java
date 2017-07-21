package com.tim.spring0400.service.impl;

import javax.servlet.jsp.JspException;

import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.web.servlet.tags.MessageTag;


public class MyMessageTag extends MessageTag
{

	public MyMessageTag()
	{
		System.out.println("==========MyMessageTag=============");
	}

	@Override
	protected String resolveMessage() throws JspException, NoSuchMessageException
	{
		MessageSource messageSource = getMessageSource();
		System.out.println("MyMessageTag:" + messageSource.getClass());
		return super.resolveMessage();
	}
}
