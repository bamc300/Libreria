/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.libros.libros.service;

import com.libros.libros.entity.Autor;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Bryant
 */
public interface AutorService {
    public abstract List<Autor> listAllAutor();

    public abstract Optional<Autor> findByIdAutor(Integer id_autor);

    public abstract Autor updateAutor(Autor autor);

    void deleteAutor(Integer id_autor);
    
    public abstract Autor insertAutor(Autor autor);
}
