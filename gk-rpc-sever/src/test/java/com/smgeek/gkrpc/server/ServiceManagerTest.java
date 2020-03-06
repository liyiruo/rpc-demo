package com.smgeek.gkrpc.server;

import com.smgeek.gkrpc.Request;
import com.smgeek.gkrpc.ServiceDescriptor;
import com.smgeek.gkrpc.common.utils.ReflectionUtils;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

/**
 * @author liyiruo
 * @data 2020/3/6  12:42 下午
 */
public class ServiceManagerTest {
ServiceManager sm;

    @Before
    public void init() {
        sm=new ServiceManager();
        TestInterface bean=new TestClass();
        sm.register(TestInterface.class,bean);
    }
    @Test
    public void register() {
        TestInterface bean=new TestClass();
        sm.register(TestInterface.class,bean);
    }

    @Test
    public void lookup() {
        Method method = ReflectionUtils.getPublicMethods(TestInterface.class)[0];
        ServiceDescriptor sdp = ServiceDescriptor.from(TestInterface.class,method);
        Request request=new Request();
        request.setService(sdp);
        sm.lookup(request);

        ServiceInstance sis=sm.lookup(request);
        assertNotNull(sis);
    }
}