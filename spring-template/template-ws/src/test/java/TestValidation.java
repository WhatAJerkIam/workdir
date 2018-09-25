import org.apache.commons.lang3.builder.ToStringBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import yj.spring.template.validator.ValidReq2;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring-servlet.xml")
public class TestValidation {
   static Logger logger = LoggerFactory.getLogger(TestValidation.class);

    private static Validator validator;

    @BeforeClass
    public static void setUpValidator() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
        logger.info(validator.getClass().getName());
    }

    @Test
    public void test(){
        ValidReq2 r = new ValidReq2();
        Set<ConstraintViolation<ValidReq2>> constraintViolations = validator.validate( r );
        for(ConstraintViolation<ValidReq2> t : constraintViolations){
            logger.info(ToStringBuilder.reflectionToString(t));
        }
    }

}
