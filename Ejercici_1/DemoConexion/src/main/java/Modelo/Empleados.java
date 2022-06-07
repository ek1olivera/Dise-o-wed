package Modelo;

import java.sql.Date;

public class Empleados {
	private long Id_Empleado;
	private String documento_tipo;
	private String emp_nombre;
	private String emp_apellido;
	private String emp_direccion;
	private String emp_correo_electronico;
	private long emp_tel;
	private Date emp_fecha_hora_crea;
	private Date emp_fecha_hora_modf;
	
	//Constructor por defecto
	
	public Empleados () {
		
	}
	
	//Constructor sobre cargado

	public Empleados(long id_Empleado, String documento_tipo, String emp_nombre, String emp_apellido,
			String emp_direccion, String emp_correo_electronico, long emp_tel, Date emp_fecha_hora_crea,
			Date emp_fecha_hora_modf) {
		super();
		Id_Empleado = id_Empleado;
		this.documento_tipo = documento_tipo;
		this.emp_nombre = emp_nombre;
		this.emp_apellido = emp_apellido;
		this.emp_direccion = emp_direccion;
		this.emp_correo_electronico = emp_correo_electronico;
		this.emp_tel = emp_tel;
		this.emp_fecha_hora_crea = emp_fecha_hora_crea;
		this.emp_fecha_hora_modf = emp_fecha_hora_modf;
	}

	public long getId_Empleado() {
		return Id_Empleado;
	}

	public void setId_Empleado(long id_Empleado) {
		Id_Empleado = id_Empleado;
	}

	public String getDocumento_tipo() {
		return documento_tipo;
	}

	public void setDocumento_tipo(String documento_tipo) {
		this.documento_tipo = documento_tipo;
	}

	public String getEmp_nombre() {
		return emp_nombre;
	}

	public void setEmp_nombre(String emp_nombre) {
		this.emp_nombre = emp_nombre;
	}

	public String getEmp_apellido() {
		return emp_apellido;
	}

	public void setEmp_apellido(String emp_apellido) {
		this.emp_apellido = emp_apellido;
	}

	public String getEmp_direccion() {
		return emp_direccion;
	}

	public void setEmp_direccion(String emp_direccion) {
		this.emp_direccion = emp_direccion;
	}

	public String getEmp_correo_electronico() {
		return emp_correo_electronico;
	}

	public void setEmp_correo_electronico(String emp_correo_electronico) {
		this.emp_correo_electronico = emp_correo_electronico;
	}

	public long getEmp_tel() {
		return emp_tel;
	}

	public void setEmp_tel(long emp_tel) {
		this.emp_tel = emp_tel;
	}

	public Date getEmp_fecha_hora_crea() {
		return emp_fecha_hora_crea;
	}

	public void setEmp_fecha_hora_crea(Date emp_fecha_hora_crea) {
		this.emp_fecha_hora_crea = emp_fecha_hora_crea;
	}

	public Date getEmp_fecha_hora_modf() {
		return emp_fecha_hora_modf;
	}

	public void setEmp_fecha_hora_modf(Date emp_fecha_hora_modf) {
		this.emp_fecha_hora_modf = emp_fecha_hora_modf;
	}
	
	
	

}
