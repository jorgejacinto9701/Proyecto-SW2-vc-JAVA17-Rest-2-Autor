package com.centroinformacion.autor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.centroinformacion.autor.entity.Autor;
import com.centroinformacion.autor.service.AutorService;

@RestController
@RequestMapping("/rest/autor")
public class AutorController {


	@Autowired
	private AutorService service;
	
	@GetMapping()
	public List<Autor> lista(){
		return service.listaAutor();
	}
	
}
