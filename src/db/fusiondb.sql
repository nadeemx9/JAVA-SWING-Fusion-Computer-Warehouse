-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 06, 2022 at 07:51 AM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fusiondb`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` varchar(5) NOT NULL COMMENT 'Customer ID',
  `custnm` varchar(50) DEFAULT NULL COMMENT 'Customer Name',
  `contact` varchar(10) DEFAULT NULL COMMENT 'Contact No',
  `email` varchar(50) DEFAULT NULL COMMENT 'Email',
  `shopnm` varchar(50) DEFAULT NULL COMMENT 'Shop Name',
  `address` varchar(70) DEFAULT NULL COMMENT 'Address'
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `custnm`, `contact`, `email`, `shopnm`, `address`) VALUES
('1', 'Nadeem Palkhiwala', '9067101621', ' nadeem@gmail.com', 'fusion ', 'pbr'),
('2', 'Datta', '9432890323', 'kljfas@lkfsdf.com', 'kjla', 'klds'),
('3', 'jklajdkfl', 'jkasjfda', 'fjklasd@jlksd.com', 'jklsd', 'hjkasd'),
('4', 'eruioe', '347892789', 'nfkjs@njgso.com', 'houosdf', 'op[ewo'),
('5', 'Isha Khorava', '8934204370', 'dssjjfs@jk.com', 'ioilkksdf', 'jknmnsoa'),
('6', 'Waqash', '890234439', 'tuois,df@jkld.com', 'bbnm,a;;kf', 'jkladflacdkl;'),
('7', 'Dhanish', '8932442342', 'uewufd@hao.co', 'opsdmvv', 'bcsugd');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` varchar(5) NOT NULL COMMENT 'ID',
  `nm` varchar(25) DEFAULT NULL COMMENT 'NAME',
  `contact` varchar(10) DEFAULT NULL COMMENT 'CONTACT',
  `email` varchar(25) DEFAULT NULL COMMENT 'EMAIL',
  `salary` varchar(10) DEFAULT NULL COMMENT 'SALARY',
  `address` varchar(50) DEFAULT NULL COMMENT 'ADDRESS',
  `pswd` varchar(25) NOT NULL COMMENT 'PASSWORD',
  `img` mediumblob COMMENT 'IMAGE'
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `nm`, `contact`, `email`, `salary`, `address`, `pswd`, `img`) VALUES
('1', 'Kalyani Pitroda', '7897320384', 'kajlds@jfs.com', '89732', 'Ahmd', '', NULL),
('2', 'Dipak Bapodara', '930923', 'jkljsd@jkld.com', '90340', 'jklfds', '', NULL),
('7', 'uewpfm', 'm,cdsalkjl', 'hjksdc ,', 'gse', 'nbkasdkjh', 'dhukjds', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `id` varchar(5) NOT NULL COMMENT 'ID',
  `nm` varchar(25) NOT NULL COMMENT 'NAME',
  `costprice` varchar(5) NOT NULL COMMENT 'SELLING PRICE',
  `sellingprice` varchar(5) NOT NULL COMMENT 'COST PRICE',
  `brand` varchar(25) NOT NULL COMMENT 'BRAND',
  `quantity` varchar(5) NOT NULL COMMENT 'QUANTITY'
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `nm`, `costprice`, `sellingprice`, `brand`, `quantity`) VALUES
('1', 'Motherboard', '600', '783', 'LENOVO', '3'),
('2', 'Fan', '78', '150', 'ACER', '89'),
('3', 'Keyboard', '78', '534', 'DELL', '67'),
('4', 'Mouse', '78', '133', 'LENOVO', '45');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
