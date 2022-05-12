/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.sj3.repository;

import edu.poly.sj3.entity.Category;
import edu.poly.sj3.repository.utils.JpaUtils;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Phong
 */
public class CategoryRepository implements ICategoryRepository {

    @Override
    public List<Category> findAll() {
        List<Category> categories;
        EntityManager em = JpaUtils.getEntityManager();
        String hql = "SELECT c FROM Category c";
        TypedQuery<Category> query = em.createQuery(hql, Category.class);
        categories = query.getResultList();
        return categories;
    }

}
