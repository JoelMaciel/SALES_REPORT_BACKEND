package com.joelmaciel.salesreport.api.dto.validator.impl.product;

import com.joelmaciel.salesreport.api.dto.request.ProductRequestDTO;
import com.joelmaciel.salesreport.api.dto.validator.Validator;
import com.joelmaciel.salesreport.domain.exception.NameAlreadyExistsException;
import com.joelmaciel.salesreport.domain.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class NameAlreadyExistsValidator implements Validator<ProductRequestDTO> {

    private final ProductRepository productRepository;

    @Override
    public void validate(ProductRequestDTO productRequestDTO) {
        if(productRepository.existsByName(productRequestDTO.getName())) {
            throw new NameAlreadyExistsException(productRequestDTO.getName());
        }
    }
}
