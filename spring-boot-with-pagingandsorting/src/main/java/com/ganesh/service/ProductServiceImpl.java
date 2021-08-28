package com.ganesh.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ganesh.entity.Product;
import com.ganesh.repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
	
	private final ProductRepository prodRepo;

	@Override
	public List<Product> findAllProducts() {
		log.info("---------------------------------- "+ "{findAllProducts}");
		return prodRepo.findAll();
	}

	@Override
	public List<Product> findProductsWithSorting(String field) {
		log.info("--------------------------- "+ "{findProductsWithSorting}"); 
		return prodRepo.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	

	@Override
	public Page<Product> findProductsWithPagination(int offset, int pageSize) {
		log.info("--------------------------- "+ "{findProductsWithPagination}");
		return  prodRepo.findAll(PageRequest.of(offset, pageSize));
	}

	@Override
	public Page<Product> findProductsWithPaginationAndSorting(int offset, int pageSize, String field) {
		log.info("--------------------------- "+ "{findProductsWithPaginationAndSorting}");
		return  prodRepo.findAll(PageRequest.of(offset, pageSize).withSort(Sort.by(field)));
	}

}
