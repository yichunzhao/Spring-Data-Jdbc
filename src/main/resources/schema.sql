create table pet(
id  INTEGER IDENTITY PRIMARY KEY,
name VARCHAR(30),
birth_date date
);

create table customer(
id INTEGER IDENTITY PRIMARY KEY,
name VARCHAR(30)
);

create table Address(
id INTEGER IDENTITY PRIMARY KEY,
address_line VARCHAR(80),
customer INTEGER
);
