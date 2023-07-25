package com.joelmaciel.salesreport.api.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.joelmaciel.salesreport.domain.model.Product;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Builder
@Getter
@Setter
public class ProductDTO {

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private String sku;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private OffsetDateTime creationDate;

    public static ProductDTO toDTO(Product product) {
        return ProductDTO.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .sku(product.getSku())
                .creationDate(product.getCreationDate())
                .build();
    }
}
