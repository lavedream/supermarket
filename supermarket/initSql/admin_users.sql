-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        10.0.16-MInnodbDB - mariadb.org binary distribution
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.1.0.4904
-- --------------------------------------------------------
-- 导出  表 test.inventorys 结构
CREATE TABLE IF NOT EXISTS `inventorys` (
  `inid` int(11) NOT NULL AUTO_INCREMENT,
  `pid` bigint(20) DEFAULT NULL COMMENT '商品id',
  `remark` varchar(255) DEFAULT NULL COMMENT '说明',
  `created_at` datetime DEFAULT NULL COMMENT '创建时间',
  `updated_at` datetime DEFAULT NULL COMMENT '修改时间',
  `numbers` bigint(20) DEFAULT NULL COMMENT '数量',
  PRIMARY KEY (`inid`)
) ENGINE=Innodb AUTO_INCREMENT=2 DEFAULT CHARSET=utf8  COMMENT='库存表';


-- 导出  表 test.order_sheets 结构
CREATE TABLE IF NOT EXISTS `order_sheets` (
  `oid` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_number` varchar(255) DEFAULT NULL COMMENT '项目编号',
  `created_at` datetime DEFAULT NULL COMMENT '创建时间',
  `updated_at` datetime DEFAULT NULL COMMENT '修改时间',
  `order_name` varchar(255) DEFAULT NULL COMMENT '定单名称',
  PRIMARY KEY (`oid`)
) ENGINE=Innodb AUTO_INCREMENT=2 DEFAULT CHARSET=utf8  COMMENT='定单表';



-- 导出  表 test.products 结构
CREATE TABLE IF NOT EXISTS `products` (
  `pid` int(11) NOT NULL AUTO_INCREMENT COMMENT '项目id',
  `product_name` varchar(255) DEFAULT '' COMMENT '商品名称',
  `purchase_price` double DEFAULT NULL COMMENT '商品进价',
  `sales_price` double DEFAULT NULL COMMENT '销售价格',
  `is_show_purchase_price` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否显示进价',
  `project_code` varchar(255) NOT NULL DEFAULT '' COMMENT '商品编码',
  `created_at` datetime DEFAULT NULL COMMENT '录入系统时间',
  `updated_at` datetime NOT NULL COMMENT '商品更新时间',
  PRIMARY KEY (`pid`,`updated_at`)
) ENGINE=Innodb AUTO_INCREMENT=41 DEFAULT CHARSET=utf8  COMMENT='商品表';




-- 导出  表 test.product_order_sheet_tabs 结构
CREATE TABLE IF NOT EXISTS `product_order_sheet_tabs` (
  `osid` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `created_at` datetime DEFAULT NULL COMMENT '创建时间',
  `updated_at` datetime DEFAULT NULL COMMENT '更新时间',
  `oid` bigint(20) DEFAULT NULL COMMENT '定单id',
  `pid` bigint(20) DEFAULT NULL COMMENT '产品id',
  PRIMARY KEY (`osid`)
) ENGINE=Innodb DEFAULT CHARSET=utf8  COMMENT='定单与产品中间表';



-- 导出  表 test.users 结构
CREATE TABLE IF NOT EXISTS `users` (
  `uid` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户表主键',
  `uname` varchar(250) DEFAULT NULL COMMENT '用户名称',
  `sex` tinyint(4) DEFAULT NULL COMMENT '性别 0：女 | 1：男',
  `created_at` datetime DEFAULT NULL COMMENT '创建时间',
  `updated_at` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`uid`)
) ENGINE=Innodb AUTO_INCREMENT=2 DEFAULT CHARSET=utf8  COMMENT='用户表';




-- 服务器版本:                        10.0.16-MariaDB - mariadb.org binary distribution
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.1.0.4904
-- --------------------------------------------------------


DEFAULT CHARSET=utf8 PAGE_CHECKSUM=1 TRANSACTIONAL=1 COMMENT='库存表';


INSERT INTO `inventorys` (`inid`, `pid`, `remark`, `created_at`, `updated_at`, `numbers`) VALUES
	(1, 40, NULL, '2015-04-17 14:39:12', '2015-04-20 16:56:18', 33);

	

INSERT INTO `order_sheets` (`oid`, `order_number`, `created_at`, `updated_at`, `order_name`) VALUES
	(1, NULL, NULL, NULL, '11');

	
INSERT INTO `products` (`pid`, `product_name`, `purchase_price`, `sales_price`, `is_show_purchase_price`, `project_code`, `created_at`, `updated_at`) VALUES
	(1, '5555', 2.1314, 1, 1, '1', '2015-03-03 18:51:58', '2015-03-22 20:52:47'),
	(2, '11', 111, NULL, 0, '', '2015-03-14 14:58:05', '2015-03-14 14:58:05'),
	(3, '22', 22, NULL, 0, '', '2015-03-14 17:59:49', '2015-03-14 17:59:49'),
	(4, '22', 22, NULL, 0, '', '2015-03-14 18:00:01', '2015-03-14 18:00:01'),
	(5, '22', 22, NULL, 0, '', '2015-03-14 18:00:51', '2015-03-14 18:00:51'),
	(6, '33', 33, NULL, 0, '', '2015-03-14 18:04:57', '2015-03-14 18:04:57'),
	(7, '33', 33, NULL, 0, '', '2015-03-14 18:07:00', '2015-03-14 18:07:00'),
	(8, '44', 44, NULL, 0, '', '2015-03-14 18:07:35', '2015-03-14 18:07:35'),
	(9, '55', 55, NULL, 0, '', '2015-03-17 10:35:12', '2015-03-17 10:35:12'),
	(10, '77', 77, NULL, 0, '', '2015-03-17 14:07:34', '2015-03-17 14:07:34'),
	(11, '', NULL, NULL, 0, '', '2015-03-17 14:09:18', '2015-03-17 14:09:18'),
	(12, '88', 88, NULL, 0, '', '2015-03-17 14:12:37', '2015-03-17 14:12:37'),
	(13, '99', 99, NULL, 0, '', '2015-03-17 14:33:55', '2015-03-17 14:33:55'),
	(14, '99', 99, NULL, 0, '', '2015-03-17 15:06:37', '2015-03-17 15:06:37'),
	(15, '1214', 1214, NULL, 0, '', '2015-03-17 15:07:26', '2015-03-22 20:41:31'),
	(16, '99', 99, NULL, 0, '', '2015-03-17 15:40:19', '2015-03-17 15:40:19'),
	(17, '99', 99, NULL, 0, '', '2015-03-17 16:13:11', '2015-03-17 16:13:11'),
	(18, '99', 99, NULL, 0, '', '2015-03-17 16:21:30', '2015-03-17 16:21:30'),
	(19, '99', 99, NULL, 0, '', '2015-03-17 16:33:28', '2015-03-17 16:33:28'),
	(20, '99', 99, NULL, 0, '', '2015-03-17 16:33:55', '2015-03-17 16:33:55'),
	(21, '99', 99, NULL, 0, '', '2015-03-17 16:50:08', '2015-03-17 16:50:08'),
	(22, '99', 99, NULL, 0, '', '2015-03-17 16:59:42', '2015-03-17 16:59:42'),
	(23, '99', 99, NULL, 0, '', '2015-03-17 17:01:58', '2015-03-17 17:01:58'),
	(24, '22', 22, NULL, 0, '', '2015-03-17 17:03:36', '2015-03-17 17:03:36'),
	(25, '22', 22, NULL, 0, '', '2015-03-17 17:04:54', '2015-03-17 17:04:54'),
	(26, '22', 22, NULL, 0, '', '2015-03-17 17:06:12', '2015-03-17 17:06:12'),
	(27, 'ä½ å¥½ä¸ç', 23, NULL, 0, '', '2015-04-17 10:30:02', '2015-04-17 10:30:02'),
	(28, '7878', 78, NULL, 0, '', '2015-04-17 10:34:46', '2015-04-17 10:34:46'),
	(29, '00', 0, NULL, 0, '', '2015-04-17 10:43:25', '2015-04-17 10:43:25'),
	(30, '99', 99, NULL, 0, '', '2015-04-17 10:52:36', '2015-04-17 10:52:36'),
	(31, '99', 99, NULL, 0, '', '2015-04-17 11:07:48', '2015-04-17 11:07:48'),
	(32, 'sfdsf', 3, NULL, 0, '', '2015-04-17 13:50:49', '2015-04-17 13:50:49'),
	(33, 'sfdsf', 3, NULL, 0, '', '2015-04-17 14:08:33', '2015-04-17 14:08:33'),
	(34, 'sfdsf', 3, NULL, 0, '', '2015-04-17 14:17:01', '2015-04-17 14:17:01'),
	(35, 'sfdsf', 3, NULL, 0, '', '2015-04-17 14:19:22', '2015-04-17 14:19:22'),
	(36, '75', 575, NULL, 0, '', '2015-04-17 14:28:34', '2015-04-17 14:28:34'),
	(37, '99', 99, NULL, 0, '', '2015-04-17 14:30:22', '2015-04-17 14:30:22'),
	(38, '99', 99, NULL, 0, '', '2015-04-17 14:33:11', '2015-04-17 14:33:11'),
	(39, '99', 99, NULL, 0, '', '2015-04-17 14:38:34', '2015-04-17 14:38:34'),
	(40, '99', 99, NULL, 0, '', '2015-04-17 14:39:11', '2015-04-17 14:39:11');

	
INSERT INTO `users` (`uid`, `uname`, `sex`, `created_at`, `updated_at`) VALUES
	(1, 'hello world', 1, '2015-02-11 11:03:12', '2015-02-11 11:03:12');
	
	
	
	

	
	
	
	
	
	
drop index rid on menu_role_tabs;

drop index mid_index on menu_role_tabs;

drop table if exists menu_role_tabs;

drop table if exists menus;

drop index uid on role_user_tabs;

drop index rid_index on role_user_tabs;

drop table if exists role_user_tabs;

drop table if exists roles;

/*==============================================================*/
/* Table: menu_role_tabs                                        */
/*==============================================================*/
create table menu_role_tabs
(
   mrid                 bigint(20) not null auto_increment comment '主键',
   rid                  bigint(20) comment '角色id',
   created_at           bigint(13) comment '创建时间',
   updated_at           bigint(13) comment '修改时间',
   mid                  bigint(20),
   primary key (mrid)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

alter table menu_role_tabs comment '菜单_角色_中间表';

/*==============================================================*/
/* Index: mid_index                                             */
/*==============================================================*/
create index mid_index on menu_role_tabs
(
   mid
);

/*==============================================================*/
/* Index: rid                                                   */
/*==============================================================*/
create index rid on menu_role_tabs
(
   rid
);

/*==============================================================*/
/* Table: menus                                                 */
/*==============================================================*/
create table menus
(
   mid                  bigint(20) not null auto_increment comment '菜单id',
   menu_name            varchar(200) comment '菜单名称',
   created_at           bigint(13) comment '创建时间',
   updated_at           bigint(13) comment '修改时间',
   menu_url             varchar(300) comment '菜单链接',
   orders               tinyint comment '排序',
   parent_id            bigint(20),
   primary key (mid)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

alter table menus comment '菜单表';

/*==============================================================*/
/* Table: role_user_tabs                                        */
/*==============================================================*/
create table role_user_tabs
(
   ruid                 bigint(20) auto_increment comment '主键',
   rid                  bigint(20) comment '角色id',
   uid                  bigint(20) comment '人员id',
   created_at           bigint(13) comment '创建时间',
   updated_at           bigint(13) comment '修改时间'
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

alter table role_user_tabs comment '角色_人_中间表';

/*==============================================================*/
/* Index: rid_index                                             */
/*==============================================================*/
create index rid_index on role_user_tabs
(
   rid
);

/*==============================================================*/
/* Index: uid                                                   */
/*==============================================================*/
create index uid on role_user_tabs
(
   uid
);

/*==============================================================*/
/* Table: roles                                                 */
/*==============================================================*/
create table roles
(
   rid                  bigint(20) not null auto_increment comment '角色主键',
   rorle_name           varchar(200) comment '角色名称',
   created_at           bigint(13) comment '创建时间',
   updated_at           bigint(13) comment '修改时间',
   primary key (rid)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

alter table roles comment '角色表';

