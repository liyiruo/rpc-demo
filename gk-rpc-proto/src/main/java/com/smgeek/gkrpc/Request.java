package com.smgeek.gkrpc;

import lombok.Data;

/**
 * TODO
 *
 * @author liyiruo
 * @data 2020/3/6  12:42 上午
 */
@Data
public class Request {
    private ServiceDescriptor service;
    private Object[] parameters;
}
