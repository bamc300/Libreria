# Libreria

# PARA INSTALAR
--> Es necesario tener Spring Boot, Maven y Angular
--> Java version 17
--> Angular version 15 o superiror

# Ejecutar
- Con un motor de Spring Boot en eclipse o el ide de preferencia en el puerto 8080
- Correr Angular ng serve y corre en el puerto 4200

# Crear perfil
alter session set "_ORACLE_SCRIPT"=true;

CREATE USER BOOKS IDENTIFIED BY "BOOKS" DEFAULT TABLESPACE USERS TEMPORARY TABLESPACE TEMP ACCOUNT UNLOCK;

-- 3 Roles for BOOKS 
GRANT CONNECT TO BOOKS;
GRANT RESOURCE TO BOOKS;
ALTER USER BOOKS DEFAULT ROLE ALL;

-- 1 System Privilege for REPUESTOS 
GRANT UNLIMITED TABLESPACE TO BOOKS;

-- 1 Object Privilege for REPUESTOS 
GRANT EXECUTE ON SYS.DBMS_MONITOR TO BOOKS;
# Crear Tablas Oracle
CREATE TABLE autor(
id_autor NUMBER PRIMARY KEY,
nombre VARCHAR (50) NOT NULL,
apellidos VARCHAR (50) NOT NULL,
nacionalidad VARCHAR(20),
fecha_nacimiento DATE
);

CREATE TABLE libro(
id_libro NUMBER PRIMARY KEY,
titulo VARCHAR (100) NOT NULL,
editorial VARCHAR (50),
portada VARCHAR (200),
precio FLOAT,
inventario NUMBER,
id_autor NUMBER,
CONSTRAINT FK_autorlibro FOREIGN KEY (id_autor) REFERENCES autor(id_autor)
);

# PLSQL

DECLARE
  i NUMBER := 1;
BEGIN
  FOR i IN 1..100 LOOP
    INSERT INTO autor(id_autor, nombre, apellidos, nacionalidad, fecha_nacimiento) 
    VALUES
      (i, 'Autor' || i, 'Apellido' || i, 'Nacionalidad' || i, TO_DATE('01/01/1970', 'DD/MM/YYYY'));
  END LOOP;
  COMMIT;
END;



DECLARE
  i NUMBER := 1;
BEGIN
  FOR i IN 1..100 LOOP
    INSERT INTO libro(id_libro, titulo, editorial, portada, precio, inventario, id_autor) 
    VALUES
      (i, 'Título del libro' || i, 'Editorial' || i, 'https://example.com/portada' || i, 19.99, 10, i);
  END LOOP;
  COMMIT;
END;






