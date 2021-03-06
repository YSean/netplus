CREATE TABLE APSCITY 
(
   CITYCODE             VARCHAR(16)         NOT NULL,
   PROVINCECODE         VARCHAR(16),
   CITYNAME             VARCHAR(128),
   CONSTRAINT PK_APSCITY PRIMARY KEY (CITYCODE) 
);

CREATE TABLE APSPROVINCE 
(
   PROVINCECODE         VARCHAR(16)         NOT NULL,
   PROVINCENAME         VARCHAR(64),
   PROVINCETYPE         CHAR(1),
   CONSTRAINT PK_APSPROVINCE PRIMARY KEY (PROVINCECODE) 
);

CREATE TABLE APSZONE 
(
   ZONECODE             VARCHAR(16)         NOT NULL,
   CITYCODE             VARCHAR(16),
   ZONENAME             VARCHAR(128),
   CONSTRAINT PK_APSZONE PRIMARY KEY (ZONECODE)
);


CREATE TABLE MENUS 
(
   MENU_SEQ             VARCHAR(64) NOT NULL,
   MENU_CODE		VARCHAR(64) NOT NULL,
   MENU_TYPE            VARCHAR(10) NOT NULL,
   MENU_NAME            VARCHAR(32),
   DEF                  VARCHAR(256),
   PARENT		VARCHAR(64),
   ORDER_ID             VARCHAR(20),
   CONSTRAINT PK_MENUS PRIMARY KEY (MENU_SEQ) 
);

CREATE TABLE SVR_MENUS
(
   SVR_SEQ	      VARCHAR(64) NOT NULL,
   MENU_SEQ           VARCHAR(64),
   MENU_ID            VARCHAR(64),
   CONSTRAINT PK_SVR_MENUS PRIMARY KEY (SVR_SEQ,MENU_SEQ) 
);
