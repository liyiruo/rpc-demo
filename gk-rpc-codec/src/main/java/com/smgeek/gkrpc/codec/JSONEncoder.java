package com.smgeek.gkrpc.codec;

import com.alibaba.fastjson.JSON;

/**
 * 基于json的序列化实现
 *
 * @author liyiruo
 * @data 2020/3/6  1:56 上午
 */
public class JSONEncoder implements Encoder {
    @Override
    public byte[] encode(Object object) {
        return JSON.toJSONBytes(object);
    }
}
