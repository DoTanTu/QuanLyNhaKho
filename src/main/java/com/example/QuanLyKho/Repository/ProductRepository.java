package com.example.QuanLyKho.Repository;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<ProductRepository, Integer> {
    List<ProductRepository> findByNameContaining(String term);
}
