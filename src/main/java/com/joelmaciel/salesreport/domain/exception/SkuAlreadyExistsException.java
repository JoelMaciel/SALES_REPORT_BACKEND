package com.joelmaciel.salesreport.domain.exception;

public class SkuAlreadyExistsException extends EntityInUseException {

    public SkuAlreadyExistsException(String sku) {
        super(String.format("There is already a product registered with that SKU %s", sku));
    }
}
