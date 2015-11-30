CREATE TABLE TELLER 
(
   TELLER_SEQ         VARCHAR(64)       NOT NULL,
   TELLER_ID          VARCHAR(40)       NOT NULL,
   NICK_NAME          VARCHAR(32)       NOT NULL,
   ORGANIZATION	      VARCHAR(64)       NOT NULL,
   ROLE_ID	      VARCHAR(64)       NOT NULL,
   TELLER_NAME        VARCHAR(32)  ,
   MOBILE_PHONE       VARCHAR(20)  ,
   DEPT_NAME          VARCHAR(20)  ,
   PASSWORD           VARCHAR(256)  NOT NULL,
   STATE              CHAR(1),
   CONSTRAINT PK_TELLER PRIMARY KEY (TELLER_SEQ)
) ;
CREATE TABLE ROLE 
(
   ROLE_SEQ             VARCHAR(64)         NOT NULL,
   NAME                 VARCHAR(20),
   STATE                CHAR(1),
   CTIME		TIMESTAMP,
   CONSTRAINT PK_ROLE PRIMARY KEY (ROLE_SEQ)
) ;

CREATE TABLE PRODUCT 
(
   PARENT               VARCHAR(64)         NOT NULL,
   PRD_ID               VARCHAR(64)         NOT NULL,
   NAME                 VARCHAR(64),
   TYPE                 CHAR(1),
   STATE                CHAR(1),
   ORDER_ID             CHAR(2),
   CONSTRAINT PK_PRODUCT PRIMARY KEY (PARENT, PRD_ID) 
) ;

CREATE TABLE ROLE_PRD 
(
   ROLE_SEQ             VARCHAR(64)         NOT NULL,
   PRD_ID               VARCHAR(64)         NOT NULL,
   CONSTRAINT PK_ROLE_PRD PRIMARY KEY (ROLE_SEQ, PRD_ID) 
) ;


CREATE TABLE SVR_INFO 
(
   SVR_SEQ              VARCHAR(64)         NOT NULL,
   STATE                CHAR(1),
   ID                   VARCHAR(60)         NOT NULL,
   NAME                 VARCHAR(100),
   TOKEN                VARCHAR(100),
   APP_ID               VARCHAR(100),
   APP_SECRET           VARCHAR(100),
   ACCESS_TOKEN         VARCHAR(1024),
   URL_SEND             VARCHAR(256),
   URL_RECV             VARCHAR(256),
   SVR_TYPE 		 CHAR(1),
   ENCODEING_AESKEY      VARCHAR(100),
   CTIME		TIMESTAMP,
   CONSTRAINT PK_SVR_INFO PRIMARY KEY (SVR_SEQ) 
) ;


CREATE TABLE MSG_NEWS 
(
   NEWS_ID              VARCHAR(64)  NOT NULL,
   ORDER_ID             CHAR(1) NOT NULL,
   NAME                 VARCHAR(128),
   TYPE                 VARCHAR(32),
   CONTENT              MEDIUMTEXT,
   TEXT                 MEDIUMTEXT,
   MEDIA_ID             VARCHAR(128),
   TITLE                VARCHAR(128),
   DESCRIPTION          VARCHAR(128),
   MUSIC_URL            VARCHAR(128),
   HQ_MUSIC_URL         VARCHAR(128),
   THUMB_MEDIA_ID       VARCHAR(128),
   PIC_URL              VARCHAR(128),
   URL                  VARCHAR(128),
   AUTHOR               VARCHAR(64),
   CONTENT_SOURCE_URL   VARCHAR(128),
   DIGEST               VARCHAR(128),
   SHOW_COVER_PIC       VARCHAR(16),
   
   CTELLER              VARCHAR(64),
   CTIME                TIMESTAMP,
   UTELLER              VARCHAR(64),
   UTIME                TIMESTAMP,
   CONSTRAINT PK_MSG_NEWS PRIMARY KEY (NEWS_ID,ORDER_ID) 
);