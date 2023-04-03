/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libros.libros.service.impl;

import com.libros.libros.entity.Libro;
import com.libros.libros.repository.LibroRepository;
import com.libros.libros.service.LibroService;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bryant
 */
@Service("libroserviceImpl")
@Transactional
public class LibroServiceImpl implements LibroService{
    @Autowired
    @Qualifier("libroRepository")
    private LibroRepository libroRepository;

    @Override
    public List<Libro> listAllLibro() {
        return (List<Libro>) libroRepository.findAll(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<Libro> findByIdLibro(Integer id_libro) {
        return libroRepository.findById(id_libro); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Libro updateLibro(Libro libro) {
        return libroRepository.save(libro); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteLibro(Integer id_libro) {
        this.libroRepository.deleteById(id_libro); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Libro insertLibro(Libro libro) {
        return libroRepository.save(libro); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
