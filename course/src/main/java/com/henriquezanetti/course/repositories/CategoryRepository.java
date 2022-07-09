package com.henriquezanetti.course.repositories;

import com.henriquezanetti.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
