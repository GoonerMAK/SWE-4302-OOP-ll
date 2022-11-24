package org.example;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface Development_History
{
    int version() default 1;
    String tester() default "";
    String developer() default "";
}


