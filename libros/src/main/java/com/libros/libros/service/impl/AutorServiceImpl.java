/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libros.libros.service.impl;

import com.libros.libros.entity.Autor;
import com.libros.libros.repository.AutorRepository;
import com.libros.libros.service.AutorService;

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
@Service("autorserviceImpl")
@Transactional
public class AutorServiceImpl implements AutorService{
    @Autowired
    @Qualifier("autorRepository")
    private AutorRepository autorRepository;

    @Override
    public List<Autor> listAllAutor() {
        return (List<Autor>) autorRepository.findAll(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<Autor> findByIdAutor(Integer id_autor) {
        return autorRepository.findById(id_autor); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Autor updateAutor(Autor autor) {
        return autorRepository.save(autor); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteAutor(Integer id_autor) {
        this.autorRepository.deleteById(id_autor); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Autor insertAutor(Autor autor) {
        return autorRepository.save(autor); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
