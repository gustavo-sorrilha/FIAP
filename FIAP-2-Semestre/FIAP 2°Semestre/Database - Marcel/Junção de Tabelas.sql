// Junção de tabelas

create table cargo (
    cd_cargo number(2) primary key,
    nm_cargo varchar(30),
    salario number (8,2)
);
create table funcionario( 
id_fun NUMBER(2) constraint funcionario_cd_fun_pk primary key ,   
nm_fun VARCHAR2(20) constraint funcionario_nm_fun_nn NOT NULL,
cargo NUMBER(2) constraint funcionario_cargo_fk references cargo);

insert into cargo values (1,    'Prg. Web'     ,4500);   
insert into cargo values (2,      'DBA'       ,12000);
insert into cargo values (3, 'Analista Dados'  ,8000);

insert into funcionario values (10,'Marcel',1);   
insert into funcionario values (11,'Claudio',2);
insert into funcionario values (12,'Amanda',2);
insert into funcionario values (13,'Samantha',null);

// junção por igualdade ou equivalencia - inner join
select nm_fun, nm_cargo from cargo inner join funcionario on cd_cargo = cargo;
// junção por igualdade e diferença ao mesmo tempo - esquerda ou direita - 
    left join ou right join
select nm_fun, nm_cargo from cargo left join funcionario on cd_cargo = cargo;
select nm_fun, nm_cargo from cargo right join funcionario on cd_cargo = cargo;
// junção por diferença 
select nm_fun, nm_cargo from cargo left join funcionario on cd_cargo = cargo
where cargo is null;
select nm_fun, nm_cargo from cargo right join funcionario on cd_cargo = cargo
where cargo is null;
select nm_fun, nm_cargo from cargo full outer join funcionario on cd_cargo = cargo
where cargo is null;

// 1 cliente.co_clie qualify - serve para diferenciar colunas iguais em 2 tabelas diferentes
select nome_clie, num_pedido from cliente inner join pedido on cliente.cod_clie = pedido.cod_clie ;
// 2 
select nome_ven, num_pedido from vendedor inner join pedido on pedido.cod_ven = vendedor.cod_ven ;
// 3 
select nome_ven,num_pedido,nome_clie from pedido inner join vendedor on pedido.cod_ven = vendedor.cod_ven
inner join cliente on pedido.cod_clie = cliente.cod_clie;

commit;


















