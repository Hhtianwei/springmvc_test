package com.tim.spring0400.service.impl;

import org.springframework.stereotype.Service;

import com.tim.spring0400.model.Student;
import com.tim.spring0400.service.HelloService;


@Service
public class HelloServiceImpl implements HelloService
{

	@Override
	public String sayHello(String name)
	{
		System.out.println("hello," + name);
		return "abcdef";
	}

	@Override
	public String getName(Student stu)
	{
		String name = stu.getName();

		return "student : " + name;
	}

}
