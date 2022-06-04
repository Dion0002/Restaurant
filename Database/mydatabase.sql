-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Feb 15, 2021 at 12:48 PM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mydatabase`
--

-- --------------------------------------------------------

--
-- Table structure for table `add_employee`
--

DROP TABLE IF EXISTS `add_employee`;
CREATE TABLE IF NOT EXISTS `add_employee` (
  `Employee ID` int(11) NOT NULL AUTO_INCREMENT,
  `Fristname` varchar(50) DEFAULT NULL,
  `Lastname` varchar(50) DEFAULT NULL,
  `Gender` varchar(50) DEFAULT NULL,
  `Date  of Birth` date DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Contact` varchar(50) DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  `Job Title` varchar(50) DEFAULT NULL,
  `Salary` int(11) DEFAULT NULL,
  `Username` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `User Type` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Employee ID`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `add_employee`
--

INSERT INTO `add_employee` (`Employee ID`, `Fristname`, `Lastname`, `Gender`, `Date  of Birth`, `Email`, `Contact`, `Address`, `Job Title`, `Salary`, `Username`, `Password`, `User Type`) VALUES
(1, 'W', 'W', 'Female', '2021-02-01', 'ww@gmai.com', '1234567899', 'asdasdasdad', 'waiter', 300, 'W', '1234', 'Waiter'),
(2, 'R', 'R', 'Female', '2021-02-01', 'RR@gmail.com', '1234567899', 'asdadsasdasd', 'Receptionist', 300, 'R', '1234', 'Receptionist'),
(3, 'C', 'C', 'Male', '2021-02-01', 'CC@gmail.com', '1234567890', 'edwdsaddewadeffgesf', 'Chef', 400, 'C', '1234', 'Chef'),
(4, 'S', 'S', 'Female', '2021-02-01', 'SS@gmail.com', '1234567890', 'asfasdasdasd', 'Janitor', 250, '', '', 'Select'),
(5, 'FFF', 'FFFF', 'Female', '2021-02-02', 'adasdas@gmail.com', '123456789000', 'aewdserfwefwesfd', 'FFF', 300, '', '', 'Select'),
(6, 'GG', 'GG', 'Female', '2021-02-03', 'gGGGGG', '123524524564', 'dfgsfgdf', 'GGG', 300, '', '', 'Select'),
(7, 'GG', 'GG', 'Female', '2021-02-03', 'gGGGGG', '123524524564', 'dfgsfgdf', 'GGG', 300, 'GG', 'GGGG', 'Admin'),
(8, 'VV', 'VVV', 'Female', '2021-02-03', 'vVVVV', '123434234232', 'sdfsdfsdfdsf', 'VV', 200, '', '', 'Select');

-- --------------------------------------------------------

--
-- Table structure for table `add_fooditem`
--

DROP TABLE IF EXISTS `add_fooditem`;
CREATE TABLE IF NOT EXISTS `add_fooditem` (
  `Item ID` int(11) NOT NULL AUTO_INCREMENT,
  `Item Name` varchar(255) DEFAULT NULL,
  `Price` int(11) DEFAULT NULL,
  `Category` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Item ID`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `add_fooditem`
--

INSERT INTO `add_fooditem` (`Item ID`, `Item Name`, `Price`, `Category`) VALUES
(1, 'SUPE PREMIE', 250, 'SUPE'),
(2, 'SUPE PESHKU', 300, 'SUPE'),
(3, 'SPAGHETTI ME FRUTA DETI', 500, 'PASTA'),
(4, 'RAVIOLI', 600, 'PASTA'),
(5, 'MARGARITA', 250, 'PIZZA'),
(6, 'PROSHUT KERPUDHE', 400, 'PIZZA'),
(7, 'KOLA', 150, 'PIJE'),
(8, 'FANTA', 150, 'PIJE'),
(9, 'SALLAT GREKE', 150, 'SALLATA'),
(10, 'SALLAT RUSE', 200, 'SALLATA');

-- --------------------------------------------------------

--
-- Table structure for table `admin_login`
--

DROP TABLE IF EXISTS `admin_login`;
CREATE TABLE IF NOT EXISTS `admin_login` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `UserType` varchar(50) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_login`
--

INSERT INTO `admin_login` (`ID`, `Username`, `Password`, `UserType`) VALUES
(1, 'Admin', 'Admin', 'Admin');

-- --------------------------------------------------------

--
-- Table structure for table `client_table`
--

DROP TABLE IF EXISTS `client_table`;
CREATE TABLE IF NOT EXISTS `client_table` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Firstname` varchar(50) DEFAULT NULL,
  `Lastname` varchar(50) DEFAULT NULL,
  `Gender` varchar(50) DEFAULT NULL,
  `Phone` varchar(11) DEFAULT NULL,
  `Reservation_Date` date DEFAULT NULL,
  `Reservation_Time` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `client_table`
--

INSERT INTO `client_table` (`ID`, `Firstname`, `Lastname`, `Gender`, `Phone`, `Reservation_Date`, `Reservation_Time`) VALUES
(1, 'D', 'D', 'Male', '1234556788', '2021-02-03', '18:00'),
(2, 'FF', 'FF', 'Female', '12332453465', '2021-02-03', '18:00'),
(3, 'HH', 'HH', 'Male', '1231232345', '2021-02-10', '20:00'),
(4, 'GG', 'GG', 'Female', '1213346767', '2021-02-03', '19:00');

-- --------------------------------------------------------

--
-- Table structure for table `expenses`
--

DROP TABLE IF EXISTS `expenses`;
CREATE TABLE IF NOT EXISTS `expenses` (
  `Item ID` int(11) NOT NULL AUTO_INCREMENT,
  `Item Name` varchar(100) NOT NULL,
  `Price` int(11) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Exp.Total` int(11) NOT NULL,
  `Date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`Item ID`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `expenses`
--

INSERT INTO `expenses` (`Item ID`, `Item Name`, `Price`, `Quantity`, `Exp.Total`, `Date`) VALUES
(1, 'Cups', 5, 100, 500, '2021-02-15 11:53:10'),
(2, 'Plattes', 10, 100, 1000, '2021-02-15 11:53:13'),
(3, 'luge', 5, 100, 500, '2021-02-15 12:38:57'),
(4, 'pirunje', 5, 100, 500, '2021-02-15 12:39:00'),
(5, 'thike', 5, 100, 500, '2021-02-15 12:45:10');

-- --------------------------------------------------------

--
-- Table structure for table `food category`
--

DROP TABLE IF EXISTS `food category`;
CREATE TABLE IF NOT EXISTS `food category` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Food Category` varchar(255) DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `food category`
--

INSERT INTO `food category` (`ID`, `Food Category`, `Description`) VALUES
(1, 'SUPE', 'SUPE'),
(2, 'PASTA', ''),
(3, 'PIZZA', ''),
(4, 'PIJE', ''),
(5, 'SALLATA', '');

-- --------------------------------------------------------

--
-- Table structure for table `income`
--

DROP TABLE IF EXISTS `income`;
CREATE TABLE IF NOT EXISTS `income` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Table No.` int(11) NOT NULL,
  `Total` int(11) NOT NULL,
  `Date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `income`
--

INSERT INTO `income` (`ID`, `Table No.`, `Total`, `Date`) VALUES
(1, 2, 2750, '2021-02-15 11:59:11'),
(2, 2, 2400, '2021-02-15 12:00:02'),
(3, 6, 2300, '2021-02-15 12:43:03'),
(4, 3, 3500, '2021-02-15 12:47:18');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
