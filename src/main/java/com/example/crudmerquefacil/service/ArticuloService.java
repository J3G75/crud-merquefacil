package com.example.crudmerquefacil.service;

import com.example.crudmerquefacil.entity.Articulo;
import com.example.crudmerquefacil.repository.ArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticuloService {
    @Autowired
    ArticuloRepository articuloRepository;
    public List<Articulo> obtenerArticulos(){
        return articuloRepository.findAll();
    }
    public Optional<Articulo> obtenerArticulo(Integer id){
        return articuloRepository.findById(id);
    }

    public void guardarOActualizarArticulo(Articulo articulo){
        articuloRepository.save(articulo);
    }

    public void eliminarArticulo(Integer id){
        articuloRepository.deleteById(id);
    }
}
