package com.xworkz.product.service;

import com.xworkz.product.dto.ProductDTO;
import com.xworkz.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public boolean orderAndPay(ProductDTO dto) {
            System.out.println("Running save in ProductServiceImpl");

            Boolean saved=this.productRepository.orderAndPay(dto);
            System.out.println("Saved from DB:"+saved);

        return saved;
    }
}
