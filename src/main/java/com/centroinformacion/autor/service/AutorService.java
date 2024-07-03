package com.centroinformacion.autor.service;

import java.util.List;

import com.centroinformacion.autor.entity.Autor;

public interface AutorService {
	
	public abstract Autor insertaActualizaAutor(Autor obj);
	public abstract List<Autor> listaAutor();
}
