package com.xworkz.product.service;

import com.xworkz.product.dto.ProductDTO;

public interface ProductService {
    boolean orderAndPay(ProductDTO dto);
}