create table cliente(
cod_clie number(4) CONSTRAINT cliente_cod_clie_pk PRIMARY KEY,
nome_clie VARCHAR2(20) CONSTRAINT cliente_nome_clie_nn NOT NULL,
endereco VARCHAR2(30),
cidade VARCHAR2(15),
cep CHAR(8),
uf CHAR(2),
cnpj CHAR(16),
ie CHAR(12)
);

INSERT INTO cliente values(720, 'Ana', 'Rua 17 n.19', 'Niter�i', '24358310', 'RJ', '12113231/0001-34', '2134');
INSERT INTO cliente values(870, 'Fl�vio', 'Av. Pres. Vargas, 10', 'S�o Paulo', '22763931', 'SP', '22534126/9387-9', '4631');
INSERT INTO cliente values(110, 'Jorge', 'Rua Caiap� 13', 'Curitiba', '30078500', 'PR', '14512764/9834-9', null);
INSERT INTO cliente values(222, 'L�cia', 'Rua Itabira, 123', 'Belo Horizonte', '22124391', 'MG', '283152123/9348-8', '2985');
INSERT INTO cliente values(830, 'Mauricio', 'Av. Paulista, 1236', 'S�o Paulo', '3012683', 'SP', '32816985/7465-6', '9343');
INSERT INTO cliente values(130, 'Edmar', 'Rua da Praia, s/n', 'Salvador', '30079300', 'BA', '23463284/234-9', '7121');
INSERT INTO cliente values(410, 'Rodolfo', 'Largo da Lapa 27', 'Rio de Janeiro', '30078900', 'RJ', '12835128/2346-9', '7431');
INSERT INTO cliente values(20, 'Beth', 'Av. Clim�rio, 45', 'S�o Paulo', '25679300', 'SP', '32485126/7326-8', '9280');
INSERT INTO cliente values(157, 'Paulo', 'Trav. Moraes, casa 3', 'Londrina', null, 'PR', '32848223/324-2', '1923');
INSERT INTO cliente values(180, 'L�vio', 'Av. Beira Mar, 1256', 'Florian�polis', '30077500', 'SC', '12736571/2347-4', '1111');
INSERT INTO cliente values(260, 'Susana', 'Rua Lopes Mandes, 12', 'Niter�i', '30046500', 'RJ', '21763571/232-9', '2530');
INSERT INTO cliente values(290, 'Renato', 'Rua Meireles, 123', 'S�o Paulo', '30225900', 'SP', '13276571/1231-4', '1820');
INSERT INTO cliente values(390, 'Sebasti�o', 'Rua da Igreja, 10', 'Uberaba', '30438700', 'MG', '32176547/213-3', '9071');
INSERT INTO cliente values(234, 'Jos�', 'Quadra 3, Bl. 3, sl. 1003', 'Bras�lia', '22841650', 'DF', '21763576/1232-3', '2931');

select * from cliente
drop table cliente cascade constraints;

-------------------
create table vendedor
(cod_ven number(4) constraint vendedor_cod_ven_pk primary key,
nome_ven varchar(20) constraint vendedor_nome_ven_nn not null,
salario_fixo number(10,2) constraint vendedor_salario_fixo_nn not null,
comissao char(1) constraint vendedor_comissao_nn not null);

INSERT INTO vendedor VALUES (209, 'Jos�', 1800, 'C');
INSERT INTO vendedor VALUES (111, 'Carlos', 2490, 'A');
INSERT INTO vendedor VALUES (11, 'Jo�o', 2780, 'C');
INSERT INTO vendedor VALUES (240, 'Ant�nio', 9500, 'C');
INSERT INTO vendedor VALUES (720, 'Felipe', 4600, 'A');
INSERT INTO vendedor VALUES (213, 'Jonas', 2300, 'A');
INSERT INTO vendedor VALUES (101, 'Jo�o', 2650, 'C');
INSERT INTO vendedor VALUES (310, 'Josias', 870, 'B');
INSERT INTO vendedor VALUES (250, 'Maur�cio', 2930, 'B');

drop table vendedor cascade constraints;
select * from vendedor

