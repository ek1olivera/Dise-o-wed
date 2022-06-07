package com.erikakth.demoMaven1.app.model;

public class Ciudad {
	
	private long Id_ciudad;
	private String nombre_ciudad;
	private String codigo_ciudad;
	
	
	
	//constructor por defecto
	
	public Ciudad() {
		
	}
	// constructor sobre cargado
	public Ciudad(long id_ciudad, String nombre_ciudad, String codigo_ciudad) {
		super();
		Id_ciudad = id_ciudad;
		this.nombre_ciudad = nombre_ciudad;
		this.codigo_ciudad = codigo_ciudad;
	}
	public long getId_ciudad() {
		return Id_ciudad;
	}
	public void setId_ciudad(long id_ciudad) {
		Id_ciudad = id_ciudad;
	}
	public String getNombre_ciudad() {
		return nombre_ciudad;
	}
	public void setNombre_ciudad(String nombre_ciudad) {
		this.nombre_ciudad = nombre_ciudad;
	}
	public String getCodigo_ciudad() {
		return codigo_ciudad;
	}
	public void setCodigo_ciudad(String codigo_ciudad) {
		this.codigo_ciudad = codigo_ciudad;
	}
	
	
	

}
