package task06_07_inner_classes_and_annotations;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotationForMethod {
    String description() default "Это метод";
}
