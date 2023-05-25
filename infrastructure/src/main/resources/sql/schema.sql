CREATE SCHEMA IF NOT EXISTS pawwow DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci;

USE pawwow;

DROP TABLE IF EXISTS pet_outbox;

DROP TABLE IF EXISTS pet_poll;

DROP TABLE IF EXISTS pet;

CREATE TABLE pet (
    id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    profile_image VARCHAR(255) NOT NULL,
    brief_description VARCHAR(255) NOT NULL,
    detail_description VARCHAR(255) NOT NULL,
    type VARCHAR(255) NOT NULL,
    created_at TIMESTAMP NOT NULL,
    modified_at TIMESTAMP NOT NULL,
    primary key (id)
);

CREATE TABLE pet_poll (
    id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    pet_id BIGINT UNSIGNED NOT NULL,
    email VARCHAR(255) NOT NULL,
    created_at TIMESTAMP NOT NULL,
    primary key (id),
    unique index ux_pet_id_email (pet_id, email)
);

CREATE TABLE pet_outbox (
    id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    pet_id BIGINT UNSIGNED NOT NULL,
    type VARCHAR(255) NOT NULL,
    occurred_at TIMESTAMP NOT NULL,
    primary key (id)
);

ALTER TABLE pet_poll
ADD CONSTRAINT fk_pet_pet_poll
FOREIGN KEY (pet_id)
REFERENCES pet (id)
On DELETE CASCADE;
