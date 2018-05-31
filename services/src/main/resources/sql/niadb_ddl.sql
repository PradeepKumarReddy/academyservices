CREATE SCHEMA `niadb` DEFAULT CHARACTER SET utf8 ;

--CREATE TABLE `application_user` (
--  `id` bigint(20) NOT NULL AUTO_INCREMENT,
--  `password` varchar(255) DEFAULT NULL,
--  `username` varchar(255) DEFAULT NULL,
--  PRIMARY KEY (`id`)
--) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;


CREATE TABLE `application_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `user_register_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK1` (`user_register_id`),
  CONSTRAINT `FK1` FOREIGN KEY (`user_register_id`) REFERENCES `user_register` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE TABLE `user_register` (
  `id` int(11) NOT NULL,
  `dob` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `father_name` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `permanent_addr` varchar(255) DEFAULT NULL,
  `permanent_pincode` varchar(255) DEFAULT NULL,
  `permanent_state` varchar(255) DEFAULT NULL,
  `residential_addr` varchar(255) DEFAULT NULL,
  `residential_pincode` varchar(255) DEFAULT NULL,
  `residential_state` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
