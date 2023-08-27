DROP SCHEMA IF EXISTS bank CASCADE;


CREATE SCHEMA IF NOT EXISTS bank;


CREATE TABLE IF NOT EXISTS bank.clients (
    id              SERIAL PRIMARY KEY,
    bank_account    TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS bank.organizations (
    id              SERIAL PRIMARY KEY,
    name            TEXT NOT NULL
);