-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- Máquina: 127.0.0.1
-- Data de Criação: 23-Out-2013 às 20:10
-- Versão do servidor: 5.6.11
-- versão do PHP: 5.5.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de Dados: `cinemovies`
--
CREATE DATABASE IF NOT EXISTS `cinemovies` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `cinemovies`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `cod` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  `cpf` varchar(15) DEFAULT NULL,
  `rg` char(10) DEFAULT NULL,
  `tipo` char(1) DEFAULT NULL,
  `data_nascimento` varchar(8) DEFAULT NULL,
  `data_cadastro` varchar(8) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `telefone_fixo` char(8) DEFAULT NULL,
  `telefone_celular` char(8) DEFAULT NULL,
  `cep` char(8) DEFAULT NULL,
  `cidade` varchar(255) DEFAULT NULL,
  `bairro` varchar(255) DEFAULT NULL,
  `logradouro` varchar(255) DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  `complemento` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cod`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`cod`, `nome`, `cpf`, `rg`, `tipo`, `data_nascimento`, `data_cadastro`, `email`, `telefone_fixo`, `telefone_celular`, `cep`, `cidade`, `bairro`, `logradouro`, `numero`, `complemento`) VALUES
(1, 'Ândrei d Oliveira Mesquita Schuch', '55555555555', '554654545', NULL, '21061992', '29072013', 'andreirs@outlook.com', '32323232', '98989898', '54654846', 'Porto Alegre', 'Cavalhada', 'Av. Cavalhada', 5250, 'Bloco Itapoã, 318');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
