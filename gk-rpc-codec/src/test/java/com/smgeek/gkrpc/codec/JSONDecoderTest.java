package com.smgeek.gkrpc.codec;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author liyiruo
 * @data 2020/3/6  2:03 上午
 */
public class JSONDecoderTest {

    @Test
    public void decode() {

        Encoder encoder=new JSONEncoder();
        TestBean bean=new TestBean();
        bean.setAge(20);
        bean.setName("bean");
        byte[] bytes = encoder.encode(bean);


        Decoder decoder=new JSONDecoder();
        TestBean testBean = decoder.decode(bytes, TestBean.class);
        assertEquals(20,testBean.getAge());
        assertEquals("bean",testBean.getName());

    }
}