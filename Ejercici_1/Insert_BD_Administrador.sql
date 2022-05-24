use bd_administrar;

#Inf_Depart
select*from Departamentos;
insert into Departamentos (Id_Depart , depart_codigo, depart_nombre, fecha_hora_crea, fecha_hora_modf) values (default, '001', 'META', '2021-09-04', '2022-05-01');
insert into Departamentos (Id_Depart , depart_codigo, depart_nombre, fecha_hora_crea, fecha_hora_modf) values (default, '002', 'ANTIOQUIA', '2022-05-09', '2021-08-19');
insert into Departamentos (Id_Depart , depart_codigo, depart_nombre, fecha_hora_crea, fecha_hora_modf) values (default, '003', 'CUNDINAMARCA', '2020-03-18', '2021-05-12');
insert into Departamentos (Id_Depart , depart_codigo, depart_nombre, fecha_hora_crea, fecha_hora_modf) values (default, '004', 'CAUCA', '2022-08-24', '2022-09-08');
insert into Departamentos (Id_Depart , depart_codigo, depart_nombre, fecha_hora_crea, fecha_hora_modf) values (default, '005', 'CAQUETA', '2022-04-03', '2022-10-04');
insert into Departamentos (Id_Depart , depart_codigo, depart_nombre, fecha_hora_crea, fecha_hora_modf) values (default, '006', 'PUTUMAYO', '2022-10-24', '2022-01-05');
insert into Departamentos (Id_Depart , depart_codigo, depart_nombre, fecha_hora_crea, fecha_hora_modf) values (default, '007', 'SUCRE', '2022-11-09', '2021-06-04');
insert into Departamentos (Id_Depart , depart_codigo, depart_nombre, fecha_hora_crea, fecha_hora_modf) values (default, '008', 'HUILA', '2022-12-10', '2022-06-18');
insert into Departamentos (Id_Depart , depart_codigo, depart_nombre, fecha_hora_crea, fecha_hora_modf) values (default, '009', 'TOLIMA', '2022-09-12', '2022-10-13');
insert into Departamentos (Id_Depart , depart_codigo, depart_nombre, fecha_hora_crea, fecha_hora_modf) values (default, '010', 'CASANARE', '2022-08-07', '2022-10-16');

