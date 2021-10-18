create schema game;
create table  game.details(id int primary key not null,place varchar(20),d_name varchar(27),d_type varchar(34));
insert into game.details values(5,"bangalore",'football','outdoor');
insert into game.details values(3,"bangalore",'swimming','indoor');
insert into game.details values(4,"Hassan",'shuttle','indoor');
select * from game.details;
update details set d_name='running', place="hubli" where id=2;
select id,place from details;
delete from details where id=1;
select * from details group by place;
create table player(p_id int primary key not null,p_name varchar(30),p_age varchar(23),d_id int,constraint foreign key(d_id) references details(id));
select *from player;
insert into player values(9,'luxmi',55,4);
select p_id,p_name,place,d_name from player left join details on d_id=id;




