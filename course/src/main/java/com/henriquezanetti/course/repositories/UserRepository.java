package com.henriquezanetti.course.repositories;

import com.henriquezanetti.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
