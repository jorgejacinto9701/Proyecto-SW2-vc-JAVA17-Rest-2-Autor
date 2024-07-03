package com.centroinformacion.autor.service;

import java.util.List;

import com.centroinformacion.autor.entity.Alumno;

public interface AlumnoService {

	public abstract List<Alumno> listaTodos();
	public abstract Alumno insertaAlumno(Alumno obj);

}
