create database teste
use teste

create table usuario(
	id_usuario int not null primary key identity(1,1),
	nome varchar(100) not null,
	cpf varchar(11) not null,
	senha varchar(32) not null
)

insert into usuario(nome,cpf,senha) values('miguel','15613158770','<placeholder>')
insert into usuario(nome,cpf,senha) values('Im Teste','00000000000','<placeholder>')

select id_usuario,nome,cpf from usuario

drop table usuario