/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.libros.libros.repository;

import com.libros.libros.entity.Autor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Bryant
 */
@Repository("autorRepository")
public interface AutorRepository extends CrudRepository<Autor, Integer>{
    
}
