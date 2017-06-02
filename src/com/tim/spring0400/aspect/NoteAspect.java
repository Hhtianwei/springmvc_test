package com.tim.spring0400.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.tim.spring0400.model.Student;


@Component
@Aspect
public class NoteAspect
{
	@Pointcut("execution(* com.tim.spring0400.service.*.*(..))")
	public void pointCut1()
	{

	}

	//加入参数
	@Before("execution(* com.tim.spring0400.service.*.*(..)) && args(name)")
	public void before(String name)
	{
		System.out.println("==========advice name==========" + name);
		System.out.println("start ...");
	}

	@After("pointCut1()")
	public void after()
	{
		System.out.println("end ...");
	}

	@Before("execution(* com.tim.spring0400.service.*.*(..)) && args(stu)")
	public void after2(Student stu)
	{
		stu.setName("noah-123");
		System.out.println("before ..." + stu.getId());
	}

	@Around("execution(* com.tim.spring0400.service.*.*(..))")
	public Object arounding(ProceedingJoinPoint pj)
	{
		System.out.println("start proceedingJoinPoint...");
		try
		{
			Object o = pj.proceed();
			System.out.println(o);
			System.out.println("end proceedingJoinPoint...");
			return o;
		}
		catch (Throwable e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return pj;
	}
}
