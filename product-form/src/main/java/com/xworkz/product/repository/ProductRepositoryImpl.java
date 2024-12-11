package com.xworkz.product.repository;

import com.xworkz.product.dto.ProductDTO;
import com.xworkz.product.service.ProductService;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    @Override
    public boolean orderAndPay(ProductDTO productDTO) {
        return true;
    }
}
