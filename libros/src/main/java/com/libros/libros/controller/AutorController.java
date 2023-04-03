/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libros.libros.controller;

import com.libros.libros.entity.Autor;
import com.libros.libros.service.impl.AutorServiceImpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Bryant
 */
@RestController
@RequestMapping("/autor")
@CrossOrigin(origins = "http://localhost:4200")
public class AutorController {
    @Autowired
    @Qualifier("autorserviceImpl")
    private AutorServiceImpl autorService;
    
    @GetMapping(path = "/list/", produces = {"application/json"})
    public List<Autor> listCuenta() {
        return autorService.listAllAutor();
    }

    @GetMapping(path = "/list/{id_autor}", produces = {"application/json"})
    public Optional<Autor> getCliente(@PathVariable Integer id_autor) {
        return autorService.findByIdAutor(id_autor);
    }

    @PutMapping(path = "/upd/", produces = {"application/json"})
    public Autor updCliente(@RequestBody Autor autor) {
        return autorService.updateAutor(autor);
    }

    @DeleteMapping(path = "/del/{id_autor}", produces = {"application/json"})
    public void deleteCliente(@PathVariable Integer id_autor) {

        this.autorService.deleteAutor(id_autor);

    }

    @PostMapping(path = "/post/", produces = {"application/json"})
    public Autor createCliente(@RequestBody Autor autor) {
        return autorService.insertAutor(autor);
    }
    
}
