-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 05, 2025 at 01:32 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_toko_pakaian`
--

-- --------------------------------------------------------

--
-- Table structure for table `pakaian`
--

CREATE TABLE `pakaian` (
  `kode` varchar(20) NOT NULL,
  `nama` varchar(200) NOT NULL,
  `harga` int(11) NOT NULL,
  `stok` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pakaian`
--

INSERT INTO `pakaian` (`kode`, `nama`, `harga`, `stok`) VALUES
('100101', 'Kaos Polo Blue', 130000, 2),
('100102', 'Kemeja Linen', 200000, 14),
('100103', 'Kaos Boxy Black', 150000, 18),
('100104', 'Hoodie Boxy White', 300000, 10),
('100105', 'Hoodie Reguler Black', 289000, 12),
('100106', 'Kemeja Polos', 170000, 8),
('100107', 'Celana Baggy', 250000, 10),
('100108', 'Celana Pendek', 150000, 16),
('100109', 'Kemeja Hitam Polos', 175000, 12),
('100110', 'Kerudung Sport', 25000, 13),
('100111', 'Crewneck Polos', 50000, 26),
('100112', 'Sandal Selop', 45000, 37),
('100113', 'Topi Baseball', 65000, 13),
('100114', 'Backpack', 150000, 17),
('100115', 'Totebag', 60000, 17),
('100116', 'Celana Cargo', 200000, 29),
('100117', 'Jaket Sherpa', 140000, 11),
('100118', 'Kaos Panjang Polos', 130000, 9),
('100119', 'Kaos Kaki', 15000, 30),
('100120', 'Kaos Crop Top', 55000, 12);

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `kode_transaksi` varchar(20) NOT NULL,
  `nama_pembeli` varchar(150) NOT NULL,
  `kode_pakaian` varchar(20) NOT NULL,
  `jumlah_beli` int(11) NOT NULL,
  `total_harga` int(11) NOT NULL,
  `uang_bayar` int(11) NOT NULL,
  `uang_kembali` int(11) NOT NULL,
  `waktu_transaksi` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`kode_transaksi`, `nama_pembeli`, `kode_pakaian`, `jumlah_beli`, `total_harga`, `uang_bayar`, `uang_kembali`, `waktu_transaksi`) VALUES
('20240629193808', 'Cecep', '100106', 2, 340000, 350000, 10000, '2024-06-29 00:00:00'),
('20240629200702', 'Asep', '100101', 3, 390000, 400000, 10000, '2024-06-29 00:00:00'),
('20240629200751', 'Anisa', '100110', 4, 100000, 100000, 0, '2024-06-29 00:00:00'),
('20240629200915', 'Ratna', '100115', 2, 120000, 150000, 30000, '2024-06-29 00:00:00'),
('20240629200953', 'Lisa', '100120', 5, 275000, 300000, 25000, '2024-06-29 00:00:00'),
('20240629201023', 'Yuyun', '100119', 1, 15000, 15000, 0, '2024-06-29 00:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `nama_depan` varchar(255) NOT NULL,
  `nama_belakang` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `no_telp` varchar(20) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `role` enum('admin','kasir') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `nama_depan`, `nama_belakang`, `email`, `no_telp`, `username`, `password`, `role`) VALUES
(1, 'Andika', 'Yusuf Aprianto', 'andikayusuf2685@gmail.com', '083836957842', 'andika123', 'andika123', 'admin'),
(3, 'Anisa', 'Yundha', 'anisayundhhhh@gmail.com', '0879667511421', 'yuyun123', 'yuyun123', 'kasir'),
(4, 'Priyangga', 'Kusumawardhana', 'anggaganteng69@gmail.com', '08123456789', 'angga123', 'angga123', 'admin'),
(5, 'Ratna', 'Sari', 'Ratnasari17@gmail.com', '08377183728', 'ratna123', 'ratna123', 'kasir'),
(6, 'Titus', 'Bonai', 'titus88@gmail.com', '08264586273', 'titus123', 'titus123', 'kasir');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pakaian`
--
ALTER TABLE `pakaian`
  ADD PRIMARY KEY (`kode`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`kode_transaksi`),
  ADD KEY `kode_pakaian` (`kode_pakaian`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`kode_pakaian`) REFERENCES `pakaian` (`kode`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
