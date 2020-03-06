package com.smgeek.gkrpc.example;

import com.smgeek.gkrpc.server.RpcServer;
import com.smgeek.gkrpc.server.RpcServerConfig;

/**
 * @author liyiruo
 * @data 2020/3/6  3:32 下午
 */
public class Server {
    public static void main(String[] args) {
        RpcServer server = new RpcServer(new RpcServerConfig());
        server.register(CalcService.class,new CalcServiceImpl());
        server.start();
    }
}
