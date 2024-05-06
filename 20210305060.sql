-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 06 May 2024, 21:18:38
-- Sunucu sürümü: 10.4.32-MariaDB
-- PHP Sürümü: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `20210305060`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `customer`
--

CREATE TABLE `customer` (
  `ID` int(11) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Surname` varchar(100) NOT NULL,
  `Adress` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `customer`
--

INSERT INTO `customer` (`ID`, `Name`, `Surname`, `Adress`) VALUES
(1, 'Muhammet ', 'Gür', 'İstanbul / Maltepe'),
(2, 'Bekir', 'Yavuz', 'İstanbul / Ataşehir'),
(3, 'Ali Kağan', 'Yeşil', 'İstanbul / Tuzla\r\n'),
(5, 'Cihan', 'Bayrak', 'İstanbul / Tuzla'),
(6, 'Ege', 'Cinel', 'İstanbul / Beylikdüzü');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `delivery person`
--

CREATE TABLE `delivery person` (
  `ID` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `surname` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `delivery person`
--

INSERT INTO `delivery person` (`ID`, `name`, `surname`) VALUES
(1, 'Abdullah', 'Öncü');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `menu`
--

CREATE TABLE `menu` (
  `ID` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `menu`
--

INSERT INTO `menu` (`ID`, `name`, `price`) VALUES
(1, 'Hamburger', 3),
(2, 'Cheeseburger', 3),
(3, 'Chicken burger', 4),
(4, 'Fried chicken', 4),
(5, 'pizza', 5);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `restaurant`
--

CREATE TABLE `restaurant` (
  `ID` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `telephone` char(11) NOT NULL,
  `adress` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `restaurant`
--

INSERT INTO `restaurant` (`ID`, `name`, `telephone`, `adress`) VALUES
(1, 'Green\'s Restaurant', '111 111 111', 'İstanbul / Tuzla');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `restaurant staff`
--

CREATE TABLE `restaurant staff` (
  `ID` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `surname` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `restaurant staff`
--

INSERT INTO `restaurant staff` (`ID`, `name`, `surname`) VALUES
(1, 'Ali', 'Yeşil'),
(2, 'Dilek', 'Yeşil');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`ID`);

--
-- Tablo için indeksler `delivery person`
--
ALTER TABLE `delivery person`
  ADD PRIMARY KEY (`ID`);

--
-- Tablo için indeksler `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`ID`);

--
-- Tablo için indeksler `restaurant`
--
ALTER TABLE `restaurant`
  ADD PRIMARY KEY (`ID`);

--
-- Tablo için indeksler `restaurant staff`
--
ALTER TABLE `restaurant staff`
  ADD PRIMARY KEY (`ID`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `customer`
--
ALTER TABLE `customer`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Tablo için AUTO_INCREMENT değeri `delivery person`
--
ALTER TABLE `delivery person`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Tablo için AUTO_INCREMENT değeri `menu`
--
ALTER TABLE `menu`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Tablo için AUTO_INCREMENT değeri `restaurant staff`
--
ALTER TABLE `restaurant staff`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
