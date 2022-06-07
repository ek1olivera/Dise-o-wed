package facade;


import java.util.List;

import Modelo.Ciudad;

public interface ICiudad {
	
	public List<Ciudad> listar();
	public Ciudad list(int Id_ciudad);
	public boolean add(Ciudad ciudad);
	public boolean edit(Ciudad ciudad);
	public boolean eliminar(int Id_ciudad);
	
	
	

}
