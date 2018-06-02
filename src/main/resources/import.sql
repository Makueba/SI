--insert into tb_unidade_federativa (id, tx_nome, tx_sigla) values (1, 'Minas Gerais', 'MG');
--insert into tb_unidade_federativa (id, tx_nome, tx_sigla) values (2, 'São Paulo', 'SP');
--insert into tb_unidade_federativa (id, tx_nome, tx_sigla) values (3, 'Rio de Janeiro', 'RJ');

--insert into tb_pessoa (id, tx_nome) values (1, 'Alexandre');
--insert into tb_pessoa (id, tx_nome) values (2, 'Ana');
--insert into tb_pessoa (id, tx_nome) values (3, 'Bruno');
--insert into tb_pessoa (id, tx_nome) values (4, 'Bruna');
--insert into tb_pessoa (id, tx_nome) values (5, 'Carlos');
--insert into tb_pessoa (id, tx_nome) values (6, 'Carine');
--insert into tb_pessoa (id, tx_nome) values (7, 'Douglas');
--insert into tb_pessoa (id, tx_nome) values (8, 'Debora');
--insert into tb_pessoa (id, tx_nome) values (9, 'Edson');
--insert into tb_pessoa (id, tx_nome) values (10, 'Eliane');
--insert into tb_pessoa (id, tx_nome) values (11, 'Falcatrua');
--insert into tb_pessoa (id, tx_nome) values (12, 'Gigante');
--insert into tb_pessoa (id, tx_nome) values (13, 'Homerica');
--insert into tb_pessoa (id, tx_nome) values (14, 'Iludida');

--insert into tb_pessoa_juridica (id, tx_cnpj) values (11, '1');
--insert into tb_pessoa_juridica (id, tx_cnpj) values (12, '2');
--insert into tb_pessoa_juridica (id, tx_cnpj) values (13, '3');
--insert into tb_pessoa_juridica (id, tx_cnpj) values (14, '4');

--insert into tb_pessoa_fisica (id, id_unidade_federativa, id_partido, tx_cpf, tp_genero, dt_nascimento, tx_rg_numero, tx_rg_expedidor, dt_rg_expedicao) values (1, 1, null, '1', 'M', current_date, '1', 'SSP', current_date);
--insert into tb_pessoa_fisica (id, id_unidade_federativa, id_partido, tx_cpf, tp_genero, dt_nascimento, tx_rg_numero, tx_rg_expedidor, dt_rg_expedicao) values (2, 2, null, '2', 'F', current_date, '2', 'SSP',  current_date);
--insert into tb_pessoa_fisica (id, id_unidade_federativa, id_partido, tx_cpf, tp_genero, dt_nascimento, tx_rg_numero, tx_rg_expedidor, dt_rg_expedicao) values (3, 3, null, '3', 'M', current_date, '3', 'SSP',  current_date);
--insert into tb_pessoa_fisica (id, id_unidade_federativa, id_partido, tx_cpf, tp_genero, dt_nascimento, tx_rg_numero, tx_rg_expedidor, dt_rg_expedicao) values (4, 1, null, '4', 'F', current_date, '4', 'SSP',  current_date);
--insert into tb_pessoa_fisica (id, id_unidade_federativa, id_partido, tx_cpf, tp_genero, dt_nascimento, tx_rg_numero, tx_rg_expedidor, dt_rg_expedicao) values (5, 2, null, '5', 'M', current_date, '5', 'SSP',  current_date);
--insert into tb_pessoa_fisica (id, id_unidade_federativa, id_partido, tx_cpf, tp_genero, dt_nascimento, tx_rg_numero, tx_rg_expedidor, dt_rg_expedicao) values (6, 3, null, '6', 'F', current_date, '6', 'SSP',  current_date);
--insert into tb_pessoa_fisica (id, id_unidade_federativa, id_partido, tx_cpf, tp_genero, dt_nascimento, tx_rg_numero, tx_rg_expedidor, dt_rg_expedicao) values (7, 2, null, '7', 'M', current_date, '7', 'SSP',  current_date);
--insert into tb_pessoa_fisica (id, id_unidade_federativa, id_partido, tx_cpf, tp_genero, dt_nascimento, tx_rg_numero, tx_rg_expedidor, dt_rg_expedicao) values (8, 3, null, '8', 'F', current_date, '8', 'SSP',  current_date);
--insert into tb_pessoa_fisica (id, id_unidade_federativa, id_partido, tx_cpf, tp_genero, dt_nascimento, tx_rg_numero, tx_rg_expedidor, dt_rg_expedicao) values (9, 3, null, '9', 'M', current_date, '9', 'SSP',  current_date);
--insert into tb_pessoa_fisica (id, id_unidade_federativa, id_partido, tx_cpf, tp_genero, dt_nascimento, tx_rg_numero, tx_rg_expedidor, dt_rg_expedicao) values (10, 3, null, '10', 'F', current_date, '10', 'SSP',  current_date);

