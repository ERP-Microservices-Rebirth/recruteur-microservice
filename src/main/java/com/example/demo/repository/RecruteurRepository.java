package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Recruteur;
@Repository
public interface RecruteurRepository extends JpaRepository<Recruteur, Long> {

}
