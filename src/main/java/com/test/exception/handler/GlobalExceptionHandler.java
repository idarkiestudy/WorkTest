package com.test.exception.handler;

import com.test.exception.BaseException;
import com.test.exception.ExceptionResult;
import com.test.exception.enums.BaseExceptionEnum;
import org.apache.log4j.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 赖春任
 * @date 2020/10/10 17:40
 */
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {
    private Logger logger = Logger.getLogger(this.getClass());

    public GlobalExceptionHandler() {
    }

    @ExceptionHandler({Exception.class})
    public ExceptionResult allExceptionHandler(Exception exception) {
        ExceptionResult exceptionResult = new ExceptionResult();
        if (exception instanceof BaseException) {
            exceptionResult.setCode(((BaseException) exception).getCode());
            exceptionResult.setMsg(((BaseException) exception).getMsg());
        } else {
            exceptionResult.setCode(BaseExceptionEnum.PARAMETER_ERROR.getCode());
            exceptionResult.setMsg(BaseExceptionEnum.PARAMETER_ERROR.getMsg());
        }
        this.logger.error(exception.getMessage(), exception);
        return exceptionResult;
    }
}
