package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Condidat;
@Repository
public interface CondidatRepositary extends JpaRepository<Condidat,Long > {

}
