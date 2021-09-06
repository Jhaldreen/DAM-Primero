--
-- TABLA CICLOS
--

CREATE TABLE ciclos (
 ciclo_no  VARCHAR(4) NOT NULL PRIMARY KEY,
 nombre    VARCHAR(50), 
 grado     VARCHAR(3)
);

INSERT INTO ciclos VALUES ('C010','Desarrollo de aplicaciones web','GS');
INSERT INTO ciclos VALUES ('C020','Desarrollo de aplicaciones multiplataforma','GS');
INSERT INTO ciclos VALUES ('C030','Sistemas microinformaticos y redes','GM');
INSERT INTO ciclos VALUES ('C040','Administracion y finanzas','GS');


--
-- TABLA ALUMNOS
--

CREATE TABLE alumnos (
 alumno_no 		VARCHAR(5) NOT NULL PRIMARY KEY,
 apellidos  	VARCHAR(30),
 nombre			VARCHAR(20),
 dni			VARCHAR(9) NOT NULL,
 fecha_matricula DATE,
 direccion		VARCHAR(40),
 localidad		VARCHAR(20),
 provincia		VARCHAR(20),
 tfno			VARCHAR(9),
 ciclo_no       VARCHAR(4) NOT NULL,
 FOREIGN KEY (ciclo_no) REFERENCES ciclos(ciclo_no)
);

INSERT INTO alumnos VALUES ('A1248','Fernandez Ruiz','Angel','78922561A','2020-07-13','c/ El Pez, 12','Laredo','Cantabria','666223344','C010');
INSERT INTO alumnos VALUES ('A1344','Lopez Garcia','Eva','13466544T','2020-07-12','Avda. La presa, 45','Colindres','Cantabria','677898917','C020');
INSERT INTO alumnos VALUES ('A1401','López Haro','Fernando','78665432D','2020-07-19','Avda. Gral. Espinosa, 33','Treto','Cantabria','654323232','C020');
INSERT INTO alumnos VALUES ('A1899','Muro Hoz','Luis Ángel','72314522S','2020-07-12','c/ Miguel Hernandez, 15','Granada','Granada','633242526','C040');
INSERT INTO alumnos VALUES ('A2222','Coronas Gomez','Rosa','72133445R','2020-07-11','c/ Castilla, 37','Bezana','Cantabria','659876544','C030');
INSERT INTO alumnos VALUES ('A2155','Ruiz Ruiz','Diego','71345666B','2020-07-16','c/ Argentina, 12','Santander','Cantabria','666777888','C030');                                        

                       

