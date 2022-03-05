package com.example.QuanLyKho.Service.Impl;

import com.example.QuanLyKho.Entity.EmployeeEntity;
import com.example.QuanLyKho.Repository.EmployeeRepository;
import com.example.QuanLyKho.Service.Base.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProductRepository implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Iterable<EmployeeEntity> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public List<EmployeeEntity> search(String term) {
        return employeeRepository.findByNameContaining(term);
    }

    @Override
    public Optional<EmployeeEntity> findOne(Integer id) {
        return employeeRepository.findById(id);
    }

    @Override
    public void save(EmployeeEntity contact) {
        employeeRepository.save(contact);
    }

    @Override
    public void delete(Integer id) {
        employeeRepository.deleteById(id);
    }
}
