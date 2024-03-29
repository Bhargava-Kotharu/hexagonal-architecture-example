package com.bkotharu.hexagonal.service;

import java.util.List;

import com.bkotharu.hexagonal.domain.Product;

/**
 * Core Business Logic exposed through a service.
 * 
 * @author bhargavakotharu
 *
 */
public interface IProductService {

	public Product getProduct(Integer id);

	public List<Product> getProducts();

	public void createProduct(Product product);
}
