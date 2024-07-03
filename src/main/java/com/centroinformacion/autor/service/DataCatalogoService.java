package com.centroinformacion.autor.service;

import java.util.List;

import com.centroinformacion.autor.entity.DataCatalogo;

public interface DataCatalogoService {

	public abstract List<DataCatalogo> listaDataCatalogo(int idTipo);
	

}
