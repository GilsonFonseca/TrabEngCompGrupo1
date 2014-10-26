-- phpMyAdmin SQL Dump
-- version 3.2.4
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tempo de Geração: Out 26, 2014 as 06:42 
-- Versão do Servidor: 5.6.17
-- Versão do PHP: 5.3.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de Dados: `carbill`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `dependente`
--

CREATE TABLE IF NOT EXISTS `dependente` (
  `id_dependente` int(11) NOT NULL AUTO_INCREMENT,
  `id_titular` int(11) NOT NULL,
  `nome_dependente` varchar(50) NOT NULL,
  `dt_nasc_dependente` varchar(15) NOT NULL,
  `carteira_hab_dependente` varchar(15) NOT NULL,
  PRIMARY KEY (`id_dependente`),
  UNIQUE KEY `nome_dependente` (`nome_dependente`),
  KEY `id_titular` (`id_titular`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Extraindo dados da tabela `dependente`
--

INSERT INTO `dependente` (`id_dependente`, `id_titular`, `nome_dependente`, `dt_nasc_dependente`, `carteira_hab_dependente`) VALUES
(1, 1, 'Pedrinho', '12/08/1993', '1234567');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `nome_usuario` varchar(50) NOT NULL,
  `cpf_usuario` varchar(11) NOT NULL,
  `senha_usuario` varchar(15) NOT NULL,
  `dt_nascimento_usuario` varchar(10) NOT NULL,
  `carteira_hab_usuario` varchar(15) NOT NULL,
  PRIMARY KEY (`id_usuario`),
  UNIQUE KEY `nome_usuario` (`nome_usuario`,`cpf_usuario`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `nome_usuario`, `cpf_usuario`, `senha_usuario`, `dt_nascimento_usuario`, `carteira_hab_usuario`) VALUES
(1, 'Joao', '12345678901', '123456', '1990-10-15', '123456'),
(2, 'Zé', '12332132112', '123', '1991-11-11', '1235');

-- --------------------------------------------------------

--
-- Estrutura da tabela `veiculos`
--

CREATE TABLE IF NOT EXISTS `veiculos` (
  `id_veiculo` int(11) NOT NULL AUTO_INCREMENT,
  `marca_veiculo` varchar(15) NOT NULL,
  `id_usuario_veiculo` int(11) NOT NULL,
  `ano_veiculo` varchar(9) NOT NULL,
  `modelo_veiculo` varchar(15) NOT NULL,
  `placa_veiculo` varchar(8) NOT NULL,
  `condicao_veiculo` varchar(25) NOT NULL,
  `valor_compra_veiculo` float NOT NULL,
  `valor_venda_veiculo` float NOT NULL,
  PRIMARY KEY (`id_veiculo`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Extraindo dados da tabela `veiculos`
--

INSERT INTO `veiculos` (`id_veiculo`, `marca_veiculo`, `id_usuario_veiculo`, `ano_veiculo`, `modelo_veiculo`, `placa_veiculo`, `condicao_veiculo`, `valor_compra_veiculo`, `valor_venda_veiculo`) VALUES
(1, 'Fiat', 1, '1998/1999', 'Uno', 'aaa-123', 'boa', 15000, 11000),
(2, 'FORD', 1, '2000/2001', 'Focus', 'abc-3214', 'a', 13000, 12000);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
