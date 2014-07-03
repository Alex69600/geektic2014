drop table centreInteret  if exists cascade;
drop table sexegeek  if exists cascade;
drop table geek  if exists cascade;
drop table consultationGeek if exists cascade;

create table centreInteret(
idInteret numeric not null,
nomInteret varchar(255) not null,
primary key(idInteret)
);

create table sexeGeek(
IdSexeGeek numeric not null,
SexeGeek varchar(255) not null,
primary key(IdSexeGeek)
);

create table geek(
idGeek numeric not null,
nom varchar(255) not null,
prenom varchar(255) not null,
Age numeric not null,
courriel varchar(255) not null,
gravatar varchar(255) null,
numCentreInteret numeric not null,
NumSexe numeric not null,
primary key(idGeek),
foreign key(numCentreInteret) references centreInteret(idInteret)
);

create table consultationGeek(
numGeek numeric not null,
dateConsultation timestamp not null,
adresseIP varchar(255),
primary key(numGeek,dateConsultation)
);

create sequence centreInteret_seq start with 1000;
create sequence geek_seq start with 1000;
create sequence consultationGeek_seq start with 1000;
create sequence sexeGeek_seq start with 1000;


