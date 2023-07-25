package com.joelmaciel.salesreport.api.dto.response;

import com.joelmaciel.salesreport.domain.model.Product;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
public class ProductDTO {

    private String name;
    private String description;
    private BigDecimal price;
    private String sku;

    public static ProductDTO toDTO(Product product) {
        return ProductDTO.builder()
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .sku(product.getSku())
                .build();
    }
}
