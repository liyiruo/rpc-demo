package com.smgeek.gkrpc.client;

import com.smgeek.gkrpc.Peer;
import com.smgeek.gkrpc.transport.TransportClient;

import java.util.List;

/**
 * 表示选择那个server 去连接
 *
 * @author liyiruo
 * @data 2020/3/6  1:41 下午
 */
public interface TransportSelector {
    /**
     * 初始化 selector
     * @param peers 可以连接的server端点信息
     * @param count client与server 建立多少个连接
     * @param clazz client 时间class
     * @author liyiruo
     * @date 2020/3/6 1:50 下午
     */
    void init(List<Peer> peers,
              int count,
              Class<? extends TransportClient> clazz);

    /**
     * 选择一个transport 与server做交互
     *
     * @return {{@link com.smgeek.gkrpc.transport.TransportClient}}
     * @author liyiruo
     * @date 2020/3/6 1:45 下午
     */
    TransportClient select();

    /**
     * 释放用完的client
     *
     * @param client
     */
    void release(TransportClient client);


    void close();
}
