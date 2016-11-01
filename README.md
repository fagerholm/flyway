# flyway

Download Oracle 11g Docker Image:
* docker pull wnameless/oracle-xe-11g

Run Oracle 11g Docker Image:
* docker run -d -p 49160:22 -p 49161:1521 wnameless/oracle-xe-11g

Database Connection:
* hostname: localhost
* port: 49161
* sid: xe
* username: system
* password: oracle

More information about the Oracle Docker Image:
https://hub.docker.com/r/wnameless/oracle-xe-11g/
