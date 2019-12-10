package com.bkotharu.hexagonal.service;

import org.springframework.stereotype.Service;

import com.bkotharu.hexagonal.domain.Product;

/**
 * Core Business Logic exposed through a service.
 * 
 * @author bhargavakotharu
 *
 */
@Service
public interface IProductService {

	public Product getProduct(Integer id);

	public Product[] getProducts();

	public void createProduct(Product product);
}
