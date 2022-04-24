package com.zouma.api.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author maogf
 * @description Excel的功能注解
 * @date 2022/4/24 15:42
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ExcelField {

    /**
     * 对应列的索引
     * @return 列的索引
     */
    int index() default 0;

    /**
     * 对应列的名称,如id对应的名称为序号
     * @return 列的名称
     */
    String title() default "";

}
