package com.tim.spring0400.mvc;

import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tim.spring0400.model.Student;


@Controller
@RequestMapping("/hello")
public class HelloController
{
	@Resource
	private MessageSource messageSource;

	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(Model model)
	{
		model.addAttribute("message", "world");
		return "/WEB-INF/views/home.jsp";
	}

	@RequestMapping(value = "/home2", method = RequestMethod.GET)
	public ModelAndView sayHello2(Model model)
	{
		model.addAttribute("message", "tianwei");
		return new ModelAndView("/WEB-INF/views/home.jsp");
	}

	@RequestMapping(value = "/home3", method = RequestMethod.GET)
	public String sayHello3(Model model)
	{
		Student stu = new Student();
		String x1 = messageSource.getMessage("abc.hello", null, "default1", Locale.CHINA);
		System.out.println("x1:" + x1);
		model.addAttribute("message", x1);
		model.addAttribute("stu", stu);
		return "input";
	}

	@RequestMapping(value = "/home3", method = RequestMethod.POST)
	public String sayHello4(@ModelAttribute("stu") Student stu, BindingResult result, Model model)
	{
		System.out.println(stu.getId() + "   " + stu.getName());
		new StudentValidate().validate(stu, result);
		if (result.hasErrors())
		{
			model.addAttribute("stu", stu);
			return "input";
		}

		model.addAttribute("stu", stu);
		return "home";
	}
}
