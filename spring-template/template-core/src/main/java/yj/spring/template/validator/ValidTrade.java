package yj.spring.template.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target( {ElementType.TYPE, ElementType.ANNOTATION_TYPE} )
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { TradeValidator.class })
@Documented
public @interface ValidTrade {

    String message() default "11111";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
