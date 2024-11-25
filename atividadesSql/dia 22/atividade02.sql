CREATE DATABASE db_pizzaria_legal;
USE db_pizzaria_legal;

CREATE TABLE tb_categorias (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(64),
    doce boolean
);

CREATE TABLE tb_pizzas (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(64),
    diametro DECIMAL(8,2),
	valor DECIMAL(8,2),
    categoria BIGINT, 
    FOREIGN KEY(categoria) REFERENCES tb_categorias(id)
);

INSERT INTO tb_categorias (nome, doce) VALUES 
('Tradicional', FALSE),
('Gourmet', FALSE),
('Doce', TRUE),
('Vegana', FALSE),
('Especial', FALSE);

INSERT INTO tb_pizzas (nome, diametro, valor, categoria) VALUES
('Margherita', 30.00, 40.00, 1),   -- Tradicional
('Pepperoni', 35.00, 50.00, 1),   -- Tradicional
('Chocolate com Morango', 25.00, 60.00, 3), -- Doce
('Trufada', 28.00, 70.00, 3),     -- Doce
('Quatro Queijos', 30.00, 55.00, 2), -- Gourmet
('Vegana Supreme', 32.00, 65.00, 4), -- Vegana
('Calabresa Especial', 35.00, 60.00, 5), -- Especial
('Portuguesa', 30.00, 45.00, 1);  -- Tradicional

SELECT * FROM tb_pizzas
WHERE valor > 45.00;

SELECT * FROM tb_pizzas
WHERE valor BETWEEN 50.00 AND 100;

SELECT * FROM tb_pizzas
WHERE nome LIKE '%m%';

SELECT tb_pizzas.nome, tb_categorias.nome AS categoria , tb_pizzas.valor FROM tb_pizzas
INNER JOIN tb_categorias ON tb_categorias.id = tb_pizzas.categoria;

SELECT tb_pizzas.nome, tb_categorias.nome AS categoria FROM tb_pizzas
INNER JOIN tb_categorias ON tb_categorias.id = tb_pizzas.categoria
WHERE tb_categorias.doce = 1;