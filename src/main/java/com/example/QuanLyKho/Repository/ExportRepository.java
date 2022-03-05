package com.example.QuanLyKho.Repository;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ExportRepository extends CrudRepository<ExportRepository, Integer> {
    List<ExportRepository> findByNameContaining(String term);
}
