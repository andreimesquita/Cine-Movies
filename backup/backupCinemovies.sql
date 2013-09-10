-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tempo de Geração: Set 10, 2013 as 10:53 PM
-- Versão do Servidor: 5.5.8
-- Versão do PHP: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de Dados: 'cinemovies'
--
CREATE DATABASE cinemovies DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE cinemovies;

-- --------------------------------------------------------

--
-- Estrutura da tabela 'ator'
--

CREATE TABLE IF NOT EXISTS ator (
  cod int(11) NOT NULL AUTO_INCREMENT,
  nome varchar(60) NOT NULL,
  PRIMARY KEY (cod)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Extraindo dados da tabela 'ator'
--


-- --------------------------------------------------------

--
-- Estrutura da tabela 'bairro'
--

CREATE TABLE IF NOT EXISTS bairro (
  cod int(11) NOT NULL AUTO_INCREMENT,
  nome varchar(50) NOT NULL,
  PRIMARY KEY (cod)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Extraindo dados da tabela 'bairro'
--


-- --------------------------------------------------------

--
-- Estrutura da tabela 'categoria'
--

CREATE TABLE IF NOT EXISTS categoria (
  codigo int(11) NOT NULL AUTO_INCREMENT,
  denominacao varchar(20) NOT NULL,
  preco decimal(10,2) NOT NULL,
  tempo_locacao varchar(45) NOT NULL,
  PRIMARY KEY (codigo)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Extraindo dados da tabela 'categoria'
--


-- --------------------------------------------------------

--
-- Estrutura da tabela 'cidade'
--

CREATE TABLE IF NOT EXISTS cidade (
  cod int(11) NOT NULL AUTO_INCREMENT,
  bairro_cod int(11) NOT NULL,
  nome varchar(50) NOT NULL,
  PRIMARY KEY (cod)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Extraindo dados da tabela 'cidade'
--


-- --------------------------------------------------------

--
-- Estrutura da tabela 'classificacao'
--

CREATE TABLE IF NOT EXISTS classificacao (
  cod int(11) NOT NULL AUTO_INCREMENT,
  nome varchar(50) NOT NULL,
  PRIMARY KEY (cod)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Extraindo dados da tabela 'classificacao'
--


-- --------------------------------------------------------

--
-- Estrutura da tabela 'cli_midia'
--

CREATE TABLE IF NOT EXISTS cli_midia (
  codigo int(11) NOT NULL AUTO_INCREMENT,
  Cli_codigo int(11) NOT NULL,
  total decimal(10,2) NOT NULL,
  data_locacao date NOT NULL,
  PRIMARY KEY (codigo)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Extraindo dados da tabela 'cli_midia'
--


-- --------------------------------------------------------

--
-- Estrutura da tabela 'cliente'
--

CREATE TABLE IF NOT EXISTS cliente (
  cod int(11) NOT NULL AUTO_INCREMENT,
  nome varchar(80) NOT NULL,
  cpf varchar(14) NOT NULL,
  rg varchar(10) NOT NULL,
  sexo char(1) NOT NULL,
  data_nascimento date NOT NULL,
  data_cadastro date NOT NULL,
  email varchar(60) NOT NULL,
  telefone_fixo varchar(13) NOT NULL,
  telefone_celular varchar(13) NOT NULL,
  cep varchar(10) NOT NULL,
  cidade_cod int(11) NOT NULL,
  bairro_cod int(11) NOT NULL,
  logradouro varchar(60) NOT NULL,
  numero int(11) NOT NULL,
  complemento varchar(45) NOT NULL,
  PRIMARY KEY (cod)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Extraindo dados da tabela 'cliente'
--

INSERT INTO cliente (cod, nome, cpf, rg, sexo, data_nascimento, data_cadastro, email, telefone_fixo, telefone_celular, cep, cidade_cod, bairro_cod, logradouro, numero, complemento) VALUES
(4, 'Ândrei d Oliveira Mesquita Schuch', '555.555.555-55', '554654545', 'M', '1992-06-21', '2013-07-29', 'andreirs@outlook.com', '(51)3232-3232', '(51)9898-9898', '54654-846', 1, 1, 'Av. Cavalhada', 5250, 'Bloco Itapoã, 318'),
(5, 'Fabiana Canto Pergher', '666.555.555-55', '845654545', 'F', '1992-10-04', '2013-07-29', 'fabipergher@hotmail.com', '(51)3566-3482', '(51)9256-9147', '51434-846', 1, 2, 'não confimado', 0, '');

-- --------------------------------------------------------

--
-- Estrutura da tabela 'conta'
--

CREATE TABLE IF NOT EXISTS conta (
  cod int(11) NOT NULL AUTO_INCREMENT,
  codigo_cliente int(11) NOT NULL,
  saldo decimal(10,2) NOT NULL,
  PRIMARY KEY (cod)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Extraindo dados da tabela 'conta'
--


-- --------------------------------------------------------

--
-- Estrutura da tabela 'copias'
--

CREATE TABLE IF NOT EXISTS copias (
  codigo int(11) NOT NULL AUTO_INCREMENT,
  midia_codigo int(11) NOT NULL,
  PRIMARY KEY (codigo)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Extraindo dados da tabela 'copias'
--


-- --------------------------------------------------------

--
-- Estrutura da tabela 'dependentes'
--

CREATE TABLE IF NOT EXISTS dependentes (
  conta_cod int(11) NOT NULL,
  cliente_cod varchar(45) NOT NULL,
  data_dependencia date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela 'dependentes'
--


-- --------------------------------------------------------

--
-- Estrutura da tabela 'diretor'
--

CREATE TABLE IF NOT EXISTS diretor (
  cod int(11) NOT NULL AUTO_INCREMENT,
  nome varchar(60) NOT NULL,
  PRIMARY KEY (cod)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Extraindo dados da tabela 'diretor'
--


-- --------------------------------------------------------

--
-- Estrutura da tabela 'especie'
--

CREATE TABLE IF NOT EXISTS especie (
  cod int(11) NOT NULL AUTO_INCREMENT,
  nome varchar(45) NOT NULL,
  PRIMARY KEY (cod)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Extraindo dados da tabela 'especie'
--


-- --------------------------------------------------------

--
-- Estrutura da tabela 'estado'
--

CREATE TABLE IF NOT EXISTS estado (
  codigo int(11) NOT NULL AUTO_INCREMENT,
  valor varchar(30) NOT NULL,
  PRIMARY KEY (codigo)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Extraindo dados da tabela 'estado'
--


-- --------------------------------------------------------

--
-- Estrutura da tabela 'filme'
--

CREATE TABLE IF NOT EXISTS filme (
  cod int(11) NOT NULL AUTO_INCREMENT,
  titulo varchar(100) DEFAULT NULL,
  sinopse varchar(255) DEFAULT NULL,
  data_cadastro date DEFAULT NULL,
  genero_cod int(11) DEFAULT NULL,
  tipo_cod int(11) DEFAULT NULL,
  localizacao_cod int(11) DEFAULT NULL,
  especie_cod int(11) DEFAULT NULL,
  diretor_cod int(11) DEFAULT NULL,
  classificacao_cod int(11) DEFAULT NULL,
  qnt int(11) NOT NULL,
  PRIMARY KEY (cod)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Extraindo dados da tabela 'filme'
--


-- --------------------------------------------------------

--
-- Estrutura da tabela 'filmes_locados'
--

CREATE TABLE IF NOT EXISTS filmes_locados (
  codigo int(11) NOT NULL,
  quantidade int(11) NOT NULL,
  cli_codigo int(11) NOT NULL,
  qnt int(11) NOT NULL,
  midia_codigo varchar(45) DEFAULT NULL,
  PRIMARY KEY (codigo)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela 'filmes_locados'
--


-- --------------------------------------------------------

--
-- Estrutura da tabela 'forn_midia'
--

CREATE TABLE IF NOT EXISTS forn_midia (
  Forn_codigo int(11) NOT NULL,
  Midia_codigo int(11) NOT NULL,
  Estd_Forn_codigo int(11) NOT NULL,
  PRIMARY KEY (Forn_codigo)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela 'forn_midia'
--


-- --------------------------------------------------------

--
-- Estrutura da tabela 'fornecedor'
--

CREATE TABLE IF NOT EXISTS fornecedor (
  cod int(11) NOT NULL AUTO_INCREMENT,
  nome_empresarial varchar(80) NOT NULL,
  cnpj varchar(18) NOT NULL,
  nome_fantasia varchar(60) NOT NULL,
  logradouro varchar(50) NOT NULL,
  bairro_cod int(11) NOT NULL,
  numero int(11) NOT NULL,
  complemento varchar(100) NOT NULL,
  UF char(2) NOT NULL,
  nome_responsavel varchar(50) NOT NULL,
  cidade_cod int(11) NOT NULL,
  PRIMARY KEY (cod)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Extraindo dados da tabela 'fornecedor'
--


-- --------------------------------------------------------

--
-- Estrutura da tabela 'genero'
--

CREATE TABLE IF NOT EXISTS genero (
  cod int(11) NOT NULL AUTO_INCREMENT,
  nome varchar(50) NOT NULL,
  PRIMARY KEY (cod)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Extraindo dados da tabela 'genero'
--


-- --------------------------------------------------------

--
-- Estrutura da tabela 'locacao_filmes'
--

CREATE TABLE IF NOT EXISTS locacao_filmes (
  locacao_cod int(11) NOT NULL,
  filme_cod int(11) NOT NULL,
  data_devolucao date NOT NULL,
  devolvido tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela 'locacao_filmes'
--


-- --------------------------------------------------------

--
-- Estrutura da tabela 'localizacao'
--

CREATE TABLE IF NOT EXISTS localizacao (
  cod int(11) NOT NULL AUTO_INCREMENT,
  nome varchar(45) NOT NULL,
  PRIMARY KEY (cod)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Extraindo dados da tabela 'localizacao'
--


-- --------------------------------------------------------

--
-- Estrutura da tabela 'tipo'
--

CREATE TABLE IF NOT EXISTS tipo (
  cod int(11) NOT NULL AUTO_INCREMENT,
  nome varchar(50) NOT NULL,
  PRIMARY KEY (cod)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Extraindo dados da tabela 'tipo'
--

