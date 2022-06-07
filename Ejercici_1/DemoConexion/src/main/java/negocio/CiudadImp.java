package negocio;

import java.sql.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



import Modelo.Ciudad;
import data.Conexion;
import facade.ICiudad;

public class CiudadImp extends Conexion implements ICiudad{
	//atributos
	private PreparedStatement pstCiudades= null;
	private ResultSet rsCiudades=null;
	private String query="";
	private List<Ciudad> listaCiudades=new ArrayList<Ciudad>();
	

	@Override
	public List<Ciudad> listar() {
		this.query="SELECT*FROM Ciudad";
		try{
			if (this.getConnection()!=null) {
				this.pstCiudades=this.getConnection().prepareCall(query);
				this.rsCiudades=this.pstCiudades.executeQuery();
				while (this.rsCiudades.next()) {
					Ciudad ciudad=new Ciudad();
					ciudad.setId_ciudad(this.rsCiudades.getLong("Id_ciudad"));
					ciudad.setNombre_ciudad(this.rsCiudades.getString("nombre_ciudad"));
					ciudad.setCodigo_ciudad(this.rsCiudades.getString("codigo_ciudad"));
					this.listaCiudades.add(ciudad);
										
				}
				
				
			}else {
				System.out.println("Fallo de conexion");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return this.listar();
	}
	

	@Override
	public Ciudad list(int Id_ciudad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Ciudad ciudad) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean edit(Ciudad ciudad) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminar(int Id_ciudad) {
		// TODO Auto-generated method stub
		return false;
	}


}
