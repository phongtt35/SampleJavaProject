/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.repository;

import edu.poly.entity.Product;
import java.util.List;

/**
 *
 * @author Phong
 */
public interface IProductRepository {
    
    List<Product> findAll();
    
    Product findById(long id);
    
    Product save(Product product);
    
    Product delete(long id);
}
