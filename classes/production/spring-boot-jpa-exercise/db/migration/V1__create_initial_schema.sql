CREATE TABLE `spring_boot_jpa_ex_dev`.`product` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `version` TINYINT(5) NULL DEFAULT 0,
  `name` VARCHAR(100) NOT NULL,
  `stockNumber` VARCHAR(45) NULL,
  `description` VARCHAR(100) NULL,
  `rating` TINYINT(5) NULL DEFAULT 0,
  `numberOfReviews` INT(10) NULL DEFAULT 0,
  `listPrice` FLOAT NULL DEFAULT 0,
  `percentOff` INT(100) NULL DEFAULT 0,
  `actualPrice` FLOAT NULL,
  `quantity` INT NULL,
  `isRestircted` TINYINT(5) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`));