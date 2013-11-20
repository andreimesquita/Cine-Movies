--------------------
-- TABELA CLIENTE --
--------------------
CREATE TABLE cliente (
	codigo INT auto_increment,
	cpf CHAR(11) NOT NULL,
	rg CHAR(9) NOT NULL,
	nome VARCHAR(255) NOT NULL,
	cep CHAR(8) NOT NULL,
	bairro VARCHAR(255) NOT NULL,
	cidade VARCHAR(255) NOT NULL,
	logradouro VARCHAR(255) NOT NULL,
	numero VARCHAR(10) NOT NULL,
	complemento VARCHAR(255) NOT NULL,
	tel_fixo VARCHAR(8) DEFAULT NULL,
	tel_celular VARCHAR(8) DEFAULT NULL,
	email VARCHAR(255) DEFAULT NULL,
	tipo CHAR(1) CHECK (tipo = 'A' OR tipo = 'C' OR tipo = 'F'),
	cliente_sup INT DEFAULT null REFERENCES cliente(codigo),
	data_nascimento DATE NOT NULL,
	UNIQUE (nome, cpf, rg),
	PRIMARY KEY (codigo)
);
--------------------
--  TABELA CONTA  --
--------------------
CREATE TABLE conta (
	codigo INT auto_increment,
	cliente_codigo INT REFERENCES cliente (codigo),
	data_cadastro DATE,
	PRIMARY KEY (codigo, cliente_codigo)
);