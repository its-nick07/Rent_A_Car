-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 05, 2020 at 11:41 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rent_a_car`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `GetCustomerByAddress` (IN `cityname` VARCHAR(255))  begin
select * 
from customer
where address = cityname;
end$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `billing`
--

CREATE TABLE `billing` (
  `bill_id` int(5) UNSIGNED NOT NULL,
  `bill_amount` int(12) UNSIGNED NOT NULL,
  `customer_id` int(5) UNSIGNED NOT NULL,
  `late_penalty` int(50) UNSIGNED NOT NULL,
  `damage_penalty` int(50) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `car`
--

CREATE TABLE `car` (
  `car_id` int(5) UNSIGNED NOT NULL,
  `brand_name` varchar(50) NOT NULL,
  `model` varchar(50) NOT NULL,
  `product_year` int(4) NOT NULL,
  `mileage` int(20) UNSIGNED NOT NULL,
  `color` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `car`
--

INSERT INTO `car` (`car_id`, `brand_name`, `model`, `product_year`, `mileage`, `color`) VALUES
(2005, 'Benz', 'C200', 2011, 2500, 'Black'),
(13764, 'BMW', '320i', 2009, 450, 'Navy Blue'),
(20001, 'Toyota', 'Sedan', 2004, 204, 'Black');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `category_id` int(5) UNSIGNED NOT NULL,
  `name` varchar(50) NOT NULL,
  `car_id` int(5) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `customer_id` int(5) UNSIGNED NOT NULL,
  `customer_name` varchar(50) NOT NULL,
  `driver_license_num` int(8) NOT NULL,
  `phone` int(12) UNSIGNED NOT NULL,
  `gender` varchar(20) NOT NULL,
  `age` int(2) UNSIGNED NOT NULL,
  `address` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Triggers `customer`
--
DELIMITER $$
CREATE TRIGGER `UpdateRecords` AFTER INSERT ON `customer` FOR EACH ROW insert into Rental(ccustomer_id) values (customer_id);
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `employee_id` int(5) UNSIGNED NOT NULL,
  `employee_name` varchar(50) NOT NULL,
  `contact` int(10) NOT NULL,
  `designation` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `employee_details`
--

CREATE TABLE `employee_details` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee_details`
--

