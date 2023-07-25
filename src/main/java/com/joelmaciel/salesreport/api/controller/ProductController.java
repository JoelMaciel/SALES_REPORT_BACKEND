package com.joelmaciel.salesreport.api.controller;

import com.joelmaciel.salesreport.api.controller.dto.request.ProductRequestDTO;
import com.joelmaciel.salesreport.api.controller.dto.response.ProductDTO;
import com.joelmaciel.salesreport.domain.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ProductDTO save(@RequestBody @Valid ProductRequestDTO product) {
        return productService.save(product);
    }
}
