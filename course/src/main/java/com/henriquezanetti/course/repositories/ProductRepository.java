package com.henriquezanetti.course.repositories;

import com.henriquezanetti.course.entities.Category;
import com.henriquezanetti.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
