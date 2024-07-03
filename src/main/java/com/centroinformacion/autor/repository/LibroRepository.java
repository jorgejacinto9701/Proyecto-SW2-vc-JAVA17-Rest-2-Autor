package com.centroinformacion.autor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centroinformacion.autor.entity.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer>{
	
	
	

}
