package com.test.exception.enums;

/**
 * @author 赖春任
 * @date 2020/10/10 17:39
 */
public enum BaseExceptionEnum {
    SUCCESS(0, "请求成功"),
    SYSTEM_BUSY(100, "系统繁忙"),
    REQUEST_TIME_OUT(300, "请求超时"),
    PARAMETER_ERROR(400, "参数错误"),
    NETWORK_ERROR(404, "网络异常"),
    DATA_NOT_EXISTS(600, "数据不存在"),
    FAILURE(999, "未知错误");

    private Integer code;
    private String msg;

    BaseExceptionEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
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
}
