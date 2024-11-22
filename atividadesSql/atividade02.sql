CREATE DATABASE atividade02;
USE atividade02;

CREATE TABLE ecommerce (
	id INT NOT NULL UNIQUE PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50),
    valor DECIMAL(8,2),
    descricao VARCHAR(250),
    quantidade INT NOT NULL
);

INSERT INTO ecommerce (nome,valor,descricao,quantidade)
values('camisa', 20.90, 'uma camisa azul', 10),
('calça jeans', 99.90, 'uma calça jeans confortável', 15),
('tênis', 150.00, 'um par de tênis esportivo', 8),
('boné', 25.00, 'um boné preto estiloso', 20),
('mochila', 520.50, 'uma mochila de couro premium', 5),
('relógio', 890.00, 'um relógio analógico de luxo', 3),
('jaqueta', 750.75, 'uma jaqueta de couro premium', 7),
('notebook', 3999.99, 'um notebook de última geração', 2);

SELECT * FROM ecommerce
where valor>500;

SELECT * FROM ecommerce
where valor<500;