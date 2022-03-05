package com.example.QuanLyKho.Repository;

import com.example.QuanLyKho.Entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Integer> {
    List<EmployeeEntity> findByNameContaining(String term);
}
