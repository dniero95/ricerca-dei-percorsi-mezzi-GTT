-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Jul 08, 2023 at 10:55 AM
-- Server version: 5.7.34
-- PHP Version: 7.4.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gtt-vehicle-path-finder-database`
--

-- --------------------------------------------------------

--
-- Table structure for table `fermata`
--

CREATE TABLE `fermata` (
  `id_fermata` varchar(255) NOT NULL,
  `nome_fermata` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `fermata`
--

INSERT INTO `fermata` (`id_fermata`, `nome_fermata`) VALUES
('1F', 'XVIII Dicembre'),
('2F', 'Principi d\'acaja'),
('3F', 'Porta Susa'),
('4F', 'Porta Nuova'),
('5F', 'Lingotto'),
('6F', 'Pozzo Strada');

-- --------------------------------------------------------

--
-- Table structure for table `linea`
--

CREATE TABLE `linea` (
  `id_linea` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `linea`
--

INSERT INTO `linea` (`id_linea`) VALUES
('1L'),
('2L'),
('3L'),
('4L'),
('5L'),
('6L'),
('7L'),
('8L'),
('9L');

-- --------------------------------------------------------

--
-- Table structure for table `percorso`
--

CREATE TABLE `percorso` (
  `id_linea` varchar(255) NOT NULL,
  `id_fermata` varchar(255) NOT NULL,
  `num_ordine` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `percorso`
--

INSERT INTO `percorso` (`id_linea`, `id_fermata`, `num_ordine`) VALUES
('1L', '1F', 3),
('3L', '1F', 2),
('2L', '2F', 1),
('2L', '3F', 2),
('1L', '4F', 1),
('3L', '4F', 3),
('2L', '5F', 2),
('3L', '6F', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `fermata`
--
ALTER TABLE `fermata`
  ADD PRIMARY KEY (`id_fermata`);

--
-- Indexes for table `linea`
--
ALTER TABLE `linea`
  ADD PRIMARY KEY (`id_linea`);

--
-- Indexes for table `percorso`
--
ALTER TABLE `percorso`
  ADD PRIMARY KEY (`id_fermata`,`id_linea`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
