package com.test.exception;

import com.test.exception.enums.BaseExceptionEnum;

import java.io.Serializable;

/**
 * @author 赖春任
 * @date 2020/10/10 17:43
 */
public class ExceptionResult implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer code;
    private String msg;
    private Object result;

    public static boolean isSuccess(ExceptionResult response) {
        return response != null && BaseExceptionEnum.SUCCESS.getCode().equals(response.getCode());
    }

    public ExceptionResult() {
        this.code = BaseExceptionEnum.SUCCESS.getCode();
        this.msg = BaseExceptionEnum.SUCCESS.getMsg();
    }

    public ExceptionResult(Integer code, String message) {
        this.code = code;
        this.msg = msg;
    }

    public ExceptionResult(Object result) {
        this.code = BaseExceptionEnum.SUCCESS.getCode();
        this.msg = BaseExceptionEnum.SUCCESS.getMsg();
        this.result = result;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
