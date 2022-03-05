package com.example.QuanLyKho.Repository;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ImportsRepository extends CrudRepository<ImportsRepository, Integer> {
    List<ImportsRepository> findByNameContaining(String term);
}
