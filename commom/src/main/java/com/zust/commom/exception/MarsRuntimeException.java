package com.zust.commom.exception;


public class MarsRuntimeException extends RuntimeException {

    private Integer errorCode;
    private String errorName;
    private String errorMessage;

    private static final long serialVersionUID = 1L;

    public MarsRuntimeException() {
    }

    public MarsRuntimeException(String message) {
        super(message);
    }

    public MarsRuntimeException(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public MarsRuntimeException(Throwable cause) {
        super(cause);
    }


    public MarsRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getErrorName() {
        return errorName;
    }

    public void setErrorName(String errorName) {
        this.errorName = errorName;
    }
}
