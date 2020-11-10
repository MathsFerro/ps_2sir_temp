# ps_2sir_temp
Projeto relacionado a faculdade / Repositorio Temporario


# SCRIPT SQL <br><br>

DROP TABLE tb_users CASCADE CONSTRAINTS;


CREATE SEQUENCE id_user_seq START WITH 1;

CREATE TABLE tb_users (
  id_user number DEFAULT id_user_seq.nextval NOT NULL,
  nm_user varchar2(255) not null,
  password varchar2(50) not null,
  is_admin number
);
ALTER TABLE tb_users ADD CONSTRAINT id_user_pk PRIMARY KEY (id_user);



SELECT * from tb_users;


