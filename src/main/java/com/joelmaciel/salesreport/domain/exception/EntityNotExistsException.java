package com.joelmaciel.salesreport.domain.exception;

public abstract class EntityNotExistsException extends RuntimeException{

    public EntityNotExistsException(String message) {
        super(message);
    }
}
