CREATE DATABASE `java09`;

CREATE TABLE `java09`.`instrumento`
(
    `id`      INT NOT NULL AUTO_INCREMENT,
    `nombre`  VARCHAR(45) UNIQUE,
    `familia` VARCHAR(45) NULL,
    `foto`    VARCHAR(255) NULL,
    `fecha`   DATE NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `foto_UNIQUE` (`foto` ASC) VISIBLE
);

INSERT INTO instrumento (nombre, familia, foto, fecha)
VALUES ('Laúd', 'Cuerda pulsada', 'laud.png' ,'1985-07-23'),
       ('Guitarra', 'Cuerda pulsada', 'guitarra.png' , '2012-04-11'),
       ('Trompeta', 'Viento metal', 'trompeta.png' , '1998-11-05'),
       ('Trombón', 'Viento metal', 'trombon.png' , '2009-03-24'),
       ('Tuba', 'Viento metal', 'tuba.png' , '2021-06-15');

