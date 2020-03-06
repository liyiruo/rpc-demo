package com.smgeek.gkrpc;

import lombok.Data;

/**
 * 表示PRC的返回
 *
 * @author liyiruo
 * @data 2020/3/6  12:43 上午
 */
@Data
public class Response {
    /**
     * 服务返回编码，0-成功 非0-失败
     */
    private int code=0;
    /**
     * 错误信息
     */
    private String message="ok";
    /**
     * 返回的数据
     */
    private Object data;
}
