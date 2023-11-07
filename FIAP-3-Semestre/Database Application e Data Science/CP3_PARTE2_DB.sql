-- TURMA: 2TDSPR NOME: GUSTAVO SORRILHA SANCHES RM:97068
-- TURMA: 2TDSPR NOME: VITOR RUBIM PASSOS RM:97092

SET SERVEROUTPUT ON;

DROP TABLE produto CASCADE CONSTRAINTS;
CREATE TABLE produto (
    produto_id NUMBER(2) PRIMARY KEY,
    nome VARCHAR2(50),
    quantidade NUMBER(6,2),
    preco NUMBER(6,2)
);
INSERT INTO produto VALUES (1, 'Produto A', 10, 50);
INSERT INTO produto VALUES (2, 'Produto B', 5, 30);
INSERT INTO produto VALUES (3, 'Produto C', 8, 40);


DECLARE
    v_codigo NUMBER(2);
    v_quantidade NUMBER(6, 2);
    v_preco_produto NUMBER(6, 2);
    v_quantidade_disponivel NUMBER(6, 2);
    v_total_compra NUMBER(10, 2);
    v_desconto NUMBER(10, 2);
BEGIN
    v_codigo := &codigo_produto;
    v_quantidade := &quantidade;

    SELECT COUNT(*) INTO v_preco_produto FROM produto WHERE produto_id = v_codigo;
    
    IF v_preco_produto = 0 THEN
        DBMS_OUTPUT.PUT_LINE('Código inexistente');
    ELSE
        SELECT preco INTO v_preco_produto FROM produto WHERE produto_id = v_codigo;

        SELECT quantidade INTO v_quantidade_disponivel FROM produto WHERE produto_id = v_codigo;

        IF v_quantidade <= v_quantidade_disponivel THEN
            v_total_compra := v_preco_produto * v_quantidade;
            
            IF v_total_compra > 500 THEN
                v_desconto := 0.10;
            ELSIF v_total_compra > 200 THEN
                v_desconto := 0.05;
            ELSE
                v_desconto := 0;
            END IF;
            
            v_total_compra := v_total_compra * (1 - v_desconto);
            
            UPDATE produto
            SET quantidade = quantidade - v_quantidade
            WHERE produto_id = v_codigo;
            
            DBMS_OUTPUT.PUT_LINE('Código: ' || v_codigo || ' - Qtd Comprada: ' || v_quantidade ||
                ' - Desconto: ' || v_desconto * 100 || '%' || ' - Total Compra: ' || v_total_compra);
        ELSE
            DBMS_OUTPUT.PUT_LINE('Sem estoque');
        END IF;
    END IF;
END;










































 
DROP TABLE Notas_Faltas CASCADE CONSTRAINTS;
CREATE TABLE Notas_Faltas (
    rm NUMBER(4) PRIMARY KEY,
    nm_aluno VARCHAR2(20) NOT NULL,
    nm_disciplina VARCHAR2(20) NOT NULL,
    carga_hora NUMBER(3) NOT NULL,
    nota1 NUMBER(3, 1),
    nota2 NUMBER(3, 1),
    nota3 NUMBER(3, 1),
    faltas NUMBER(3),
    media NUMBER(3, 1),
    situacao VARCHAR2(20)
);
 
 
-- Exercicio 1
DECLARE
    v_rm Notas_Faltas.rm%TYPE;
    v_nm_aluno Notas_Faltas.nm_aluno%TYPE;
    v_nm_disciplina Notas_Faltas.nm_disciplina%TYPE;
    v_carga_hora Notas_Faltas.carga_hora%TYPE;
    v_nota1 Notas_Faltas.nota1%TYPE;
    v_nota2 Notas_Faltas.nota2%TYPE;
    v_nota3 Notas_Faltas.nota3%TYPE;
    v_faltas Notas_Faltas.faltas%TYPE;
BEGIN
    v_rm := &rm; 
    v_nm_aluno := '&nm_aluno'; 
    v_nm_disciplina := '&nm_disciplina'; 
    v_carga_hora := &carga_hora; 
    v_nota1 := &nota1; 
    v_nota2 := &nota2; 
    v_nota3 := &nota3; 
    v_faltas := &faltas; 
    SELECT COUNT(*) INTO v_rm
    FROM Notas_Faltas
    WHERE rm = v_rm;
    IF v_rm = 0 THEN
        INSERT INTO Notas_Faltas (rm, nm_aluno, nm_disciplina, carga_hora, nota1, nota2, nota3, faltas)
        VALUES (v_rm, v_nm_aluno, v_nm_disciplina, v_carga_hora, v_nota1, v_nota2, v_nota3, v_faltas);
        COMMIT;
        DBMS_OUTPUT.PUT_LINE('Dados inseridos com sucesso.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('O RM já existe na tabela. Não é permitida a inserção.');
    END IF;
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Ocorreu um erro: ' || SQLERRM);
        ROLLBACK;
END;
 
SELECT * FROM Notas_Faltas;
 
--- 2 exercicio 
CREATE OR REPLACE FUNCTION calcular_media_rm(p_rm NUMBER) RETURN NUMBER AS
    v_nota1 NUMBER;
    v_nota2 NUMBER;
    v_nota3 NUMBER;
    v_media NUMBER;
BEGIN
 
    SELECT nota1, nota2, nota3 INTO v_nota1, v_nota2, v_nota3
    FROM Notas_Faltas
    WHERE rm = p_rm;
 
    v_media := (v_nota1 + v_nota2 + v_nota3) / 3;
 
    UPDATE Notas_Faltas
    SET media = v_media
    WHERE rm = p_rm;
 
    RETURN v_media;
END;
 
DECLARE
    v_rm NUMBER := 0; 
    v_media NUMBER;
BEGIN
    v_media := calcular_media_rm(v_rm);
    DBMS_OUTPUT.PUT_LINE('Média calculada para RM ' || v_rm || ': ' || v_media);
END;
SELECT * FROM Notas_Faltas;
--- Exercicio 3
 
CREATE OR REPLACE PROCEDURE inserir_situacao_aluno(p_rm NUMBER) AS
    v_media NUMBER;
    v_faltas NUMBER;
    v_situacao VARCHAR2(20);
    v_carga_hora NUMBER;
BEGIN
    SELECT media, faltas, carga_hora INTO v_media, v_faltas, v_carga_hora
    FROM Notas_Faltas
    WHERE rm = p_rm;
 
    IF v_media >= 7 AND (v_faltas / v_carga_hora) < 0.25 THEN
        v_situacao := 'Aprovado';
    ELSIF v_media >= 7 AND (v_faltas / v_carga_hora) >= 0.25 THEN
        v_situacao := 'Reprovado por faltas';
    ELSIF v_media < 4 AND (v_faltas / v_carga_hora) < 0.25 THEN
        v_situacao := 'Reprovado por notas';
    ELSIF v_media >= 4 AND v_media < 7 AND (v_faltas / v_carga_hora) < 0.25 THEN
        v_situacao := 'Dp';
    ELSE
        v_situacao := 'Reprovado por notas e faltas';
    END IF;
 
    UPDATE Notas_Faltas
    SET situacao = v_situacao
    WHERE rm = p_rm;
 
    DBMS_OUTPUT.PUT_LINE('Situação inserida para RM ' || p_rm || ': ' || v_situacao);
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('RM não encontrado na tabela.');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Ocorreu um erro: ' || SQLERRM);
END;
 
BEGIN
    inserir_situacao_aluno(0); 
END;
 
SELECT * FROM Notas_Faltas;