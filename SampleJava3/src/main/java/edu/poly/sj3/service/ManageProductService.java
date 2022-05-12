/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.sj3.service;

import edu.poly.sj3.entity.Product;
import edu.poly.sj3.repository.IProductRepository;
import edu.poly.sj3.repository.ProductRepository;
import java.util.List;

/**
 *
 * @author Phong
 */
public class ManageProductService implements IManageProductService {

    private final IProductRepository repository;
    
    public ManageProductService() {
        repository = new ProductRepository();
    }
    
    @Override
    public List<Product> getProducts(int position, int pageSize) {
        return repository.findAll(position, pageSize);
    }

    @Override
    public Product getProductById(long id) {
        return repository.findById(id);
    }

    @Override
    public Product createNewProduct(Product product) {
        product.setId(null);
        return repository.save(product);
    }

    @Override
    public Product updateProductById(Product product) {
        return repository.save(product);
    }

    @Override
    public long deleteProductById(long id) {
        return repository.delete(id);
    }

    @Override
    public long countAllProducts() {
        return repository.totalCount();
    }
    
}
