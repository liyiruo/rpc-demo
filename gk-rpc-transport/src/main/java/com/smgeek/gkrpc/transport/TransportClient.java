package com.smgeek.gkrpc.transport;

import com.smgeek.gkrpc.Peer;

import java.io.InputStream;

/**
 * 1.创建连接
 * 2.发送数据 并且等待响应
 * 3.关闭连接
 * @author liyiruo
 * @data 2020/3/6  2:11 上午
 */
public interface TransportClient {
    void connect(Peer peer);

    InputStream write(InputStream data);

    void close();
}
