package com.centroinformacion.autor.service;

import java.util.List;

import com.centroinformacion.autor.entity.Libro;


public interface LibroService {
	
	public abstract List<Libro> listaLibro();
	public abstract Libro insertarLibro(Libro obj);

}
