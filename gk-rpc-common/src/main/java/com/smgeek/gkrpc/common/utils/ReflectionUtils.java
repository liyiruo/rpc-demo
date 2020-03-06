package com.smgeek.gkrpc.common.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/**
 * 反射工具类
 *
 * @author liyiruo
 * @data 2020/3/6  12:48 上午
 */
public class ReflectionUtils {

    /**
     * 根据class创建对象
     *
     * @param clazz 待创建对象的类
     * @return {@link T} 对象的类型
     * @author liyiruo
     * @date 2020/3/6 1:12 上午
     */
    public static <T> T newInstance(Class<T> clazz) {

        try {
            return clazz.newInstance();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * @param clazz
     * @return {{@link Method[]}}
     * @author liyiruo
     * @date 2020/3/6 1:32 上午
     */
    public static Method[] getPublicMethods(Class clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        List<Method> pmethods = new ArrayList<>();
        for (Method m :
                methods) {
            if (Modifier.isPublic(m.getModifiers())) {
                pmethods.add(m);
            }
        }
        return pmethods.toArray(new Method[0]);
    }

    /**
     * @param obj 被调用方法的对象
     * @param method 被调用的方法
     * @param args 方法的参数
     * @return {@link java.lang.Object} 返回的结果
     * @author liyiruo
     * @date 2020/3/6 1:39 上午
     */
    public static Object invoke(Object obj,
                                Method method,
                                Object... args) {
        try {
            return method.invoke(obj, args);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }

    }
}