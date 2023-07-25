package com.joelmaciel.salesreport.api.controller;

import com.joelmaciel.salesreport.api.dto.request.ProductRequestDTO;
import com.joelmaciel.salesreport.api.dto.response.ProductDTO;
import com.joelmaciel.salesreport.domain.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductDTO save(@RequestBody @Valid ProductRequestDTO product) {
        return productService.save(product);
    }
}
