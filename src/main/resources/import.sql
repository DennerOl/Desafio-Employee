INSERT INTO tb_department(name) VALUES ('Sales');
INSERT INTO tb_department(name) VALUES ('Management');
INSERT INTO tb_department(name) VALUES ('Training');


INSERT INTO tb_user (name, email, password) VALUES ('Ana', 'ana@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Bob', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);


INSERT INTO tb_employee(name, email, department_id) VALUES ('Maria', 'maria@gmail.com', 1);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Ana', 'maria@gmail.com', 2);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Bob', 'maria@gmail.com', 1);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Marco', 'maria@gmail.com', 2);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Alex', 'maria@gmail.com', 1);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Claudia', 'maria@gmail.com', 1);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Rodrigo', 'maria@gmail.com', 1);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Elisa', 'maria@gmail.com', 2);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Lucas', 'maria@gmail.com', 3);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Rafael', 'maria@gmail.com', 1);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Tiago', 'maria@gmail.com', 1);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Andressa', 'maria@gmail.com', 2);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Meire', 'maria@gmail.com', 3);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Carol', 'maria@gmail.com', 1);
