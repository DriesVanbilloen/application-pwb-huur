CREATE TABLE client (
  id          bigint(20)   NOT NULL   AUTO_INCREMENT,
  first_name  varchar(50)  NOT NULL,
  last_name   varchar(50)  NOT NULL,
  email       varchar(75)  NOT NULL,

  PRIMARY KEY (id)
)