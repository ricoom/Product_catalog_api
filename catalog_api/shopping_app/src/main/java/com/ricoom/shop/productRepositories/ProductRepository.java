package com.ricoom.shop.productRepositories;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.hibernate.query.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ricoom.shop.models.Category;
import com.ricoom.shop.models.Product;
public interface ProductRepository extends JpaRepository<Product, Long> {
List<Product> findBycategory(Category category);



}
