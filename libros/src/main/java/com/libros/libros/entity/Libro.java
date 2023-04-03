/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libros.libros.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Bryant
 */
@Entity
@Table(name = "libro")
public class Libro implements Serializable {

    @Id
    private Integer id_libro;
    private String titulo;
    private String editorial;
    private String portada;
    private float precio;
    private Integer inventario;
    private Integer id_autor;
    
    // @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    // @JoinTable(name = "autor",joinColumns = @JoinColumn(name = "id_autor"))
    // private Autor autor;

    public Libro(Integer id_libro, String titulo, String editorial, String portada, float precio, Integer inventario, Integer id_autor) {
        this.id_libro = id_libro;
        this.titulo = titulo;
        this.editorial = editorial;
        this.portada = portada;
        this.precio = precio;
        this.inventario = inventario;
        this.id_autor = id_autor;
    }

    public Libro() {
    }

    public Integer getId_libro() {
        return id_libro;
    }

    public void setId_libro(Integer id_libro) {
        this.id_libro = id_libro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Integer getInventario() {
        return inventario;
    }

    public void setInventario(Integer inventario) {
        this.inventario = inventario;
    }

    public Integer getId_autor() {
        return id_autor;
    }

    public void setId_autor(Integer id_autor) {
        this.id_autor = id_autor;
    }

    
}
