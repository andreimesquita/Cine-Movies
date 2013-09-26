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
-- Estrutura da tabela 'cliente'
--

CREATE TABLE IF NOT EXISTS cliente (
  cod INTEGER AUTO_INCREMENT,
  nome varchar(255),
  cpf varchar(15),
  rg char(10),
  tipo char(1),
  data_nascimento varchar(8),
  data_cadastro varchar(8),
  email varchar(255),
  telefone_fixo char(8),
  telefone_celular char(8),
  cep char(8),
  cidade varchar(255),
  bairro varchar(255),
  logradouro varchar(255),
  numero INTEGER,
  complemento varchar(255),
  PRIMARY KEY (cod)
)

--
-- Extraindo dados da tabela 'cliente'
--

INSERT INTO cliente (nome, cpf, rg,data_nascimento, data_cadastro, email, telefone_fixo, telefone_celular, cep, cidade, bairro, logradouro, numero, complemento) VALUES
('Ândrei d Oliveira Mesquita Schuch', '55555555555', '554654545', '21061992', '29072013', 'andreirs@outlook.com', '32323232', '98989898', '54654846', "Porto Alegre", "Cavalhada", 'Av. Cavalhada', 5250, 'Bloco Itapoã, 318'),
('Fabiana Canto Pergher', '66655555555', '845654545', '04101992', '29072013', 'fabipergher@hotmail.com', '35663482', '92569147', '51434846', "Porto Alegre", "Cavalhada", 'não confimado', 0, null);