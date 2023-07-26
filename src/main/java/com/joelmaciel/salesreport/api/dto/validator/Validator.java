package com.joelmaciel.salesreport.api.dto.validator;

public interface Validator<E> {
    void validate(E e);
}
