package com.durga.day63_AnnotationsBase64Encoding;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
@Retention(RetentionPolicy.RUNTIME)  // Annotation is available at runtime

@Target({ElementType.TYPE, ElementType.METHOD})  // Can be used on classes and methods
public @interface Author {
    String name();

    String date();

}
