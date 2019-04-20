package cn.rgq.basetest.api;


import java.lang.annotation.*;


@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ATestCase {
    /**
     * caseName
     * @return
     */
    String name() default "";

    /**
     * caseDesc
     * @return
     */
    String desc() default "";
}
