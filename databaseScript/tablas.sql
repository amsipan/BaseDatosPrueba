--database: ../database/Libros.sqlite

DROP TABLE IF EXISTS Genero;

CREATE TABLE Genero (
    IDGenero INTEGER PRIMARY KEY AUTOINCREMENT,
    Genero VARCHAR(10) NOT NULL
);  