package com.example.Parcial.Repository;

import com.example.Parcial.Model.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {

    @Query(value = "SELECT c.Nombre AS NombreCliente, c.Apellido AS ApellidoCliente, c.Email AS EmailCliente, " +
            "l.Titulo AS TituloLibro, l.Año_Publicacion, l.ISBN " +
            "FROM prestamos p " +
            "INNER JOIN clientes c ON p.ID_Cliente = c.ID_Cliente " +
            "INNER JOIN libros l ON p.ID_Libro = l.ID_Libro " +
            "WHERE c.ID_Cliente = :idCliente", nativeQuery = true)
    List<Object[]> findBooksBorrowedByClient(@Param("idCliente") Long idCliente);

}
