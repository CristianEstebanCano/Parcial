package com.example.Parcial.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGenero;
    private String nombreGenero;

    // Constructor vacío
    public Genero() {}

    // Constructor lleno
    public Genero(Long idGenero, String nombreGenero) {
        this.idGenero = idGenero;
        this.nombreGenero = nombreGenero;
    }

    // Getters y Setters
    public Long getIdGenero() { return idGenero; }
    public void setIdGenero(Long idGenero) { this.idGenero = idGenero; }
    public String getNombreGenero() { return nombreGenero; }
    public void setNombreGenero(String nombreGenero) { this.nombreGenero = nombreGenero; }

    // toString
    @Override
    public String toString() {
        return "Genero{" +
                "idGenero=" + idGenero +
                ", nombreGenero='" + nombreGenero + '\'' +
                '}';
    }
}
