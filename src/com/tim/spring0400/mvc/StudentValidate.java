package com.tim.spring0400.mvc;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.tim.spring0400.model.Student;


public class StudentValidate implements Validator
{

	@Override
	public boolean supports(Class<?> arg0)
	{
		return Student.class.equals(arg0);
	}

	@Override
	public void validate(Object arg0, Errors error)
	{
		Student s = (Student) arg0;
		if (s.getId() == 2)
		{
			error.rejectValue("id", "error.num", "defaultValueID");
		}
		if (s.getName().length() < 3)
		{
			error.rejectValue("name", "name length error", "defaultValueName");
		}
	}

}
