package com.ganesh.data;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.ganesh.entity.Product;
import com.ganesh.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class TestData {

	private final ProductRepository repository;

	@PostConstruct
	public void initDB() {
		List<Product> products = IntStream.rangeClosed(1, 200)
				.mapToObj(i -> new Product("product-" + i, new Random().nextInt(100), new Random().nextInt(50000)))
				.collect(Collectors.toList());
		repository.saveAll(products);
	}

}
