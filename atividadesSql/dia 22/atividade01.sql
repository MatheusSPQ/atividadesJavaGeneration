CREATE DATABASE db_generation_game_online;
USE  db_generation_game_online;

CREATE TABLE tb_classes (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(64),
    melee BOOLEAN
);

CREATE TABLE tb_personagens (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(64),
    atk BIGINT,
	def BIGINT,
    raca VARCHAR(64),
    classe BIGINT, 
    FOREIGN KEY(classe) REFERENCES tb_classes(id)
);

INSERT INTO tb_classes (nome, melee) VALUES 
('Guerreiro', TRUE),
('Mago', FALSE),
('Paladino', TRUE),
('Arqueiro', FALSE),
('Bárbaro', TRUE);

INSERT INTO tb_personagens (nome, atk, def, raca, classe) VALUES
('Tharion', 2200, 3000, 'Humano', 1),   -- Guerreiro
('Elena', 3500, 1200, 'Elfo', 2),      -- Mago
('Dorin', 2700, 3600, 'Anão', 3),      -- Paladino
('Lyra', 1800, 2900, 'Elfo', 4),       -- Arqueiro
('Grum', 4000, 2000, 'Orc', 5),        -- Bárbaro
('Silva', 1500, 3100, 'Humano', 1),    -- Guerreiro
('Fendril', 3000, 1800, 'Drow', 4),    -- Arqueiro
('Kael', 2400, 3500, 'Humano', 3);     -- Paladino


SELECT * FROM tb_personagens
WHERE atk > 2000;

SELECT * FROM tb_personagens
WHERE def BETWEEN 1000 AND 2000;

SELECT * FROM tb_personagens
WHERE nome LIKE '%c%';

SELECT tb_personagens.nome, tb_classes.nome AS classe FROM tb_personagens
INNER JOIN tb_classes ON tb_classes.id = tb_personagens.classe;

SELECT tb_personagens.nome, tb_classes.nome AS classe FROM tb_personagens
INNER JOIN tb_classes ON tb_classes.id = tb_personagens.classe
WHERE tb_classes.nome = 'arqueiro';




