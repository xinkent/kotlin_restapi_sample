create table user (
    id int(10) NOT NULL,
    name varchar(16) NOT NULL,
    age int(10) NOT NULL,
    profile varchar(64) NOT NULL,
    PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into user values (100, "Ichiro", 30, "Hello"), (101, "Jiro", 25, "Hello"), (102, "Saburo", 20, "Hello");

CREATE TABLE `qiita` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1