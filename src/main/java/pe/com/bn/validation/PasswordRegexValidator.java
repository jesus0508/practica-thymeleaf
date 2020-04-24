package pe.com.bn.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordRegexValidator implements ConstraintValidator<PasswordRegex, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return value.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])([A-Za-z\\d$@$!%*?&]|[^ ]){8,15}$");
	}

}