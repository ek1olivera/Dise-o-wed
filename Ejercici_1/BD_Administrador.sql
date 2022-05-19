use bd_administrar;

create table Departamentos (
Id_Depart int not null auto_increment primary key,
depart_codigo int,
depart_nombre varchar (50),
fecha_hora_crea datetime,
fecha_hora_crea datetime,
fk_Id_ciudad int
);

create table Empleados (
Id_Empleado int not null auto_increment primary key,
documento_tipo varchar (2),
emp_nombre varchar (50),
emp_apellido varchar (50),
emp_direccion varchar (100),
emp_correo_electronico varchar (20),
emp_tel int,
emp_fecha_hora_crea datetime,
emp_fecha_hora_crea datetime,
fk_Id_Depart int
);

create table Ciudad (
Id_ciudad int not null primary key
);

alter table empleados add foreign key (fk_Id_Depart) references Departamento (Id_Depart);
alter table departamentos add foreign key (fk_Id_ciudad) references Ciudad (Id_ciudad);