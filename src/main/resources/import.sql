insert into CURSO (codigo, nome, creditos) values ('949', 'Engenharia Mecatrônica', 274);

insert into MATERIA (codigo, nome, creditos) values ('113034', 'Calculo 1', 6);

insert into MATERIA (codigo, nome, creditos) values ('113042', 'Calculo 2', 6);
insert into MATERIA_REQUISITO (id_materia, id_requisito) values ('113042', '113034');

insert into MATERIA (codigo, nome, creditos) values ('113051', 'Calculo 3', 6);
insert into MATERIA_REQUISITO (id_materia, id_requisito) values ('113051', '113042');

insert into MATERIA (codigo, nome, creditos) values ('122408', 'CIENCIAS DO AMBIENTE', 2);
insert into MATERIA (codigo, nome, creditos) values ('116351', 'CIRCUITOS DIGITAIS', 6);
insert into MATERIA (codigo, nome, creditos) values ('164887', 'CONTROLE DIGITAL', 4);
insert into MATERIA (codigo, nome, creditos) values ('167657', 'CONTROLE PARA AUTOMAÇÃO', 4);
insert into MATERIA (codigo, nome, creditos) values ('168874', 'DESENHO MECANICO ASSISTIDO POR COMPUTADOR 1', 6);
insert into MATERIA (codigo, nome, creditos) values ('167673', 'ESTÁGIO CURRICULAR EM ENGENHARIA MECATRÔNICA', 12);
insert into MATERIA (codigo, nome, creditos) values ('116319', 'ESTRUTURAS DE DADOS', 4);
insert into MATERIA (codigo, nome, creditos) values ('118001', 'FISICA 1', 4);
insert into MATERIA (codigo, nome, creditos) values ('118010', 'FISICA 1 EXPERIMENTAL', 2);

insert into MATERIA (codigo, nome, creditos) values ('118028', 'FISICA 2', 4);
insert into MATERIA_REQUISITO (id_materia, id_requisito) values ('118028', '118001');
insert into MATERIA_REQUISITO (id_materia, id_requisito) values ('118028', '113034');

insert into MATERIA (codigo, nome, creditos) values ('118036', 'FISICA 2 EXPERIMENTAL', 4);
insert into MATERIA_REQUISITO (id_materia, id_requisito) values ('118036', '118001');
insert into MATERIA_REQUISITO (id_materia, id_requisito) values ('118036', '113034');
insert into MATERIA_REQUISITO (id_materia, id_requisito) values ('118036', '118010');

insert into MATERIA (codigo, nome, creditos) values ('118044', 'FISICA 3', 4);
insert into MATERIA_REQUISITO (id_materia, id_requisito) values ('118044', '118028');
insert into MATERIA_REQUISITO (id_materia, id_requisito) values ('118044', '113042');

insert into MATERIA (codigo, nome, creditos) values ('118052', 'FISICA 3 EXPERIMENTAL', 4);
insert into MATERIA_REQUISITO (id_materia, id_requisito) values ('118052', '118028');
insert into MATERIA_REQUISITO (id_materia, id_requisito) values ('118052', '113042');

insert into MATERIA (codigo, nome, creditos) values ('167347', 'INSTRUMENTACAO DE CONTROLE', 4);

insert into MATERIA (codigo, nome, creditos) values ('168823', 'INTRODUÇÃO À CIÊNCIA DOS MATERIAIS', 3);
insert into MATERIA_REQUISITO (id_materia, id_requisito) values ('168823', '114626');
insert into MATERIA_REQUISITO (id_materia, id_requisito) values ('168823', '114634');

insert into MATERIA (codigo, nome, creditos) values ('113093', 'INTRODUCAO A ALGEBRA LINEAR', 4);

insert into MATERIA (codigo, nome, creditos) values ('168769', 'MECANICA 1', 4);
insert into MATERIA_REQUISITO (id_materia, id_requisito) values ('168769', '118001');
insert into MATERIA_REQUISITO (id_materia, id_requisito) values ('168769', '113034');
insert into MATERIA_REQUISITO (id_materia, id_requisito) values ('168769', '113093');

insert into MATERIA (codigo, nome, creditos) values ('168777', 'MECANICA 2', 4);
insert into MATERIA_REQUISITO (id_materia, id_requisito) values ('168777', '118001');
insert into MATERIA_REQUISITO (id_materia, id_requisito) values ('168777', '113051');
insert into MATERIA_REQUISITO (id_materia, id_requisito) values ('168777', '113093');

insert into MATERIA (codigo, nome, creditos) values ('169510', 'MECANICA DOS MATERIAIS 1', 4);
insert into MATERIA_REQUISITO (id_materia, id_requisito) values ('169510', '168769');

insert into MATERIA (codigo, nome, creditos) values ('116394', 'ORGANIZACAO E ARQUITETURA DE COMPUTADORES', 4);
insert into MATERIA (codigo, nome, creditos) values ('115045', 'PROBABILIDADE E ESTATÍSTICA', 4);
insert into MATERIA (codigo, nome, creditos) values ('116599', 'PROCESSAMENTO EM TEMPO REAL', 4);
insert into MATERIA (codigo, nome, creditos) values ('168238', 'SISTEMAS HIDRAULICOS E PNEUMATICOS', 4);
insert into MATERIA (codigo, nome, creditos) values ('168742', 'SISTEMAS DE MEDIÇÃO', 3);
insert into MATERIA (codigo, nome, creditos) values ('168912', 'SISTEMAS INTEGRADOS DE MANUFATURA', 4);
insert into MATERIA (codigo, nome, creditos) values ('168831', 'TECNOLOGIA DE FABRICACAO 1', 4);
insert into MATERIA (codigo, nome, creditos) values ('164399', 'TECNOLOGIAS COMANDO NUMERICO', 4);
insert into MATERIA (codigo, nome, creditos) values ('167681', 'TRABALHO DE GRADUAÇÃO 1', 6);
insert into MATERIA (codigo, nome, creditos) values ('167665', 'TRABALHO DE GRADUAÇÃO 2', 6);
insert into MATERIA (codigo, nome, creditos) values ('116424', 'TRANSMISSÃO DE DADOS', 4);	
insert into MATERIA (codigo, nome, creditos) values ('168840', 'TRANSPORTE DE CALOR E MASSA', 4);
insert into MATERIA (codigo, nome, creditos) values ('113069', 'VARIAVEL COMPLEXA 1', 6);
insert into MATERIA (codigo, nome, creditos) values ('114626', 'QUIMICA GERAL TEORICA', 4);
insert into MATERIA (codigo, nome, creditos) values ('114634', 'QUIMICA GERAL EXPERIMENTAL', 2);	
insert into MATERIA (codigo, nome, creditos) values ('113476', 'ALGORITMOS E PROGRAMAÇÃO DE COMPUTADORES', 6);



