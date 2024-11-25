CREATE DATABASE db_farmacia_bem_estar;
USE db_farmacia_bem_estar;

CREATE TABLE tb_categorias (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(64),
    compremido boolean
);

CREATE TABLE tb_produtos  (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(64),
    quantidade INT,
	valor DECIMAL(8,2),
    categoria BIGINT, 
    FOREIGN KEY(categoria) REFERENCES tb_categorias(id)
);

INSERT INTO tb_categorias (nome, compremido) VALUES 
('Analgésicos', TRUE),
('Antibióticos', TRUE),
('Vitaminas', FALSE),
('Dermatológicos', FALSE),
('Equipamentos Médicos', FALSE);

INSERT INTO tb_produtos (nome, quantidade, valor, categoria) VALUES
('Dipirona', 100, 5.50, 1),              -- Analgésicos
('Paracetamol', 120, 3.75, 1),           -- Analgésicos
('Amoxicilina', 50, 22.00, 2),           -- Antibióticos
('Cefalexina', 40, 18.50, 2),            -- Antibióticos
('Vitamina C', 80, 12.00, 3),            -- Vitaminas
('Protetor Solar', 60, 35.00, 4),        -- Dermatológicos
('Pomada para Assaduras', 70, 8.50, 4), -- Dermatológicos
('Termômetro Digital', 30, 55.00, 5);    -- Equipamentos Médicos

SELECT * FROM tb_produtos
WHERE valor > 50.00;

SELECT * FROM tb_produtos
WHERE valor BETWEEN 5.00 AND 60;

SELECT * FROM tb_produtos
WHERE nome LIKE '%c%';

SELECT tb_produtos.nome, tb_categorias.nome AS categoria , tb_produtos.valor FROM tb_produtos
INNER JOIN tb_categorias ON tb_categorias.id = tb_produtos.categoria;

SELECT tb_produtos.nome, tb_categorias.nome AS categoria FROM tb_produtos
INNER JOIN tb_categorias ON tb_categorias.id = tb_produtos.categoria
WHERE tb_categorias.compremido = 0;