/******************************************************************************
 * Copyright (C) 2015 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 ******************************************************************************/

package com.xieyang.spring.learn;

import org.junit.Test;
import org.springframework.util.Assert;

/**
 * Assert的使用
 * 
 * <p>
 * Spring 通过Assert来检验传入参数正确性
 * </p>
 * 
 * 
 * @author 谢阳
 * @since 1.0
 * @version 2015年10月13日 谢阳
 */
public class AssertTest {
    
    @Test
    public void testIsNull() {
        Assert.isNull(new Object());
    }
}
