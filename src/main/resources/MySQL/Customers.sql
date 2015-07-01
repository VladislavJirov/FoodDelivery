CREATE TABLE `customers` (
  `idCustomers` int(11) NOT NULL AUTO_INCREMENT,
  `UUID` binary(16) NOT NULL COMMENT 'UNHEX(REPLACE(UUID(), ''-'', ''''))',
  `login` varchar(30) NOT NULL,
  `password` tinyblob NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `firstName` varchar(15) DEFAULT NULL,
  `lastName` varchar(15) DEFAULT NULL,
  `birthDate` date DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `contactNumber` bigint(20) DEFAULT NULL,
  `validated` bit(1) NOT NULL DEFAULT b'0',
  `registrationDate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `lastVisit` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `deleted` bit(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`idCustomers`),
  UNIQUE KEY `idCustomers_UNIQUE` (`idCustomers`),
  UNIQUE KEY `UUID_UNIQUE` (`UUID`),
  UNIQUE KEY `login_UNIQUE` (`login`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  UNIQUE KEY `contactNumber_UNIQUE` (`contactNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8


# SELECT HEX(UUID) AS UUID FROM customers

# INSERT INTO customers(UUID,login,password,email,firstName,lastName,birthDate,address,contactNumber)
# VALUES(UNHEX(REPLACE(UUID(), '-', '')),'vzhirov','password','piromanico@mail.ru','Владислав','Жиров','1992-08-19','Bukhar-Zhirau',8707542424);