create database user_information;
use user_information;
create table registration (
username varchar(30) PRIMARY KEY,
password varchar(30),
email varchar(50) UNIQUE KEY
)
select * from registration;