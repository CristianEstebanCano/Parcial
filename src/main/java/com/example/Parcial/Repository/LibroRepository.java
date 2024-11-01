package com.example.Parcial.Repository;

import com.example.Parcial.Model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LibroRepository extends JpaRepository<Libro, Long> {

    @Query(value = "SELECT l.Titulo AS TituloLibro, l.Año_Publicacion, l.ISBN, g.Nombre_Genero " +
            "FROM libros l " +
            "INNER JOIN generos g ON l.Genero_ID = g.ID_Genero " +
            "WHERE g.ID_Genero = :idGenero", nativeQuery = true)
    List<Object[]> findBooksByGenre(@Param("idGenero") Long idGenero);

}