create table user3 (userId int not null identity,username varchar(50) not null,password varchar(50) not null,userSex int not null,status int not null,regDate datetime not null);

insert into user3 (username,password,userSex,status,regDate)values('admin','12345678',1,2,getdate());