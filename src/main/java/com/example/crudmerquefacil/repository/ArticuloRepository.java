package com.example.crudmerquefacil.repository;

import com.example.crudmerquefacil.entity.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloRepository extends JpaRepository<Articulo, Integer> {
}
