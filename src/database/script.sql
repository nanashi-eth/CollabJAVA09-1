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

INSERT INTO instrumento (nombre, familia, fecha)
VALUES ('Laúd', 'Cuerda pulsada', '1985-07-23'),
       ('Guitarra', 'Cuerda pulsada', '2012-04-11'),
       ('Trompeta', 'Viento metal', '1998-11-05'),
       ('Trombón', 'Viento metal', '2009-03-24'),
       ('Tuba', 'Viento metal', '2021-06-15');

