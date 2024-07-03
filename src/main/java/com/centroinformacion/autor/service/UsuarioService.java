package com.centroinformacion.autor.service;

import java.util.List;

import com.centroinformacion.autor.entity.Opcion;
import com.centroinformacion.autor.entity.Rol;
import com.centroinformacion.autor.entity.Usuario;

public interface UsuarioService {

	public abstract List<Opcion> traerEnlacesDeUsuario(int idUsuario);

	public abstract List<Rol> traerRolesDeUsuario(int idUsuario);

	public abstract Usuario buscaPorLogin(String login);
}
