package com.smgeek.gkrpc.common.utils;

import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

/**
 * TODO
 *
 * @author liyiruo
 * @data 2020/3/6  1:42 上午
 */
public class ReflectionUtilsTest {

    @Test
    public void newInstance() {
        TestClass t = ReflectionUtils.newInstance(TestClass.class);
        assertNotNull(t);
    }

    @Test
    public void getPublicMethods() {
        Method[] publicMethods = ReflectionUtils.getPublicMethods(TestClass.class);
        assertEquals(1,publicMethods.length);
        String mname=publicMethods[0].getName();
        assertEquals("b",mname);
    }

    @Test
    public void invoke() {
        Method[] publicMethods = ReflectionUtils.getPublicMethods(TestClass.class);
        Method b = publicMethods[0];

        TestClass t=new TestClass();
        Object r = ReflectionUtils.invoke(t, b);
        assertEquals("b", r);

    }
}