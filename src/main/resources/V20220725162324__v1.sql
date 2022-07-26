CREATE TABLE `usuarios` (
  `id_usuario` int NOT NULL AUTO_INCREMENT,
  `apellido_materno` varchar(255) DEFAULT NULL,
  `apellido_paterno` varchar(255) DEFAULT NULL,
  `calle` varchar(255) DEFAULT NULL,
  `ciudad` varchar(255) DEFAULT NULL,
  `colonia` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `estatus` bit(1) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `rol` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_usuario`)
)
insert into usuarios values(1,"cortez","ocampo","capilintla","taxco","capilintla","erick@hotmai.com","guerrero",true,"erick marco","12345","administrador","erick22");
insert into usuarios values(2,"cortez","ocampo","capilintla","taxco","capilintla","erick@hotmai.com","guerrero",true,"erick marco","12345","administrador","erick22");
insert into usuarios values(3,"cortez","ocampo","capilintla","taxco","capilintla","erick@hotmai.com","guerrero",true,"erick marco","12345","administrador","erick22");
insert into usuarios values(4,"cortez","ocampo","capilintla","taxco","capilintla","erick@hotmai.com","guerrero",true,"erick marco","12345","administrador","erick22");