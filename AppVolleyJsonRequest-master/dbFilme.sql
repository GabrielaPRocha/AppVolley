create database dbFilme;
use dbFilme;
create table titulos(
codigo varchar (10),
nome varchar (100),
genero varchar (20),
locado varchar(10));

insert into titulos (codigo,nome,genero,locado) values("341324","Jogos vorazes","Action",1);
insert into titulos (codigo,nome,genero,locado) values("543563","A Toda Prova","Action",2);
insert into titulos (codigo,nome,genero,locado) values("543324","Sangue na veia","Action",9);
insert into titulos (codigo,nome,genero,locado) values("3413","Vingadores: Guerra Infinita"," Adventure",10);
select * from titulos