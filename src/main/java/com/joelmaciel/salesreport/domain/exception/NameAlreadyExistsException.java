package com.joelmaciel.salesreport.domain.exception;

public class NameAlreadyExistsException extends EntityInUseException {
    public NameAlreadyExistsException(String name) {
        super(String.format("There is already a product registered with that name %s", name));
    }
}
