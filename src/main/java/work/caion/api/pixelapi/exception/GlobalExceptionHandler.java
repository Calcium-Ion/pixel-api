package work.caion.api.pixelapi.exception;

import cn.hutool.core.exceptions.ExceptionUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import work.caion.api.pixelapi.result.Result;
import work.caion.api.pixelapi.result.Results;
import work.caion.api.pixelapi.type.EnumCode;

import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {


    @ExceptionHandler
    public Result exceptionHandler(Throwable throwable) {

        log.error(ExceptionUtil.stacktraceToString(throwable));
        if (throwable instanceof ServiceException) {
            return Results.fromCode(((ServiceException) throwable).code);
        } else if (throwable instanceof NoRouteToHostException || throwable instanceof SocketTimeoutException) {
            return Results.fromCode(EnumCode.CANNOT_CONNECT);
        }
        return Results.fromCode(EnumCode.UNKNOWN);
    }
}
