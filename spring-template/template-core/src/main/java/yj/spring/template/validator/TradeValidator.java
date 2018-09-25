package yj.spring.template.validator;

import org.apache.commons.lang3.StringUtils;
import yj.spring.template.req.ValidReq;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class TradeValidator implements ConstraintValidator<ValidTrade , ValidReq> {

    @Override public void initialize(ValidTrade constraintAnnotation) {

    }

    @Override public boolean isValid(ValidReq value, ConstraintValidatorContext context) {
        if(value == null){
            return false;
        }

        boolean isValid = StringUtils.isNoneBlank(value.getTradeNo());
        if ( !isValid ) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(
                    "{org.hibernate.validator.referenceguide.chapter06." +
                            "constraintvalidatorcontext.CheckCase.message}"
            ).addConstraintViolation();
        }
        return isValid;
    }
}
