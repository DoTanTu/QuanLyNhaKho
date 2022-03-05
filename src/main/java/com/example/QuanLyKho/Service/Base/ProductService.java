package com.example.QuanLyKho.Service.Base;

import com.example.QuanLyKho.Entity.EmployeeEntity;
import com.example.QuanLyKho.Entity.ProductEntity;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Iterable<EmployeeEntity> findAll();

    List<ProductEntity> search(String term);

    Optional<ProductEntity> findOne(Integer id);

    void save(ProductEntity productEntity);

    void delete(Integer id);
}
