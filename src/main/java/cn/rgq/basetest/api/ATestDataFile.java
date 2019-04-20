package cn.rgq.basetest.api;


import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ATestDataFile {
    /**
     * filepath
     * @return
     */
    String value() default "";


}
