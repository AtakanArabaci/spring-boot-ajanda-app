package com.example.demo.repository;

import com.example.demo.entity.Gorev;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GorevRepository extends JpaRepository<Gorev, Long> {
}