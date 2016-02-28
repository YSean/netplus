CREATE DATABASE /*!32312 IF NOT EXISTS*/`netplus` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `netplus`;

/*Table structure for table `apscity` */

DROP TABLE IF EXISTS `apscity`;

CREATE TABLE `apscity` (
  `CITYCODE` varchar(16) NOT NULL,
  `PROVINCECODE` varchar(16) DEFAULT NULL,
  `CITYNAME` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`CITYCODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `apscity` */

/*Table structure for table `apsprovince` */

DROP TABLE IF EXISTS `apsprovince`;

CREATE TABLE `apsprovince` (
  `PROVINCECODE` varchar(16) NOT NULL,
  `PROVINCENAME` varchar(64) DEFAULT NULL,
  `PROVINCETYPE` char(1) DEFAULT NULL,
  PRIMARY KEY (`PROVINCECODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `apsprovince` */

/*Table structure for table `apszone` */

DROP TABLE IF EXISTS `apszone`;

CREATE TABLE `apszone` (
  `ZONECODE` varchar(16) NOT NULL,
  `CITYCODE` varchar(16) DEFAULT NULL,
  `ZONENAME` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`ZONECODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `apszone` */


/*Data for the table `menus` */

/*Table structure for table `msg_news` */

DROP TABLE IF EXISTS `msg_news`;

CREATE TABLE `msg_news` (
  `NEWS_ID` varchar(64) NOT NULL,
  `ORDER_ID` char(1) NOT NULL,
  `NAME` varchar(128) DEFAULT NULL,
  `TYPE` varchar(32) DEFAULT NULL,
  `CONTENT` mediumtext,
  `TEXT` mediumtext,
  `MEDIA_ID` varchar(128) DEFAULT NULL,
  `TITLE` varchar(128) DEFAULT NULL,
  `DESCRIPTION` varchar(128) DEFAULT NULL,
  `MUSIC_URL` varchar(128) DEFAULT NULL,
  `HQ_MUSIC_URL` varchar(128) DEFAULT NULL,
  `THUMB_MEDIA_ID` varchar(128) DEFAULT NULL,
  `PIC_URL` varchar(128) DEFAULT NULL,
  `URL` varchar(128) DEFAULT NULL,
  `AUTHOR` varchar(64) DEFAULT NULL,
  `CONTENT_SOURCE_URL` varchar(128) DEFAULT NULL,
  `DIGEST` varchar(128) DEFAULT NULL,
  `SHOW_COVER_PIC` varchar(16) DEFAULT NULL,
  `CTELLER` varchar(64) DEFAULT NULL,
  `CTIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UTELLER` varchar(64) DEFAULT NULL,
  `UTIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`NEWS_ID`,`ORDER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `msg_news` */

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `PARENT` varchar(64) NOT NULL,
  `PRD_ID` varchar(64) NOT NULL,
  `NAME` varchar(64) DEFAULT NULL,
  `TYPE` char(1) DEFAULT NULL,
  `STATE` char(1) DEFAULT NULL,
  `ORDER_ID` char(2) DEFAULT NULL,
  PRIMARY KEY (`PARENT`,`PRD_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `product` */

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `ROLE_SEQ` varchar(64) NOT NULL,
  `NAME` varchar(20) DEFAULT NULL,
  `STATE` char(1) DEFAULT NULL,
  `CTIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`ROLE_SEQ`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `role` */

/*Table structure for table `role_prd` */

DROP TABLE IF EXISTS `role_prd`;

CREATE TABLE `role_prd` (
  `ROLE_SEQ` varchar(64) NOT NULL,
  `PRD_ID` varchar(64) NOT NULL,
  PRIMARY KEY (`ROLE_SEQ`,`PRD_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `role_prd` */

/*Table structure for table `svr_info` */

DROP TABLE IF EXISTS `svr_info`;

CREATE TABLE `svr_info` (
  `SVR_SEQ` varchar(64) NOT NULL,
  `STATE` char(1) DEFAULT '0' COMMENT '0是正常,1是关闭',
  `SVR_ID` varchar(60) NOT NULL,
  `svr_NAME` varchar(100) DEFAULT NULL,
  `TOKEN` varchar(100) DEFAULT NULL,
  `APP_ID` varchar(100) DEFAULT NULL,
  `APP_SECRET` varchar(100) DEFAULT NULL,
  `ACCESS_TOKEN` varchar(1024) DEFAULT NULL,
  `URL_SEND` varchar(256) DEFAULT NULL,
  `URL_RECV` varchar(256) DEFAULT NULL,
  `SVR_TYPE` char(1) DEFAULT NULL,
  `ENCODEING_AESKEY` varchar(100) DEFAULT NULL,
  `CTIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`SVR_SEQ`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `svr_info` */

insert  into `svr_info`(`SVR_SEQ`,`STATE`,`SVR_ID`,`svr_NAME`,`TOKEN`,`APP_ID`,`APP_SECRET`,`ACCESS_TOKEN`,`URL_SEND`,`URL_RECV`,`SVR_TYPE`,`ENCODEING_AESKEY`,`CTIME`) values ('09c0a153-5e37-444f-82f7-6f227ab1242a','0','gh_5dbc1217ebdb','时尚摩登坊','sxkiler','wx124184999da46591','0a56a212188975ce4a6cd9066d85f987','7200,1453613668161,1hcbnsgokE7bmaomQekk6yu8Ii6LmnJ-v2Q0y28D_wx39qOL-DkGCfm9Q-szp3tRSyAzwTUU_mEKQGysYApKukpahKOJ12LR7pgMLa79ejgMDEaAEAWNO',NULL,'/wechat/Event','F',NULL,'2016-01-24 13:34:27'),('83a6d570-8aae-4f7f-a029-bd9d6002cefc','0','gh_5f52e4ff7fda','ST微信信用卡测试号','silveraegis','wxb0de08ff7df4537f','6f04f20ba8c23bb14f4454ea5c5a0c79','7200,1456014652526,VE5s9qTEXrBTOeXmo9EuCJhHsiDkHEzmkvVMuPQiKgIBHoUlw9RiQzS_a_yrLP_NhfTqVnscu9pEjr6ulzRud0lxGeU248wWcguXhXJufGgAJZhABAGPF',NULL,'/wechat/Event','C',NULL,'2016-02-21 08:30:52');



/*Table structure for table `teller` */

DROP TABLE IF EXISTS `teller`;

CREATE TABLE `teller` (
  `TELLER_SEQ` varchar(64) NOT NULL,
  `TELLER_ID` varchar(40) NOT NULL,
  `NICK_NAME` varchar(32) NOT NULL,
  `ORGANIZATION` varchar(64) NOT NULL,
  `ROLE_ID` varchar(64) NOT NULL,
  `TELLER_NAME` varchar(32) DEFAULT NULL,
  `MOBILE_PHONE` varchar(20) DEFAULT NULL,
  `DEPT_NAME` varchar(20) DEFAULT NULL,
  `PASSWORD` varchar(256) NOT NULL,
  `STATE` char(1) DEFAULT NULL,
  PRIMARY KEY (`TELLER_SEQ`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `teller` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(50) DEFAULT NULL,
  `userAge` int(11) DEFAULT NULL,
  `userAddress` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`userName`,`userAge`,`userAddress`) values (1,'summer',102,'shanghai,pudong'),(4,'飞鸟',80,'原来是魔都的浦东创新园区'),(5,'飞鸟',80,'人民广场');


/*图片资源表*/
CREATE TABLE `meta_image` (
  `IMG_ID` VARCHAR(64) COLLATE utf8_general_ci NOT NULL,
  `IMG_DATA` BLOB,
  `IMG_SIZE` INTEGER(11) DEFAULT NULL,
  `IMG_TYPE` VARCHAR(11) COLLATE utf8_general_ci NOT NULL,
  `IMG_HEIGHT` INTEGER(11) DEFAULT NULL,
  `IMG_WIDTH` INTEGER(11) DEFAULT NULL,
  `IMG_NAME` VARCHAR(64) COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`IMG_ID`) 
) ;
