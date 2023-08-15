/* Aula 01 - Introdu??o blocos an?nimos */

/* Habilitando a sa?da de dados de um block PL */
SET SERVEROUTPUT ON

set verify off
/* 1? Programa */
BEGIN
    dbms_output.put_line('Hello world');
    DBMS_OUTPUT.PUT_LINE('Teste');
END;

/* V?riaveis */
DECLARE
    v1 NUMBER(2) := 10;
    v2 NUMBER(2) := 10;
    re NUMBER(3) := v1 + v2; -- Declarando e realizando opera??o
BEGIN
    dbms_output.put_line('RESULTADO: '||re);
END;


/* Entrada via teclado */
DECLARE
    -- Declara??o de vm
    -- Uso de v?riaveis de substitui??o
    v1 NUMBER(2) := &Valor_1;
    v2 NUMBER(2) := &Valor_2;
    re NUMBER(3) := v1 + v2;
BEGIN
    dbms_output.put_line('RESULTADO: '||re);
END;



-- Exerc?cio 01
DECLARE
    v_salario_minimo NUMBER(4) := &Salario_minimo;
    v_resultado NUMBER(4) := v_salario_minimo + (v_salario_minimo * 0.25);
BEGIN
    dbms_output.put_line('RESULTADO: '||v_resultado);
END;


-- Exerc?cio 02
DECLARE
    v_dolar NUMBER(4) := &Dolar;
    v_resultado NUMBER(4) := 45 * v_dolar;
BEGIN
    dbms_output.put_line('RESULTADO: '||v_resultado);
END;

-- Exerc?cio 03
DECLARE
    v_reais NUMBER(4) := &Reais;
    v_dolar NUMBER(4) := &Dolar;
    v_resultado NUMBER(4) := v_reais * v_dolar;
BEGIN
    dbms_output.put_line('RESULTADO: '||v_resultado);
END;

-- Exerc?cio 04
DECLARE
    v_valor_automovel NUMBER(4) := &Valor_automovel;
    v_juros NUMBER(4) := v_valor_automovel + (v_valor_automovel * 0.03);
    v_dez_vezes NUMBER(4) := v_juros / 10;
BEGIN
    dbms_output.put_line('JUROS: '||v_juros);
    dbms_output.put_line('EM 10x: '||v_dez_vezes);
END;


-- Exerc?cio 05
DECLARE
    v_valor_automovel NUMBER(6) := &Valor_automovel;
    v_valor_entrada NUMBER(6) := v_valor_automovel * 0.20 ;
    v_valor_restante NUMBER(6) := v_valor_automovel - v_valor_entrada;
    
    v_doze_vezes NUMBER(6) := (v_valor_restante + (v_valor_restante * 0.12)) / 12;
    v_seis_vezes NUMBER(6) := (v_valor_restante + (v_valor_restante * 0.15)) / 6;
    v_dezoito_vezes NUMBER(6) := (v_valor_restante + (v_valor_restante * 0.18)) / 18;
BEGIN
    dbms_output.put_line('EM 6x: '||v_seis_vezes);
    dbms_output.put_line('EM 12x: '||v_doze_vezes);
    dbms_output.put_line('EM 18x: '||v_dezoito_vezes);
END;

-- Estrutura de decisão 14/08/23

--Exercicio 1
DECLARE
     v_sexo char(1) := upper('&sexo');
    BEGIN
    
     IF v_sexo = 'M' OR v_sexo = 'm' THEN
            dbms_output.put_line('Masculino');
     ELSIF v_sexo = 'F' OR v_sexo = 'f' THEN
            dbms_output.put_line('Feminino');
     Else
            dbms_output.put_line('Outros');
    End IF;
END;

-- Exercicio 2 - Remake do exercicio de prestação
DECLARE
    v_valor_automovel NUMBER(6) := &Valor_automovel;
    v_valor_entrada NUMBER(6) := v_valor_automovel * 0.20 ;
    v_valor_restante NUMBER(6) := v_valor_automovel - v_valor_entrada;
    v_escolha number(2) := &v_6_12_18;
    
    v_doze_vezes NUMBER(6) := (v_valor_restante + (v_valor_restante * 0.12)) / 12;
    v_seis_vezes NUMBER(6) := (v_valor_restante + (v_valor_restante * 0.15)) / 6;
    v_dezoito_vezes NUMBER(6) := (v_valor_restante + (v_valor_restante * 0.18)) / 18;
BEGIN
     IF v_escolha = 6 THEN
            dbms_output.put_line('6x: '||v_seis_vezes);
     ELSIF v_escolha = 12 THEN
            dbms_output.put_line('12x: '||v_doze_vezes);
     ELSIF v_escolha = 18 THEN
            dbms_output.put_line('18x: '||v_dezoito_vezes);
     Else
            dbms_output.put_line('Só é possível 6x,12x,18x para consultar valores.');
    End IF; 
END;

-- Exercicio 3 FIAP
DECLARE
   v_checkpoint1 NUMBER := &v_check1;
   v_checkpoint2 NUMBER := &v_check2; 
   v_checkpoint3 NUMBER := &v_check3; 
   v_challenge NUMBER := &v_challenge;    
   v_prova_global NUMBER := &v_gl; 
   v_media NUMBER;

   v_menor_nota NUMBER;
   v_desconto NUMBER;

BEGIN
  
   v_menor_nota := LEAST(v_checkpoint1, v_checkpoint2, v_checkpoint3);

   v_desconto := v_menor_nota * 0.2;

   v_media := ((v_checkpoint1 + v_checkpoint2 + v_checkpoint3 - v_desconto) * 0.2 +
               v_challenge * 0.2 +
               v_prova_global * 0.6);

   
   IF v_media < 0 THEN
      v_media := 0;
   ELSIF v_media > 10 THEN
      v_media := 10;
   END IF;

   -- Exibir a média calculada
   DBMS_OUTPUT.PUT_LINE('Média de Notas da FIAP: ' || v_media);
END;
/
