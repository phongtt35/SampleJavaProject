/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.service;

import edu.poly.entity.Product;
import java.util.List;

/**
 *
 * @author Phong
 */
public interface IManageProductService {
    
    List<Product> listAllProduct();
    
    Product getProductById(long id);
    
    Product createNewProduct(Product product);
    
    Product updateProductById(Product product);
    
    Product deleteProductById(long id);
}
