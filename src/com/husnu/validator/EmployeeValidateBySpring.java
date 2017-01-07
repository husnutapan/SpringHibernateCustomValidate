package com.husnu.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.husnu.model.Employee;

public class EmployeeValidateBySpring implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		return Employee.class.equals(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {

	}

}
