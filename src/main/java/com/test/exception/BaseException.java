package com.test.exception;

import com.test.exception.enums.BaseExceptionEnum;

/**
 * @author 赖春任
 * @date 2020/10/10 17:37
 */
public class BaseException extends RuntimeException {
    private static final long serialVersionUID = 194906846739586857L;

    private int code;

    private String msg;


    public BaseException(String msg) {
        super(msg);
    }

    public BaseException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public BaseException(BaseExceptionEnum baseExceptionEnum) {
        super(baseExceptionEnum.getMsg());
        this.msg = baseExceptionEnum.getMsg();
        this.code = baseExceptionEnum.getCode();
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
