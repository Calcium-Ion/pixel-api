package work.caion.api.pixelapi.exception;

import work.caion.api.pixelapi.type.EnumCode;

public class ServiceException extends RuntimeException {

    EnumCode code;

    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
        code = EnumCode.UNKNOWN;
    }

    public ServiceException(EnumCode code) {
        super(code.getDesc());
        this.code = code;
    }
}
