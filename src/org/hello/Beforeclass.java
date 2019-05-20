package org.hello;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Target;

@Target({ METHOD, ANNOTATION_TYPE })
public @interface Beforeclass {

}
