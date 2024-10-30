package com.example.ProyectoAlmacen.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAutor;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private Integer añoNacimiento;

    // Constructor vacío
    public Autor() {}

    // Constructor lleno
    public Autor(Long idAutor, String nombre, String apellido, String nacionalidad, Integer añoNacimiento) {
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.añoNacimiento = añoNacimiento;
    }

    // Getters y Setters
    public Long getIdAutor() { return idAutor; }
    public void setIdAutor(Long idAutor) { this.idAutor = idAutor; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public String getNacionalidad() { return nacionalidad; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }
    public Integer getAñoNacimiento() { return añoNacimiento; }
    public void setAñoNacimiento(Integer añoNacimiento) { this.añoNacimiento = añoNacimiento; }

    // toString
    @Override
    public String toString() {
        return "Autor{" +
                "idAutor=" + idAutor +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", añoNacimiento=" + añoNacimiento +
                '}';
    }
}
