package com.shubham.entity.validations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PriorityAnnotationLogic implements ConstraintValidator<Priority, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// L-Low, M-Medium, H-High.
		return value.trim().length()==1 && "LMH".contains(value.trim());
	}

}
