package task06_07_inner_classes_and_annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.sql.Date;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotationForClass {
    String author() default "Vera Ivanova";
    int currentRevision() default 1;
}
