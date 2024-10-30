package com.example.ProyectoAlmacen.Repository;

import com.example.ProyectoAlmacen.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
