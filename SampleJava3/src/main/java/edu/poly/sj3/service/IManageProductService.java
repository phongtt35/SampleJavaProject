/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.sj3.service;

import edu.poly.sj3.entity.Product;
import java.util.List;

/**
 *
 * @author Phong
 */
public interface IManageProductService {
    
    List<Product> getProducts(int position, int pageSize);
    
    Product getProductById(long id);
    
    Product createNewProduct(Product product);
    
    Product updateProductById(Product product);
    
    long deleteProductById(long id);
    
    long countAllProducts();
}
