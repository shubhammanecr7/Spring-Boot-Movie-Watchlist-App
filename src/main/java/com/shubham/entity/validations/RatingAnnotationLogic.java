package com.shubham.entity.validations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class RatingAnnotationLogic implements ConstraintValidator<Rating, Float> {

	@Override
	public boolean isValid(Float value, ConstraintValidatorContext context) {
		return value >= 5 && value <= 10;
	}

}
