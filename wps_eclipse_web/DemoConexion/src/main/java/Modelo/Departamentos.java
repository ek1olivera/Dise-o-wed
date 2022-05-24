package Modelo;

import java.sql.Date;

public class Departamentos {
	
	private long Id_Depart;
	private long depart_codigo;
	private String depart_nombre;
	private Date fecha_hora_crea;
	private Date fecha_hora_modf;
	
	//constructor por defecto
	public Departamentos () {
		
	}
	// constructor sobre cargado

	public Departamentos(long id_Depart, long depart_codigo, String depart_nombre, Date fecha_hora_crea,
			Date fecha_hora_modf) {
		super();
		Id_Depart = id_Depart;
		this.depart_codigo = depart_codigo;
		this.depart_nombre = depart_nombre;
		this.fecha_hora_crea = fecha_hora_crea;
		this.fecha_hora_modf = fecha_hora_modf;
	}

	public long getId_Depart() {
		return Id_Depart;
	}

	public void setId_Depart(long id_Depart) {
		this.Id_Depart = id_Depart;
	}

	public long getDepart_codigo() {
		return depart_codigo;
	}

	public void setDepart_codigo(long depart_codigo) {
		this.depart_codigo = depart_codigo;
	}

	public String getDepart_nombre() {
		return depart_nombre;
	}

	public void setDepart_nombre(String depart_nombre) {
		this.depart_nombre = depart_nombre;
	}

	public Date getFecha_hora_crea() {
		return fecha_hora_crea;
	}

	public void setFecha_hora_crea(Date fecha_hora_crea) {
		this.fecha_hora_crea = fecha_hora_crea;
	}

	public Date getFecha_hora_modf() {
		return fecha_hora_modf;
	}

	public void setFecha_hora_modf(Date fecha_hora_modf) {
		this.fecha_hora_modf = fecha_hora_modf;
	}
	
	

}
