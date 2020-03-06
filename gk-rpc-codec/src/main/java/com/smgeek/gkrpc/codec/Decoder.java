package com.smgeek.gkrpc.codec;

/**
 * 反序列化
 *
 * @author liyiruo
 * @data 2020/3/6  1:53 上午
 */
public interface Decoder {
    <T> T decode(byte[] bytes, Class<T> clazz);
}