--insert into tb_funcionario (id_pessoa_juridica, id_pessoa_fisica) values (11, 1);
--insert into tb_funcionario (id_pessoa_juridica, id_pessoa_fisica) values (12, 2);
--insert into tb_funcionario (id_pessoa_juridica, id_pessoa_fisica) values (13, 3);
--insert into tb_funcionario (id_pessoa_juridica, id_pessoa_fisica) values (14, 4);
--insert into tb_funcionario (id_pessoa_juridica, id_pessoa_fisica) values (11, 4);
--insert into tb_funcionario (id_pessoa_juridica, id_pessoa_fisica) values (11, 5);
--insert into tb_funcionario (id_pessoa_juridica, id_pessoa_fisica) values (13, 6);
--insert into tb_funcionario (id_pessoa_juridica, id_pessoa_fisica) values (13, 7);

--insert into tb_partido (id, tx_nome, nu_numero, id_candidato) values (1, 'MDB', 15, 2);
--insert into tb_partido (id, tx_nome, nu_numero, id_candidato) values (2, 'PT', 13, 5);
--insert into tb_partido (id, tx_nome, nu_numero, id_candidato) values (3, 'PSDB', 45, 8);

--update tb_pessoa_fisica set id_partido = 1 where id = 1;
--update tb_pessoa_fisica set id_partido = 2 where id = 2;
--update tb_pessoa_fisica set id_partido = 3 where id = 3;
--update tb_pessoa_fisica set id_partido = 1 where id = 4;
--update tb_pessoa_fisica set id_partido = 2 where id = 5;
--update tb_pessoa_fisica set id_partido = 3 where id = 6;
--update tb_pessoa_fisica set id_partido = 2 where id = 7;
--update tb_pessoa_fisica set id_partido = 2 where id = 8;
--update tb_pessoa_fisica set id_partido = 3 where id = 9;
--update tb_pessoa_fisica set id_partido = null where id = 10;

--insert into tb_doacao (id, id_partido, id_pessoa, nu_valor) values (1, 1, 1, 10);
--insert into tb_doacao (id, id_partido, id_pessoa, nu_valor) values (2, 2, 2, 20);
--insert into tb_doacao (id, id_partido, id_pessoa, nu_valor) values (3, 3, 3, 30);
--insert into tb_doacao (id, id_partido, id_pessoa, nu_valor) values (4, 1, 4, 40);
--insert into tb_doacao (id, id_partido, id_pessoa, nu_valor) values (5, 2, 5, 50);
--insert into tb_doacao (id, id_partido, id_pessoa, nu_valor) values (7, 3, 6, 60);
--insert into tb_doacao (id, id_partido, id_pessoa, nu_valor) values (8, 1, 7, 70);
--insert into tb_doacao (id, id_partido, id_pessoa, nu_valor) values (9, 2, 8, 80);
--insert into tb_doacao (id, id_partido, id_pessoa, nu_valor) values (10, 3, 9, 90);
--insert into tb_doacao (id, id_partido, id_pessoa, nu_valor) values (11, 1, 10, 100);
--insert into tb_doacao (id, id_partido, id_pessoa, nu_valor) values (12, 2, 11, 110);
--insert into tb_doacao (id, id_partido, id_pessoa, nu_valor) values (13, 3, 12, 120);
--insert into tb_doacao (id, id_partido, id_pessoa, nu_valor) values (14, 1, 13, 130);
--insert into tb_doacao (id, id_partido, id_pessoa, nu_valor) values (15, 2, 14, 140);
--insert into tb_doacao (id, id_partido, id_pessoa, nu_valor) values (16, 3, 1, 150);
--insert into tb_doacao (id, id_partido, id_pessoa, nu_valor) values (17, 1, 2, 160);
--insert into tb_doacao (id, id_partido, id_pessoa, nu_valor) values (18, 2, 3, 170);
