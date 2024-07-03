package com.centroinformacion.autor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centroinformacion.autor.entity.Pais;
import com.centroinformacion.autor.repository.PaisRepository;

@Service
public class PaisServiceImp implements PaisService {

	@Autowired
	private PaisRepository repository;

	@Override
	public List<Pais> listaTodos() {
		return repository.findByOrderByNombreAsc();

	}

}
