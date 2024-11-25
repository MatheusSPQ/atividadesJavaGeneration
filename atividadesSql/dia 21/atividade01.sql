CREATE DATABASE atividade01;
USE atividade01;

CREATE TABLE colaboradores (
	id INT NOT NULL UNIQUE auto_increment,
    nome VARCHAR(100) NOT NULL,
    cargo VARCHAR(50),
    salario DECIMAL(8,2) NOT NULL,
    idade INT,
    PRIMARY KEY (id)
);

INSERT INTO colaboradores (nome,cargo,salario,idade)
VALUES ('Carlos Augusto','Estagiario',1990,18),
('Matheus Queiroz','Desenvolvedor', 3000.98,22),
('Beatriz Seixas','Gerente',6289.90,26),
('Pires Martinz', 'Seguranca',2000.00,23),
('Gabriel Linhares', 'DevOps', 6000.80,26);

SELECT *
FROM colaboradores
WHERE salario>2000;

SELECT *
FROM colaboradores
WHERE salario<2000;

UPDATE colaboradores
set salario = 4000.89
where id = 4 




