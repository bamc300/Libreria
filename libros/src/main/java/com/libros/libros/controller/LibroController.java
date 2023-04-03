/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libros.libros.controller;

import com.libros.libros.entity.Libro;
import com.libros.libros.service.impl.LibroServiceImpl;
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
@RequestMapping("/libro")
@CrossOrigin(origins = "http://localhost:4200")
public class LibroController {
    @Autowired
    @Qualifier("libroserviceImpl")
    private LibroServiceImpl libroServiceImpl;
    
    @GetMapping(path = "/list/", produces = {"application/json"})
    public List<Libro> listCuenta() {
        return libroServiceImpl.listAllLibro();
    }

    @GetMapping(path = "/list/{id_libro}", produces = {"application/json"})
    public Optional<Libro> getCliente(@PathVariable Integer id_libro) {
        return libroServiceImpl.findByIdLibro(id_libro);
    }

    @PutMapping(path = "/upd/", produces = {"application/json"})
    public Libro updCliente(@RequestBody Libro libro) {
        return libroServiceImpl.updateLibro(libro);
    }

    @DeleteMapping(path = "/del/{id_libro}", produces = {"application/json"})
    public void deleteCliente(@PathVariable Integer id_libro) {

        this.libroServiceImpl.deleteLibro(id_libro);

    }

    @PostMapping(path = "/post/", produces = {"application/json"})
    public Libro createCliente(@RequestBody Libro libro) {
        return libroServiceImpl.insertLibro(libro);
    }
}