-------------------
create table produto
(cod_prod number(4) constraint produto_cod_prod_pk primary key,
unidade char(3) constraint produto_unidade_nn not null,
descricao char(20) constraint produto_descricao_nn not null,
val_unit number(8,2) constraint produto_val_unit_nn not null);

INSERT INTO produto VALUES (25, 'KG', 'Queijo', 0.97);
INSERT INTO produto VALUES (31, 'BAR', 'Chocolate', 0.87);
INSERT INTO produto VALUES (78, 'L', 'Vinho', 2.00);
INSERT INTO produto VALUES (22, 'M', 'Linho', 0.11);
INSERT INTO produto VALUES (30, 'SAC', 'A��car', 0.30);
INSERT INTO produto VALUES (53, 'M', 'Linha', 1.80);
INSERT INTO produto VALUES (13, 'G', 'Ouro', 6.18);
INSERT INTO produto VALUES (45, 'M', 'Madeira', 0.25);
INSERT INTO produto VALUES (87, 'M', 'Cano', 1.97);
INSERT INTO produto VALUES (77, 'M', 'Papel', 1.05);

drop table produto cascade constraints;
select * from produto

-------------------
create table pedido 
(num_pedido number(4) constraint pedido_num_pedido_pk primary key,
pr_entrega number(3) constraint pedido_pr_entrega_nn not null,
cod_clie number(4) constraint pedido_cod_clie_fk references cliente,
cod_ven number(4) constraint pedido_cod_ven_fk references vendedor);

INSERT INTO pedido VALUES (121, 20, 410, 209);
INSERT INTO pedido VALUES (97, 20, 720, 101);
INSERT INTO pedido VALUES (101, 15, 720, 101);
INSERT INTO pedido VALUES (137, 20, 720, 720);
INSERT INTO pedido VALUES (148, 20, 720, 101);
INSERT INTO pedido VALUES (189, 15, 870, 213);
INSERT INTO pedido VALUES (104, 30, 110, 101);
INSERT INTO pedido VALUES (203, 30, 830, 250);
INSERT INTO pedido VALUES (98, 20, 410, 209);
INSERT INTO pedido VALUES (143, 30, 20, 111);
INSERT INTO pedido VALUES (105, 30, 180, 240);
INSERT INTO pedido VALUES (111, 15, 260, 240);
INSERT INTO pedido VALUES (103, 20, 260, 11);
INSERT INTO pedido VALUES (91, 20, 260, 11);
INSERT INTO pedido VALUES (138, 20, 260, 11);
INSERT INTO pedido VALUES (108, 15, 290, 310);
INSERT INTO pedido VALUES (119, 30, 390, 250);
INSERT INTO pedido VALUES (127, 10, 410, 11);

drop table pedido cascade constraints;
select * from pedido

-------------------
create table item_pedido
(num_pedido number(4) constraint item_pedido_num_pedido_fk references pedido,
cod_prod number(4) constraint item_pedido_cod_prod_fk references produto,
quant number(8,2) constraint pedido_quant_nn not null);

INSERT INTO item_pedido VALUES(121,25,10);
INSERT INTO item_pedido VALUES(121,31,35);
INSERT INTO item_pedido VALUES(97,77,20);
INSERT INTO item_pedido VALUES(101,31,9);
INSERT INTO item_pedido VALUES(101,78,18);
INSERT INTO item_pedido VALUES(101,13,5);
INSERT INTO item_pedido VALUES(98,77,5);
INSERT INTO item_pedido VALUES(148,45,8);
INSERT INTO item_pedido VALUES(148,31,7);
INSERT INTO item_pedido VALUES(148,77,3);
INSERT INTO item_pedido VALUES(148,25,10);
INSERT INTO item_pedido VALUES(148,78,30);
INSERT INTO item_pedido VALUES(104,53,32);
INSERT INTO item_pedido VALUES(203,31,6);
INSERT INTO item_pedido VALUES(189,78,45);
INSERT INTO item_pedido VALUES(143,31,20);
INSERT INTO item_pedido VALUES(143,78,10);

drop table item_pedido cascade constraints;
select * from item_pedido

-------------------
