/* 
 * A.java  
 * 
 * version TODO
 *
 * 2015年10月8日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zcbspay.platform.instead.utils.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.zcbspay.platform.instead.utils.validator.impl.SImpl;

/**
 * Class Description
 *
 * @author yangpeng
 * @version
 * @date 2015年10月8日 下午7:42:58
 * @since 
 */
/* 
 * aa.java  
 * 
 * version TODO
 *
 * 2015年10月8日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
/**
 * Class Description
 *
 * @author yangpeng
 * @version
 * @date 2015年10月8日 下午6:27:17
 * @since
 */

@Constraint(validatedBy = SImpl.class) // 具体的实现
@Target({ java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD })
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Documented
public @interface S {
	String message() default "{域格式错误：域不符合规范}"; // 提示信息,可以写死,可以填写国际化的key

	int min() default 0;

	int max() default Integer.MAX_VALUE;

	boolean isNull() default false;

	// 下面这两个属性必须添加
	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}