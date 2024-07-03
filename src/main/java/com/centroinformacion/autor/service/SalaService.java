package com.centroinformacion.autor.service;

import java.util.List;

import com.centroinformacion.autor.entity.Sala;

public interface SalaService {
	public abstract Sala insertaActualizaSala(Sala obj);
	public abstract List<Sala> listaSala();
}
