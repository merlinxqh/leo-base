SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS t_resource;
DROP TABLE IF EXISTS user;




/* Create Tables */

-- 系统资源表
CREATE TABLE t_resource
(
	id bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
	code varchar(50) COMMENT 'code',
	name varchar(100) COMMENT '资源名称',
	url varchar(100) COMMENT '资源路径',
	resource_type int(2) COMMENT '资源类型',
	parent_code varchar(50) COMMENT '上级',
	icon_class varchar(50) COMMENT '样式',
	PRIMARY KEY (id)
) COMMENT = '系统资源表';


-- 用户表
CREATE TABLE user
(
	id bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
	username varchar(100) COMMENT 'username',
	password varchar(100) COMMENT 'password',
	enabled int(1) COMMENT 'enabled',
	create_date timestamp COMMENT 'create_date',
	PRIMARY KEY (id)
) COMMENT = '用户表';



