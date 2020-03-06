package com.smgeek.gkrpc.codec;

/**
 * 序列化
 *
 * @author liyiruo
 * @data 2020/3/6  1:52 上午
 */
public interface Encoder {
    byte[] encode(Object object);

}
