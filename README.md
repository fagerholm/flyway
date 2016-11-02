# Sample flyway integration with Oracle 11g (XE)

### Download and run Oracle XE 11g docker image
1. ```docker pull wnameless/oracle-xe-11g```
2. ```docker run -d -p 49160:22 -p 49161:1521 wnameless/oracle-xe-11g```

More information about the Oracle Docker Image:
https://hub.docker.com/r/wnameless/oracle-xe-11g/

### Connect to the database using the following credentials
* hostname: localhost
* port: 49161
* sid: xe
* username: system
* password: oracle

#### Create a new user
1. ```create user sample identified by sample;```
2. ```grant CREATE SESSION, ALTER SESSION, CREATE DATABASE LINK, CREATE MATERIALIZED VIEW, CREATE PROCEDURE, CREATE PUBLIC SYNONYM, CREATE ROLE, CREATE SEQUENCE, CREATE SYNONYM, CREATE TABLE, CREATE TRIGGER, CREATE TYPE, CREATE VIEW, UNLIMITED TABLESPACE to sample;```

### Install the Oracle Driver in your Maven Repository
https://www.mkyong.com/maven/how-to-add-oracle-jdbc-driver-in-your-maven-local-repository/



### Run Flyway migration
```mvn flyway:migrate```

Now a new table "person" is added and some data is added to it
