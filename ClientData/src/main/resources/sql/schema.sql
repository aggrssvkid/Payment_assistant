DROP SCHEMA IF EXISTS bank CASCADE;


CREATE SCHEMA IF NOT EXISTS bank;


CREATE TABLE IF NOT EXISTS bank.clients (
    id              SERIAL PRIMARY KEY,
    first_name      TEXT NOT NULL,
    last_name       TEXT NOT NULL,
    phone_number    TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS bank.orgs (
    id              SERIAL PRIMARY KEY,
    name            TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS bank.client_orgs (
    clients_id      INTEGER NOT NULL REFERENCES bank.clients(id),
    orgs_id         INTEGER NOT NULL REFERENCES bank.orgs(id),
    amount          INTEGER NOT NULL
);