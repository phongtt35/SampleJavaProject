/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.sj3.repository;

import edu.poly.sj3.entity.Category;
import java.util.List;

/**
 *
 * @author Phong
 */
public interface ICategoryRepository {
    
    List<Category> findAll();
}
