CREATE TABLE  `product` (
  `id`                INT             NOT NULL     AUTO_INCREMENT,
  `version`           TINYINT(5)      NULL         DEFAULT 0,
  `name`              VARCHAR(100)    NOT NULL,
  `stock_number`      VARCHAR(45)     NULL,
  `description`       VARCHAR(100)    NULL,
  `rating`            TINYINT(5)      NULL         DEFAULT 0,
  `number_of_reviews` INT(10)         NULL         DEFAULT 0,
  `list_price`        FLOAT           NULL         DEFAULT 0,
  `percent_off`       INT(100)        NULL         DEFAULT 0,
  `actual_price`      FLOAT           NULL,
  `quantity`          INT             NULL,
  `isRestircted`      TINYINT(5)      NOT NULL     DEFAULT 0,
  PRIMARY KEY (`id`));