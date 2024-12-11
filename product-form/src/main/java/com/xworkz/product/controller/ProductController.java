package com.xworkz.product.controller;

import com.xworkz.product.dto.ProductDTO;
import com.xworkz.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class ProductController {

    @Autowired
    private ProductService productService;

    ProductController(){
        System.out.println("No-arg const ProductController");
    }

    //@RequestMapping(value ="/save",method = {RequestMethod.POST})
    @PostMapping("/save")
    public String product(ProductDTO productDTO, Model model){
        System.out.println("Running product");
        System.out.println(productDTO);
        if(this.productService.orderAndPay(productDTO))
        {
            System.out.println("Saved");
            model.addAttribute("message","Product Details");
            model.addAttribute("message","Saved");
            model.addAttribute( "productDTO",productDTO);
            return "ProductSuccess.jsp";
        }
        else{
            System.out.println("Not saved");
            model.addAttribute("productDTO",productDTO);
            model.addAttribute("message","Not saved");
        }
        return "Product.jsp";
    }
}
