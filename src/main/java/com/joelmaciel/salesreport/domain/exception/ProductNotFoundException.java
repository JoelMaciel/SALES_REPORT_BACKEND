package com.joelmaciel.salesreport.domain.exception;

public class ProductNotFoundException extends EntityNotExistsException{
    public ProductNotFoundException(Long productId) {
        super(String.format("There is no register of product with code %d", productId));
    }
}
