package com.husnu.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneNumberValidate implements ConstraintValidator<PhoneNumber, String> {

	@Override
	public void initialize(PhoneNumber arg0) {

	}

	@Override
	public boolean isValid(String phoneNumber, ConstraintValidatorContext arg1) {

		if (phoneNumber == null) {
			return false;
		}
		if (phoneNumber.matches("\\d{10}")) {
			return true;
		} else if (phoneNumber.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) {
			return true;
		} else if (phoneNumber.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}")) {
			return true;
		} else if (phoneNumber.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")) {
			return true;
		} else
			return false;

	}

}
