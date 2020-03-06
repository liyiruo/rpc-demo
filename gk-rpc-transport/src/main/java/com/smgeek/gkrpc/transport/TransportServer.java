package com.smgeek.gkrpc.transport;

/**
 * 1.启动 监听
 * 2.接受请求
 * 3.关闭监听
 * @author liyiruo
 * @data 2020/3/6  2:14 上午
 */
public interface TransportServer {
    void init(int port, RequestHandler handler);
    void start();

    void stop();
}
