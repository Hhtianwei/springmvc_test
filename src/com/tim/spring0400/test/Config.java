package com.tim.spring0400.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan("com.tim")
@EnableAspectJAutoProxy
public class Config
{

}
