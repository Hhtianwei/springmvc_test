package com.tim.spring0400.test;

import static org.junit.Assert.assertEquals;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tim.spring0400.service.HelloService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class HelloServiceTest extends AbstractJUnit4SpringContextTests
{
	@Resource
	private HelloService helloService;

	@Test
	public void testSayHello()
	{
		helloService.sayHello("annotation, hahaha");
		assertEquals(true, true);
	}
}
