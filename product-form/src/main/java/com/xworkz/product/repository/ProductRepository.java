package com.xworkz.product.repository;

import com.xworkz.product.dto.ProductDTO;

public interface ProductRepository {

    boolean orderAndPay(ProductDTO productDTO);
}
