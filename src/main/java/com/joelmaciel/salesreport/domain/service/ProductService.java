package com.joelmaciel.salesreport.domain.service;

import com.joelmaciel.salesreport.api.dto.request.ProductRequestDTO;
import com.joelmaciel.salesreport.api.dto.response.ProductDTO;
import com.joelmaciel.salesreport.api.dto.validator.Validator;
import com.joelmaciel.salesreport.domain.exception.ProductNotFoundException;
import com.joelmaciel.salesreport.domain.model.Product;
import com.joelmaciel.salesreport.domain.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final List<Validator<ProductRequestDTO>> productValidator;

    @Transactional
    public ProductDTO save(ProductRequestDTO product) {
        productValidator.forEach(validator -> validator.validate(product));
        return ProductDTO.toDTO(productRepository.save(ProductRequestDTO.toModel(product)));

    }

    @Transactional
    public ProductDTO update(Long productId, ProductRequestDTO productUpdate) {
        productValidator.forEach(validator -> validator.validate(productUpdate));
        var product = searchById(productId)
                .toBuilder()
                .name(productUpdate.getName())
                .description(productUpdate.getDescription())
                .price(productUpdate.getPrice())
                .sku(productUpdate.getSku())
                .build();
        return ProductDTO.toDTO(productRepository.save(product));
    }

    public Product searchById(Long productId) {
        return productRepository.findById(productId)
                .orElseThrow(() -> new ProductNotFoundException(productId));
    }
}
