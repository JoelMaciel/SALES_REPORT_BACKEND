package com.joelmaciel.salesreport.domain.service;

import com.joelmaciel.salesreport.api.dto.request.ProductRequestDTO;
import com.joelmaciel.salesreport.api.dto.response.ProductDTO;
import com.joelmaciel.salesreport.domain.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductDTO save(ProductRequestDTO product) {
        return ProductDTO.toDTO(productRepository.save(ProductRequestDTO.toModel(product))) ;

    }
}
