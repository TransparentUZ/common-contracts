package uz.powercorp.common.annotations.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = MoneyFormatValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MoneyFormat {
    String message() default "Invalid money format. Only digits, spaces, and '.' are allowed";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
