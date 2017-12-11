CREATE DATABASE sboot DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
-- 表结构
CREATE TABLE sboot.t_emp (
  id int(10) unsigned NOT NULL AUTO_INCREMENT,
  name varchar(20) NOT NULL DEFAULT '',
  age int(3) NOT NULL DEFAULT 0,
  id_boss int(10) DEFAULT 0,
  PRIMARY KEY (id)
)ENGINE=InnoDB AUTO_INCREMENT = 100 DEFAULT CHARSET=utf8 COMMENT='员工';

INSERT INTO sboot.t_emp VALUES(1,'赵云',34,1);
INSERT INTO sboot.t_emp VALUES(2,'张飞',40,1);
INSERT INTO sboot.t_emp VALUES(3,'张辽',29,2);
INSERT INTO sboot.t_emp VALUES(4,'典韦',56,2);
INSERT INTO sboot.t_emp VALUES(5,'周瑜',14,3);
INSERT INTO sboot.t_emp VALUES(6,'黄盖',45,3);
INSERT INTO sboot.t_emp VALUES(7,'老夫子',88,null);
INSERT INTO sboot.t_emp VALUES(8,'老夫子',88,null);

CREATE TABLE sboot.t_boss (
  id int(10) unsigned NOT NULL AUTO_INCREMENT,
  name varchar(20) NOT NULL DEFAULT '',
  age int(3) NOT NULL DEFAULT 0,
  PRIMARY KEY (id)
)ENGINE=InnoDB AUTO_INCREMENT = 100 DEFAULT CHARSET=utf8 COMMENT='老板';
INSERT INTO sboot.t_boss VALUES(1,'刘备',49);
INSERT INTO sboot.t_boss VALUES(2,'曹操',55);
INSERT INTO sboot.t_boss VALUES(3,'孙权',37);
INSERT INTO sboot.t_boss VALUES(4,'袁绍',62);
