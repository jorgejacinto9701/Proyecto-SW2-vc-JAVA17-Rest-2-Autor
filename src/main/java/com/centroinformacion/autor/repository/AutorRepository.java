package com.centroinformacion.autor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centroinformacion.autor.entity.Autor;

public interface AutorRepository extends JpaRepository<Autor,Integer> {

}
