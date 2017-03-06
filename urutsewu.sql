-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 06, 2017 at 10:16 AM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `urutsewu`
--

-- --------------------------------------------------------

--
-- Table structure for table `warga`
--

CREATE TABLE `warga` (
  `nik` varchar(20) NOT NULL,
  `namalengkap` varchar(50) DEFAULT NULL,
  `tempatlahir` varchar(30) DEFAULT NULL,
  `tanggallahir` varchar(10) DEFAULT NULL,
  `agama` varchar(10) DEFAULT NULL,
  `pekerjaan` varchar(15) DEFAULT NULL,
  `jeniskelamin` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `warga`
--

INSERT INTO `warga` (`nik`, `namalengkap`, `tempatlahir`, `tanggallahir`, `agama`, `pekerjaan`, `jeniskelamin`) VALUES
('1643', 'Untung Slamet', 'Semarang', '08-03-1996', 'Islam', 'Programmer', 'Pria'),
('3321', 'Joko Siswanto', 'Solo', '08-04-1993', 'Kristen', 'Mahasiswa', 'Pria'),
('4123', 'Danang Priabada', 'Demak', '08-03-1996', 'Islam', 'Programmer', 'Pria'),
('5313', 'Aji P', 'Salatiga', '01-05-1996', 'Kristen', 'Mahasiswa', 'Pria'),
('6545', 'Sujud', 'Kudus', '09-12-1996', 'Islam', 'Mahasiswa', 'Wanita');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `warga`
--
ALTER TABLE `warga`
  ADD PRIMARY KEY (`nik`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
