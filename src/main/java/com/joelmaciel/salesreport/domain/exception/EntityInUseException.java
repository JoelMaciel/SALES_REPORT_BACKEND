package com.joelmaciel.salesreport.domain.exception;

public abstract class  EntityInUseException extends BusinessException{

    public EntityInUseException(String message) {
        super(message);
    }
}
