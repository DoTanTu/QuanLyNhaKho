package com.example.QuanLyKho.Service.Base;

import com.example.QuanLyKho.Entity.EmployeeEntity;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Iterable<EmployeeEntity> findAll();

    List<EmployeeEntity> search(String term);

    Optional<EmployeeEntity> findOne(Integer id);

    void save(EmployeeEntity employeeEntity);

    void delete(Integer id);
}