INSERT INTO `employee_details` (`username`, `password`) VALUES
('admin', 'admin123'),
('Malcom', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `insurance_broker`
--

CREATE TABLE `insurance_broker` (
  `broker_id` int(5) UNSIGNED NOT NULL,
  `broker_name` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `telephone` int(12) UNSIGNED NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `insurance_broker`
--

INSERT INTO `insurance_broker` (`broker_id`, `broker_name`, `address`, `telephone`, `email`) VALUES
(987, 'InsuredInc', 'Siteki', 78128746, 'inc@gmail.com'),
(89745, 'Out Insuranc', 'South Africa', 9827642, 'out@gmail.com'),
(98742, 'Out Insurance', 'Po Box 45', 23838452, 'out@outlook.com');

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `order_id` int(5) UNSIGNED NOT NULL,
  `brand_ordered` varchar(50) NOT NULL,
  `quantity` int(5) UNSIGNED NOT NULL,
  `supplier_phone` int(12) UNSIGNED NOT NULL,
  `supplier_id` int(5) UNSIGNED NOT NULL,
  `employee_id` int(5) UNSIGNED NOT NULL,
  `car_model` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `rental`
--

CREATE TABLE `rental` (
  `rental_id` int(5) UNSIGNED NOT NULL,
  `start_date` varchar(50) DEFAULT NULL,
  `end_date` varchar(50) DEFAULT NULL,
  `payment` int(10) UNSIGNED NOT NULL,
  `remarks` text,
  `customer_id` int(5) UNSIGNED NOT NULL,
  `car_id` int(5) UNSIGNED NOT NULL,
  `employee_id` int(5) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `rental_insurance`
--

CREATE TABLE `rental_insurance` (
  `insurance_id` int(5) UNSIGNED NOT NULL,
  `broker_name` varchar(50) NOT NULL,
  `description` text,
  `policy` text,
  `rental_id` int(5) UNSIGNED NOT NULL,
  `broker_id` int(5) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

CREATE TABLE `reservation` (
  `reserve_id` int(5) UNSIGNED NOT NULL,
  `brand_name` varchar(50) NOT NULL,
  `pick_up_date` varchar(50) NOT NULL,
  `car_id` int(5) UNSIGNED NOT NULL,
  `customer_id` int(5) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Stand-in structure for view `reserveddetails`
-- (See below for the actual view)
--
CREATE TABLE `reserveddetails` (
`customer_name` varchar(50)
,`phone` int(12) unsigned
,`brand_name` varchar(50)
);

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `supplier_id` int(5) UNSIGNED NOT NULL,
  `supplier_name` varchar(50) NOT NULL,
  `supplier_contact` int(12) UNSIGNED NOT NULL,
  `supplier_address` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Stand-in structure for view `totalrentals`
-- (See below for the actual view)
--
CREATE TABLE `totalrentals` (
`rental_id` int(5) unsigned
,`sum(car_id)` decimal(32,0)
);

-- --------------------------------------------------------

--
-- Structure for view `reserveddetails`
--
DROP TABLE IF EXISTS `reserveddetails`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `reserveddetails`  AS  select `c`.`customer_name` AS `customer_name`,`c`.`phone` AS `phone`,`r`.`brand_name` AS `brand_name` from (`customer` `c` join `reservation` `r` on((`c`.`customer_id` = `r`.`customer_id`))) ;

-- --------------------------------------------------------

--
-- Structure for view `totalrentals`
--
DROP TABLE IF EXISTS `totalrentals`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `totalrentals`  AS  select `rental`.`rental_id` AS `rental_id`,sum(`rental`.`car_id`) AS `sum(car_id)` from `rental` ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `billing`
--
ALTER TABLE `billing`
  ADD PRIMARY KEY (`bill_id`),
  ADD KEY `customer_id` (`customer_id`);

--
-- Indexes for table `car`
--
ALTER TABLE `car`
  ADD PRIMARY KEY (`car_id`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`category_id`),
  ADD KEY `car_id` (`car_id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`customer_id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`employee_id`);

--
-- Indexes for table `insurance_broker`
--
ALTER TABLE `insurance_broker`
  ADD PRIMARY KEY (`broker_id`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`order_id`),
  ADD KEY `employee_id` (`employee_id`),
  ADD KEY `supplier_id` (`supplier_id`);

--
-- Indexes for table `rental`
--
ALTER TABLE `rental`
  ADD PRIMARY KEY (`rental_id`),
  ADD KEY `customer_id` (`customer_id`),
  ADD KEY `car_id` (`car_id`),
  ADD KEY `employee_id` (`employee_id`);

--
-- Indexes for table `rental_insurance`
--
ALTER TABLE `rental_insurance`
  ADD PRIMARY KEY (`insurance_id`),
  ADD KEY `rental_id` (`rental_id`),
  ADD KEY `broker_id` (`broker_id`);

--
-- Indexes for table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`reserve_id`),
  ADD KEY `car_id` (`car_id`),
  ADD KEY `customer_id` (`customer_id`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`supplier_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `billing`
--
ALTER TABLE `billing`
  ADD CONSTRAINT `billing_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`);

--
-- Constraints for table `category`
--
ALTER TABLE `category`
  ADD CONSTRAINT `category_ibfk_1` FOREIGN KEY (`car_id`) REFERENCES `car` (`car_id`);

--
-- Constraints for table `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`employee_id`),
  ADD CONSTRAINT `orders_ibfk_2` FOREIGN KEY (`supplier_id`) REFERENCES `supplier` (`supplier_id`);

--
-- Constraints for table `rental`
--
ALTER TABLE `rental`
  ADD CONSTRAINT `rental_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`),
  ADD CONSTRAINT `rental_ibfk_2` FOREIGN KEY (`car_id`) REFERENCES `car` (`car_id`),
  ADD CONSTRAINT `rental_ibfk_3` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`employee_id`);

--
-- Constraints for table `rental_insurance`
--
ALTER TABLE `rental_insurance`
  ADD CONSTRAINT `rental_insurance_ibfk_1` FOREIGN KEY (`rental_id`) REFERENCES `rental` (`rental_id`),
  ADD CONSTRAINT `rental_insurance_ibfk_2` FOREIGN KEY (`broker_id`) REFERENCES `insurance_broker` (`broker_id`);

--
-- Constraints for table `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `reservation_ibfk_1` FOREIGN KEY (`car_id`) REFERENCES `car` (`car_id`),
  ADD CONSTRAINT `reservation_ibfk_2` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
