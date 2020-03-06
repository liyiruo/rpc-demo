package com.smgeek.gkrpc.example;

/**
 * @author liyiruo
 * @data 2020/3/6  3:24 下午
 */
public class CalcServiceImpl implements CalcService {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a-b;
    }

}
