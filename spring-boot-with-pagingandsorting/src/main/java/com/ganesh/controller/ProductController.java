package com.ganesh.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ganesh.dto.ProductResponce;
import com.ganesh.entity.Product;
import com.ganesh.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
	
	private final ProductService service;
	
	@GetMapping
    private ProductResponce<List<Product>> getProducts() {
        List<Product> allProducts = service.findAllProducts();
        return new ProductResponce<>(allProducts.size(), allProducts);
    }

    @GetMapping("/{field}")
    private ProductResponce<List<Product>> getProductsWithSort(@PathVariable String field) {
        List<Product> allProducts = service.findProductsWithSorting(field);
        return new ProductResponce<>(allProducts.size(), allProducts);
    }

    @GetMapping("/pagination/{offset}/{pageSize}")
    private ProductResponce<Page<Product>> getProductsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
        Page<Product> productsWithPagination = service.findProductsWithPagination(offset, pageSize);
        return new ProductResponce<>(productsWithPagination.getSize(), productsWithPagination);
    }

    @GetMapping("/paginationAndSort/{offset}/{pageSize}/{field}")
    private ProductResponce<Page<Product>> getProductsWithPaginationAndSort(@PathVariable int offset, @PathVariable int pageSize,@PathVariable String field) {
        Page<Product> productsWithPagination = service.findProductsWithPaginationAndSorting(offset, pageSize, field);
        return new ProductResponce<>(productsWithPagination.getSize(), productsWithPagination);
    }
    

}
