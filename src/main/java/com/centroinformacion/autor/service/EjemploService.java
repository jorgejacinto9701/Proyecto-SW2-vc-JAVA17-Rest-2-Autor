package com.centroinformacion.autor.service;

import java.util.List;

import com.centroinformacion.autor.entity.Ejemplo;

public interface EjemploService {

	public abstract Ejemplo insertaActualizaEjemplo(Ejemplo obj);
	public abstract List<Ejemplo> listaEjemplo();
}
