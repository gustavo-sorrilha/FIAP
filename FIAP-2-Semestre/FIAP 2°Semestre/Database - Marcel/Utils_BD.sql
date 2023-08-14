//Calculo da média dos valores em colunas
avg(coluna)

// Round - arredandamente, a 1 posição após limite >= 5, + 1 a esquerda
select round (avg(salario_fixo),2) from vendedor;

// Trunc - Despreza casas decimais, sem arrendodamento
select salario_fixo/1.3, round(salario_fixo/1.3,2),
trunc(salario_fixo/1.3,2) from vendedor;

//Somatória de valores em colunas
sum(coluna)
select sum(salario_fixo) from vendedor;

// Maior valor na coluna
max(coluna)
select max(salario_fixo) from vendedor;
select salario_fixo from vendedor order by 1 desc

// Menor valor na coluna
min(coluna)
select min(salario_fixo) from vendedor;

select * from produto;
--1
select max (val_unit) "Maior preço" , min (val_unit) "Menor preço" 
from produto;

--2
select * from cliente;
select COUNT(cep) "Total de clientes em SP" from cliente where cidade = 'S?o Paulo';

--3
select count(num_pedido) "Quantidade de pedidos do cliente 720"
from pedido where cod_clie = 720;

--4
select * from vendedor;
select avg(salario_fixo) "Média salarial dos vendedores de comissão A"
from vendedor where comissao = 'A';

--5
select sum(salario_fixo) "Custo salarial dos vendedores de comissão C"
from vendedor where comissao = 'C';

--6
select * from vendedor;
Substring
solução em duas partes
select nome_ven, salario_fixo from vendedor
where salario_fixo in (select max(salario_fixo) from vendedor);

-6.1 
select nome_ven, salario_fixo from vendedor
where salario_fixo > (select avg(salario_fixo) from vendedor);


--7
select uf, count(cod_clie) from cliente group by uf order by 1;

--8
select count(comissao), count(cod_ven) from vendedor group by comissao ;

--9
select * from cliente;
select * from pedido;
select cod_clie, count(num_pedido) from pedido group by cod_clie;

--10
select * from item_pedido;
select num_pedido, count(cod_prod) from item_pedido
group by num_pedido order by 1;

--11
select cod_clie, count(num_pedido) from pedido group by cod_clie
having count(num_pedido) >1;

// Having condição usada na função count (having condição)

// Funções data
data do sistema - sysdate

Exibindo a data do sistema - vendo o padrão atual
Select sysdate from dual;
select * from vendedor;

10/05/23
alter table vendedor add dt_adm date default sysdate;
alter table vendedor add dt_dem date default sysdate;
--default sysdate, significa inserir a data do sitema na criação da coluna

// Processamento com datas
    Data + numero = data
    Data - numero = data
    Data - Data = numero

select sysdate, sysdate + 400, sysdate - 400 from dual;

select * from vendedor;

//1
update vendedor set dt_adm = dt_adm - 3580 where comissao= 'A';
//2
update vendedor set dt_adm = dt_adm - 6580 where comissao= 'B';
//3
update vendedor set dt_adm = dt_adm - 13580 where comissao= 'C';
//4
update vendedor set dt_dem = dt_dem - 18 where nome_ven= 'Felipe';
//5
update vendedor set dt_dem = null where cod_ven between 101 and 310;
//6
update vendedor set dt_dem = dt_dem - 67 where nome_ven= 'Jo�o' and cod_ven=11;












