CREATE TABLE users (
                       id bigserial primary key not null,
                       email varchar(255),
                       login varchar(255),
                       full_name varchar(255)
);