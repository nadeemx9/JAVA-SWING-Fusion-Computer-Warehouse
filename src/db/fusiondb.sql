-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 23, 2022 at 05:32 AM
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
-- Table structure for table `bill`
--

CREATE TABLE `bill` (
  `id` varchar(4) NOT NULL,
  `custid` varchar(4) NOT NULL,
  `custnm` varchar(25) NOT NULL,
  `contact` varchar(15) NOT NULL,
  `address` varchar(50) NOT NULL,
  `tax` varchar(10) NOT NULL,
  `discount` varchar(10) NOT NULL,
  `total` varchar(10) NOT NULL,
  `unpaid` varchar(10) NOT NULL,
  `date` varchar(25) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bill`
--

INSERT INTO `bill` (`id`, `custid`, `custnm`, `contact`, `address`, `tax`, `discount`, `total`, `unpaid`, `date`) VALUES
('1', '2', 'Datta', '9432890323', 'klds', '0', '0', '783', '0', '2022-09-23'),
('2', '5', 'Aman', '8934204370', 'jknmnsoa', '0', '270', '3483', '0', '2022-09-23'),
('3', '1', 'Nadeem Palkhiwala', '9067101621', 'pbr', '0', '0', '1520', '0', '2022-09-23');

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
  `address` varchar(100) DEFAULT NULL COMMENT 'Address'
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `custnm`, `contact`, `email`, `shopnm`, `address`) VALUES
('1', 'Nadeem Palkhiwala', '9067101621', ' nadeem@gmail.com', 'fusion ', 'pbr'),
('2', 'Datta', '9432890323', 'kljfas@lkfsdf.com', 'kjla', 'klds'),
('3', 'jklajdkfl', 'jkasjfda', 'fjklasd@jlksd.com', 'jklsd', 'hjkasd'),
('5', 'Aman', '8934204370', 'dssjjfs@jk.com', 'ioilkksdf', 'jknmnsoa');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` varchar(5) NOT NULL COMMENT 'ID',
  `nm` varchar(25) DEFAULT NULL COMMENT 'NAME',
  `usrnm` varchar(25) NOT NULL COMMENT 'USERNAME',
  `pswd` varchar(25) NOT NULL COMMENT 'PASSWORD',
  `contact` varchar(10) DEFAULT NULL COMMENT 'CONTACT',
  `email` varchar(50) DEFAULT NULL COMMENT 'EMAIL',
  `salary` varchar(10) DEFAULT NULL COMMENT 'SALARY',
  `address` varchar(50) DEFAULT NULL COMMENT 'ADDRESS'
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `nm`, `usrnm`, `pswd`, `contact`, `email`, `salary`, `address`) VALUES
('1', 'ADMIN', 'admin', 'admin123', '9067101621', 'nadeempalkhiwala@gmail.com', '120000', 'Porbandar'),
('2', 'Dhruv Datta', 'dhruvkdatta', 'dhruv123', '9408084884', 'dhruv@gmail.com', '120000', 'Porbandar'),
('3', 'Nadeem Palkhiwala', 'nadeemx9', 'nadeem123', '9067101621', 'nadeem@gmail.com', '80000', 'Ahmedabad');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `id` varchar(10) NOT NULL COMMENT 'ID',
  `nm` varchar(25) NOT NULL COMMENT 'NAME',
  `costprice` varchar(10) NOT NULL COMMENT 'SELLING PRICE',
  `sellingprice` varchar(10) NOT NULL COMMENT 'COST PRICE',
  `brand` varchar(25) NOT NULL COMMENT 'BRAND',
  `quantity` varchar(10) NOT NULL COMMENT 'QUANTITY'
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `nm`, `costprice`, `sellingprice`, `brand`, `quantity`) VALUES
('1', 'Motherboard', '600', '783', 'MSI', '3'),
('2', 'Fan', '120', '150', 'ACER', '89'),
('3', 'Monitor', '1200', '1350', 'HP', '25'),
('4', 'Keyboard', '450', '520', 'DELL', '30'),
('5', 'Mouse', '220', '280', 'LENOVO', '45'),
('6', 'Cabinet', '1350', '1520', 'MSI', '12'),
('7', 'SMPS', '720', '800', 'ACER', '22');

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
