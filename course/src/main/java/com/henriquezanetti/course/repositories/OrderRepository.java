package com.henriquezanetti.course.repositories;

import com.henriquezanetti.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
