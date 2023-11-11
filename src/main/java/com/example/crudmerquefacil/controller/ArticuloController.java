package com.example.crudmerquefacil.controller;

import com.example.crudmerquefacil.entity.Articulo;
import com.example.crudmerquefacil.service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/articulos")
public class ArticuloController {

    @Autowired
    private ArticuloService articuloService;
    @GetMapping
    public List<Articulo>obtenerTodos(){
        return articuloService.obtenerArticulos();
    }

    @PostMapping
    public void guardarActualizar(@RequestBody Articulo articulo){
        articuloService.guardarOActualizarArticulo(articulo);
    }

    @DeleteMapping("/{idArticulo}")
    public void eliminar(@PathVariable("idArticulo")Integer idArticulo){
        articuloService.eliminarArticulo(idArticulo);
    }

    @GetMapping("/{idArticulo}")
    public Optional<Articulo> obtenerArticulo(@PathVariable("idArticulo")Integer idArticulo){
        return articuloService.obtenerArticulo(idArticulo);
    }
}
