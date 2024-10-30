package com.example.Parcial.Repository;

import com.example.Parcial.Model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
}
