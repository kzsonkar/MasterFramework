package com.karan.annotations;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.karan.enums.CategoryType;

@Retention(RUNTIME)
@Target(METHOD)
@Documented
public @interface FrameworkAnnotation {
	/**
	 * Store the authors who created the tests in String[]
	 * Manadatory to enter atleast a value
	 */
	public String[] author();
	
	/**
	 * Stores the category in form of Enum Array. Include the possible values in {@link com.tmb.enums.CategoryType}
	 */
	public CategoryType[] category();

}
