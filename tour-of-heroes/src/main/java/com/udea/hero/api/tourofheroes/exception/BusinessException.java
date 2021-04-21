package com.udea.hero.api.tourofheroes.exception;

public class BusinessException extends GeneralRuntimeException {
    private static final long serialVersionUID = 1L;

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, String translationKey) {
        super(message, translationKey);
    }

}
