package com.re.hackathong.ss5.repository;

import com.re.hackathong.ss5.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product , Long> {
}
