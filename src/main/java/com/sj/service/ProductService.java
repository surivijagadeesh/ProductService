package com.sj.service;

import java.util.List;

import com.sj.Model.ProductResponse;
import com.sj.entity.Product;

public interface ProductService {

	Product createProduct(Product product);

	ProductResponse getProductById(Long id);

	List<Product> getProducts();

	Product updateProducts(Long id, Product request);

	Product updateProductByPatch(Long id, Product request);

	boolean deleteProduct(Long id);

	List<Product> convertJsonToProductList(String jsonString);

}
