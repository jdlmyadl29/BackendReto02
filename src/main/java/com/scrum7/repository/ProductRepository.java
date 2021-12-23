package com.scrum7.repository;

import com.scrum7.model.Product;
import com.scrum7.repositoryCrud.ProductCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Jeison Hernandez
 */

@Repository
public class ProductRepository {

    @Autowired
    private ProductCrudRepository crudInterface;

    public List<Product> listAll() {
        return crudInterface.findAll();
    }

    public Optional<Product> getAccesory(String reference) {
        return crudInterface.findById(reference);
    }

    public Product create(Product accesory) {
        return crudInterface.save(accesory);
    }

    public void update(Product accesory) {
        crudInterface.save(accesory);
    }

    public void delete(Product accesory) {
        crudInterface.delete(accesory);
    }
}
