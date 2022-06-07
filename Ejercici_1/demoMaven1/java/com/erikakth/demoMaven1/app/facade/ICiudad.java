package com.erikakth.demoMaven1.app.facade;

import java.util.List;

import com.erikakth.demoMaven1.app.model.Ciudad;


public interface ICiudad {
	public List<Ciudad>buscarTodos();
	public Ciudad buscarPorId(long id);
	public void crearCiudad(Ciudad ciudad);
	public void actualizarCiudad(Ciudad ciudad);
	public void eliminarCiudad(Ciudad ciudad);

}
