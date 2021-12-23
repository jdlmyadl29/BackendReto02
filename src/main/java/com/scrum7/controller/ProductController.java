package com.scrum7.controller;

import com.scrum7.model.Product;
import com.scrum7.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Jeison Hernandez
 */


@RestController
@RequestMapping("/api/cleaningproduct")
public class ProductController {
    @Autowired
    private ProductService servicio;

    @GetMapping("/all")
    public List<Product> listAll() {
        return servicio.listAll();
    }

    @GetMapping("/{reference}")
    public Optional<Product> getAccesory(@PathVariable("reference") String reference) {
        return servicio.getAccesory(reference);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Product create(@RequestBody Product accessory) {
        return servicio.create(accessory);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Product update(@RequestBody Product accessory) {
        return servicio.update(accessory);
    }

    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("reference") String reference) {
        return servicio.delete(reference);
    }
}
