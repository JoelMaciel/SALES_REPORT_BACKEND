package com.joelmaciel.salesreport.domain.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Product {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private BigDecimal price;
    @Column
    private String sku;
    @CreationTimestamp
    private OffsetDateTime creationDate;
    @UpdateTimestamp
    private OffsetDateTime updateDate;
}
