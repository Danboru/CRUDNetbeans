-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 11, 2017 at 12:13 AM
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
  `pendidikan` varchar(5) NOT NULL,
  `alamat` varchar(30) NOT NULL,
  `rt` varchar(2) NOT NULL,
  `rw` varchar(2) NOT NULL,
  `jeniskelamin` varchar(10) DEFAULT NULL,
  `statuskawin` varchar(15) NOT NULL,
  `namaayah` varchar(15) NOT NULL,
  `namaibu` varchar(15) NOT NULL,
  `goldarah` varchar(2) NOT NULL,
  `warganegara` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `warga`
--

INSERT INTO `warga` (`nik`, `namalengkap`, `tempatlahir`, `tanggallahir`, `agama`, `pekerjaan`, `pendidikan`, `alamat`, `rt`, `rw`, `jeniskelamin`, `statuskawin`, `namaayah`, `namaibu`, `goldarah`, `warganegara`) VALUES
('1111', 'Danang', 'Demak', '08-03-1996', 'Islam', 'Alamat Rumah', 'S1', 'Alamat Rumah', '04', '03', 'Pria', 'Belum Menikah', 'Sib', 'Sia', 'O', 'Indonesia'),
('1234', 'xx', 'xx', 'xx', 'xx', 'xx', 'xx', 'xx', 'xx', 'xx', 'Pria', 'xx', 'xx', 'xx', 'xx', 'Indonesia'),
('1293', 'Sia', 'Solo', '09-04-1995', 'Hindu', 'ss', 'ss', 'ss', 'ss', 'ss', 'Pria', 'ss', 'ss', 'ss', 'ss', ''),
('1643', 'Untung Slamet', 'Semarang', '08-03-1996', 'Islam', 'aa', 'aa', 'aa', 'aa', 'aa', 'Pria', 'aa', 'aa', 'aa', 'aa', ''),
('2222', 'Danboru', 'Kudus', '09-04-1965', 'Islam', 'Kota Kudus', 'S1', 'Kota Kudus', '04', '09', 'Pria', 'Belum Menikah', 'Sia', 'Sib', 'xx', 'Indonesia'),
('3321', 'Hani', 'Solo', '08-04-1993', 'Kristen', 'mm', 'mm', 'mm', 'mm', 'mm', 'Wanita', 'mm', 'mm', 'mm', 'mm', ''),
('4123', 'Danang Priabada', 'Demak', '08-03-1996', 'Islam', 'ff', 'ff', 'ff', 'ff', 'ff', 'Pria', 'ff', 'ff', 'ff', 'ff', ''),
('5313', 'Aji P', 'Salatiga', '01-05-1996', 'Kristen', 'rr', 'rr', 'rr', 'rr', 'rr', 'Pria', 'rr', 'rr', 'rr', 'rr', ''),
('7777', 'Dan', 'Dan', 'Dan', 'Dan', 'Dan', 'Dan', 'Dan', 'Da', 'Da', 'Pria', 'Dan', 'Dan', 'Dan', 'Da', 'Dan');

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
