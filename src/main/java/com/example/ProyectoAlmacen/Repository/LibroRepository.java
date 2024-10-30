package com.example.ProyectoAlmacen.Repository;

import com.example.ProyectoAlmacen.Model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
}
