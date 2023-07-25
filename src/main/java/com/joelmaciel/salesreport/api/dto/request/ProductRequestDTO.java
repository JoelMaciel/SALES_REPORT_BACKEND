package com.joelmaciel.salesreport.api.dto.request;

import com.joelmaciel.salesreport.domain.model.Product;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;

@Builder
@Getter
@Setter
public class ProductRequestDTO {

    @NotBlank
    private String name;
    @NotBlank
    private String description;
    @PositiveOrZero
    @NotNull
    private BigDecimal price;
    @NotBlank
    private String sku;

    public static Product toModel(ProductRequestDTO product) {
        return Product.builder()
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .sku(product.getSku())
                .build();
    }
}
