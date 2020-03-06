package com.smgeek.gkrpc.transport;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * 处理网络请求的handler
 * @author liyiruo
 * @data 2020/3/6  2:15 上午
 */
public interface RequestHandler {
    void onRequest(InputStream recive, OutputStream toResp);
}
