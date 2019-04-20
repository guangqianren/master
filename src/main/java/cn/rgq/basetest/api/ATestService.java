package cn.rgq.basetest.api;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ATestService {
    /**
     *  serviceName
     *  @return
     */
    String name() default "";

    /**
     *  module
     *  @return
     */
    String  module() default "";

    /**
     * methodName
     * @return
     */
    String method() default "";

    /**
     * value
     * @return
     */
    String value() default "";
}
