package com.tim.spring0400.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.tim.spring0400.model.Student;
import com.tim.spring0400.service.HelloService;


@Configuration
@ComponentScan("com.tim")
@EnableAspectJAutoProxy
public class Main
{

	public static void main(String[] args)
	{
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

		HelloService service = context.getBean(HelloService.class);
		//service.sayHello("world");

		Student s1 = new Student();
		s1.setId(123);
		s1.setName("noah");

		System.out.println("service.getName(s1):" + service.getName(s1));
	}

}
