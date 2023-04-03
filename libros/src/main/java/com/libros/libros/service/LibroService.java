/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.libros.libros.service;

import com.libros.libros.entity.Libro;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Bryant
 */
public interface LibroService {

    public abstract List<Libro> listAllLibro();

    public abstract Optional<Libro> findByIdLibro(Integer id_libro);

    public abstract Libro updateLibro(Libro libro);

    void deleteLibro(Integer id_libro);

    public abstract Libro insertLibro(Libro libro);
}
