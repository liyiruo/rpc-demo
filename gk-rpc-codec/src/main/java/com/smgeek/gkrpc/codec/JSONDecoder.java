package com.smgeek.gkrpc.codec;

import com.alibaba.fastjson.JSON;

import javax.xml.crypto.Data;

/**
 * TODO
 *
 * @author liyiruo
 * @data 2020/3/6  1:58 上午
 */
public class JSONDecoder implements Decoder {
    @Override
    public <T> T decode(byte[] bytes, Class<T> clazz) {
        return JSON.parseObject(bytes,clazz);
    }
}
