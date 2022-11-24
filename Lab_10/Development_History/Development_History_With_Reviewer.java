package org.example;

import java.lang.annotation.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface Development_History_With_Reviewer
{

/*    int version() default 1;

    String tester() default "";

    String developer() default "";*/

    Development_History development_history();

    String[] reviewers() default {};
}
