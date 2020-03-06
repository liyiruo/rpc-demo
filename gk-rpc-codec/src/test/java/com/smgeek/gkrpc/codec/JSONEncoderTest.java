package com.smgeek.gkrpc.codec;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * TODO
 *
 * @author liyiruo
 * @data 2020/3/6  2:00 上午
 */
public class JSONEncoderTest {

    @Test
    public void encode() {

        Encoder encoder=new JSONEncoder();
        TestBean bean=new TestBean();
        bean.setAge(20);
        bean.setName("bean");
        byte[] bytes = encoder.encode(bean);
        assertNotNull(bytes);
    }
}