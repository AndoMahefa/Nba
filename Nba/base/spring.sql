create database testspring;
\c testspring

create table if not exists utilisateur(
    id serial primary key,
    nom varchar(50)
);

insert into utilisateur values (default, 'Ando');
insert into utilisateur values (default, 'Tantely');
insert into utilisateur values (default, 'Jean');