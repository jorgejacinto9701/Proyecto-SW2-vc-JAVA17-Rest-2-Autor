package com.centroinformacion.autor.service;

import java.util.List;

import com.centroinformacion.autor.entity.Proveedor;

public interface ProveedorService {
	
	public abstract List<Proveedor> listaProveedor();
	public abstract Proveedor instertaProveedor(Proveedor obj);

}
