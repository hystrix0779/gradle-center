package com.nlx.center.code;

import com.common.base.model.exception.ErrorCode;

/**
 * @author Tony.niu (hystrix0779@yeah.net)
 * @version V1.0
 * @date 2020/10/10
 **/
public class ResultCode implements ErrorCode {

    public static final ResultCode  SYSTEM_ABNORMALITY= new ResultCode(200000, "系统异常", "系统异常");

    public final int value;
    private final String name;
    private final String info;

    private ResultCode(int value, String name, String info) {
        this.value = value;
        this.name = name;
        this.info = info;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getInfo() {
        return info;
    }
}

