INSERT INTO bank.clients (first_name, last_name, phone_number)
VALUES ('Alexandr', 'Pushkin', '88005353535');
INSERT INTO bank.clients (first_name, last_name, phone_number)
VALUES ('Mihail', 'Lermontov', '88005353532');
INSERT INTO bank.clients (first_name, last_name, phone_number)
VALUES ('Fedor', 'Dostoevskiy', '88005353536');
INSERT INTO bank.clients (first_name, last_name, phone_number)
VALUES ('Mihail', 'Bulgakov', '88005353636');
INSERT INTO bank.clients (first_name, last_name, phone_number)
VALUES ('Sergey', 'Esenin', '88005353530');

INSERT INTO bank.orgs (name)
VALUES ('Mobile');
INSERT INTO bank.orgs (name)
VALUES ('Internet');

INSERT INTO bank.clients_orgs (clients_id, orgs_id, amount)
VALUES (1, 2, 100);
INSERT INTO bank.clients_orgs (clients_id, orgs_id, amount)
VALUES (2, 1, 500);
INSERT INTO bank.clients_orgs (clients_id, orgs_id, amount)
VALUES (2, 2, 350);
INSERT INTO bank.clients_orgs (clients_id, orgs_id, amount)
VALUES (3, 1, 720);
INSERT INTO bank.clients_orgs (clients_id, orgs_id, amount)
VALUES (4, 1, 15);
INSERT INTO bank.clients_orgs (clients_id, orgs_id, amount)
VALUES (5, 1, 3000);