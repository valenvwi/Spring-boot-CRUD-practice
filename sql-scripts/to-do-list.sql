CREATE DATABASE  IF NOT EXISTS `to_do_list`;
USE `to_do_list`;

DROP TABLE IF EXISTS `task`;

CREATE TABLE `task` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(45) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


INSERT INTO `task` VALUES 
	(1,'Do the laundry','Wednesday afternoon'),
	(2,'Water the plants','10 ml per time'),
	(3,'Get groceries','Cheese, bread, apples, detergent'),
	(4,'Learn spring boot','6 hours per day'),
	(5,'Send bday message to my sis','full of love');