#Inf_Empleados
select*from Empleados;
insert into Empleados (Id_Empleado, documento_tipo, emp_nombre, emp_apellido, emp_direccion , emp_correo_electronico, emp_tel, emp_fecha_hora_crea, emp_fecha_hora_modf) values (default, 'CC', 'Krystal', 'Gawthrop', '5A-5E-FD-18-DA-07', 'kgawthrop0@people.co', '1253', '2021-05-19', '2021-08-13');
insert into Empleados (Id_Empleado, documento_tipo, emp_nombre, emp_apellido, emp_direccion , emp_correo_electronico, emp_tel, emp_fecha_hora_crea, emp_fecha_hora_modf) values (default, 'CC', 'Doralyn', 'Scranny', 'C8-54-9B-40-CA-F0', 'dscranny1@imgur.com', '5897', '2021-06-20', '2022-06-24');
insert into Empleados (Id_Empleado, documento_tipo, emp_nombre, emp_apellido, emp_direccion , emp_correo_electronico, emp_tel, emp_fecha_hora_crea, emp_fecha_hora_modf) values (default, 'CC', 'Gill', 'Keyho', '6E-14-8B-0D-2D-9F', 'gkeyho2@cocol.com', '2356', '2021-10-23', '2021-09-12');
insert into Empleados (Id_Empleado, documento_tipo, emp_nombre, emp_apellido, emp_direccion , emp_correo_electronico, emp_tel, emp_fecha_hora_crea, emp_fecha_hora_modf) values (default, 'CC', 'Townsend', 'Timperley', '30-88-F5-4B-7F-5F', 'ttimperley3@usa.gov', '6971', '2021-05-04', '2021-09-13');
insert into Empleados (Id_Empleado, documento_tipo, emp_nombre, emp_apellido, emp_direccion , emp_correo_electronico, emp_tel, emp_fecha_hora_crea, emp_fecha_hora_modf) values (default, 'CC', 'Eveleen', 'Drinkel', 'CC-95-D6-A5-A2-E6', 'edrinkel4@cnbc.com', '2767', '2021-07-06', '2022-03-01');
insert into Empleados (Id_Empleado, documento_tipo, emp_nombre, emp_apellido, emp_direccion , emp_correo_electronico, emp_tel, emp_fecha_hora_crea, emp_fecha_hora_modf) values (default, 'CC', 'Elenore', 'Klaussen', '41-2D-EE-6D-C1-2A', 'eklaussen5@nymag.com', '3763', '2021-09-01', '2021-09-18');
insert into Empleados (Id_Empleado, documento_tipo, emp_nombre, emp_apellido, emp_direccion , emp_correo_electronico, emp_tel, emp_fecha_hora_crea, emp_fecha_hora_modf) values (default, 'CC', 'Cornela', 'Arnke', '4A-7B-68-6A-D1-52', 'carnke6@fotki.com', '8558', '2022-03-02', '2022-09-06');
insert into Empleados (Id_Empleado, documento_tipo, emp_nombre, emp_apellido, emp_direccion , emp_correo_electronico, emp_tel, emp_fecha_hora_crea, emp_fecha_hora_modf) values (default, 'CC', 'Bell', 'Gilfether', '96-B0-90-D5-57-A6', 'bgilfether7@fast.com', '1511', '2022-12-01', '2022-12-08');
insert into Empleados (Id_Empleado, documento_tipo, emp_nombre, emp_apellido, emp_direccion , emp_correo_electronico, emp_tel, emp_fecha_hora_crea, emp_fecha_hora_modf) values (default, 'CC', 'Silvio', 'Capineer', '28-77-8C-B0-F2-9E', 'scapineer8@hat.jp', '2976', '2022-11-05', '2021-10-04');
insert into Empleados (Id_Empleado, documento_tipo, emp_nombre, emp_apellido, emp_direccion , emp_correo_electronico, emp_tel, emp_fecha_hora_crea, emp_fecha_hora_modf) values (default, 'CC', 'Lacie', 'Petts', '83-A4-8C-9D-85-2B', 'lpetts9@ehow.com', '6840', '2022-08-02', '2022-05-03');

#Inf_Ciudad
select*from Ciudad;
insert into Ciudad (Id_ciudad, nombre_ciudad, codigo_ciudad) values (1, 'Villavicencio', 'VILLACIO');
insert into Ciudad (Id_ciudad, nombre_ciudad, codigo_ciudad) values (2, 'Medellin', 'MELLIN');
insert into Ciudad (Id_ciudad, nombre_ciudad, codigo_ciudad) values (3, 'Bogotá D.C', 'BGTA');
insert into Ciudad (Id_ciudad, nombre_ciudad, codigo_ciudad) values (4, 'Popayán', 'POPYAN');
insert into Ciudad (Id_ciudad, nombre_ciudad, codigo_ciudad) values (5, 'Florencia', 'FLOCIA');
insert into Ciudad (Id_ciudad, nombre_ciudad, codigo_ciudad) values (6, 'Mocoa', 'MOCOA');
insert into Ciudad (Id_ciudad, nombre_ciudad, codigo_ciudad) values (7, 'Sincelejo', 'SINLEJO');
insert into Ciudad (Id_ciudad, nombre_ciudad, codigo_ciudad) values (8, 'Neiva', 'NEIVA');
insert into Ciudad (Id_ciudad, nombre_ciudad, codigo_ciudad) values (9, 'Ibagué', 'IBAGUÉ');
insert into Ciudad (Id_ciudad, nombre_ciudad, codigo_ciudad) values (10, 'Yopal', 'YOPAL');