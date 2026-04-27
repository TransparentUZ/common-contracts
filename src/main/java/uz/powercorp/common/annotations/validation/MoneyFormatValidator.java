package uz.powercorp.common.annotations.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class MoneyFormatValidator implements ConstraintValidator<MoneyFormat, String> {
    private static final String PATTERN = "^[0-9 .]+$";
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.trim().isEmpty()) {
            return true;
        }
        return value.matches(PATTERN);
    }
}
