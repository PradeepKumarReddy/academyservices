--CREATE SCHEMA `niadb` DEFAULT CHARACTER SET utf8 ;

--CREATE TABLE `application_user` (
--  `id` bigint(20) NOT NULL AUTO_INCREMENT,
--  `password` varchar(255) DEFAULT NULL,
--  `username` varchar(255) DEFAULT NULL,
--  PRIMARY KEY (`id`)
--) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

CREATE SCHEMA `niadb` DEFAULT CHARACTER SET utf8 ;

USE `niadb`;

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `user_register` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dob` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `father_name` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `permanent_addr` varchar(255) DEFAULT NULL,
  `permanent_pincode` varchar(255) DEFAULT NULL,
  `permanent_state` varchar(255) DEFAULT NULL,
  `registration_id` varchar(255) DEFAULT NULL,
  `residential_addr` varchar(255) DEFAULT NULL,
  `residential_pincode` varchar(255) DEFAULT NULL,
  `residential_state` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


CREATE TABLE `application_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `user_register_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK1` (`user_register_id`),
  CONSTRAINT `FK1` FOREIGN KEY (`user_register_id`) REFERENCES `user_register` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


CREATE TRIGGER registration_auto_id BEFORE INSERT ON user_register
       FOR EACH ROW
       SET NEW.registration_id = CONCAT("NA",LPAD((SELECT AUTO_INCREMENT 
       FROM information_schema.TABLES 
       WHERE TABLE_SCHEMA = DATABASE() AND 
       TABLE_NAME = 'user_register'), 4, '0'));
       