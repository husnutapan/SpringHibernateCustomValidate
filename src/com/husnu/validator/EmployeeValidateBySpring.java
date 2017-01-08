package com.husnu.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.husnu.model.Employee;

public class EmployeeValidateBySpring implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		return Employee.class.equals(arg0);
	}

	@Override
	public void validate(Object employeeObject, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "id.required");

		Employee employee = (Employee) employeeObject;

		if (employee.getId() <= 0) {
			errors.rejectValue("id", "negativeValue", new Object[] { "'id'" }, "id can't be negative");
		}

		if (employee.getSalary() <= 100) {
			errors.rejectValue("id", "notAcceptableSalary", new Object[] { "'salary'" }, "This salary not acceptable.");
		}

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name.required");
	}

}
