-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tempo de Geração: 10/05/2015 às 07h49min
-- Versão do Servidor: 5.5.16
-- Versão do PHP: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de Dados: `home`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `aluno`
--

CREATE TABLE IF NOT EXISTS `aluno` (
  `idaluno` int(11) NOT NULL AUTO_INCREMENT,
  `raaluno` char(12) NOT NULL,
  `nome` char(100) NOT NULL,
  `rg` char(12) NOT NULL,
  `sexo` char(15) NOT NULL,
  `cpf` char(15) NOT NULL,
  `end` char(100) NOT NULL,
  `cep` char(11) NOT NULL,
  `tel` char(15) DEFAULT NULL,
  `cel` char(15) DEFAULT NULL,
  `email` char(100) DEFAULT NULL,
  `datanasc` char(15) NOT NULL,
  `escol` char(60) DEFAULT NULL,
  `funcao` char(60) DEFAULT NULL,
  `datavenc` char(15) NOT NULL,
  `entret` char(80) DEFAULT NULL,
  `curso` char(45) NOT NULL,
  `datainicio` char(15) NOT NULL,
  `finalidade` char(60) DEFAULT NULL,
  `hora` char(7) NOT NULL,
  `horafim` char(10) NOT NULL,
  `modulo` char(15) NOT NULL,
  `hmodulo` char(60) NOT NULL,
  `nend` char(10) DEFAULT NULL,
  PRIMARY KEY (`idaluno`,`raaluno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `boletim`
--

CREATE TABLE IF NOT EXISTS `boletim` (
  `raaluno` char(12) NOT NULL,
  `codmateria` char(70) NOT NULL,
  `faltas` int(11) DEFAULT NULL,
  KEY `RAaluno` (`raaluno`),
  KEY `codmateria` (`codmateria`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `login` char(50) NOT NULL,
  `senha` char(50) NOT NULL,
  `email` char(50) NOT NULL,
  PRIMARY KEY (`email`),
  UNIQUE KEY `login` (`login`),
  UNIQUE KEY `email` (`email`),
  KEY `senha` (`senha`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `login`
--

INSERT INTO `login` (`login`, `senha`, `email`) VALUES
('samuel', 'samuel', 'samuel_smgl@hotmail.com');

-- --------------------------------------------------------

--
-- Estrutura da tabela `materia`
--

CREATE TABLE IF NOT EXISTS `materia` (
  `codmateria` char(70) NOT NULL,
  PRIMARY KEY (`codmateria`),
  UNIQUE KEY `codmateria` (`codmateria`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `materia`
--

INSERT INTO `materia` (`codmateria`) VALUES
('Espanhol'),
('Ingles'),
('Ingles e Espanhol');

-- --------------------------------------------------------

--
-- Estrutura da tabela `pagamento`
--

CREATE TABLE IF NOT EXISTS `pagamento` (
  `raaluno` char(12) NOT NULL,
  `nome` char(100) NOT NULL,
  `modulo` char(15) NOT NULL,
  `valor` char(50) NOT NULL,
  KEY `RAaluno` (`raaluno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
