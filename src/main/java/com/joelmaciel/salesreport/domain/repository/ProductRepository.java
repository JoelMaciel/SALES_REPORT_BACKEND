package com.joelmaciel.salesreport.domain.repository;

import com.joelmaciel.salesreport.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    boolean existsBySku(String sku);

    boolean existsByName(String sku);
}
