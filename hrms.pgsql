CREATE TABLE public.employees 
 (
   id integer primary key not null,
   firstName varchar(50) not null,
   lastName varchar(50) not null,
   job varchar(50) 
 );


 CREATE TABLE public.jobPosition
 (
  id integer primary key not null,
  jobName varchar(50) not null
 );


 CREATE TABLE public.users 
 (
   id integer primary key not null, 
   firstName varchar(50) not null,
   lastName varchar(50) not null,
   email varchar(100) not null,
   password varchar(100) not null
 );


 CREATE TABLE public.employers 
  (
   id integer primary key not null,
   firstName varchar(50) not null,
   lastName varchar(50) not null,
   company_name varchar(100) not null
  );


 CREATE TABLE public.jobSkeers 
 (
   id integer primary key not null,
   firstName varchar(50) not null,
   lastName varchar(50) not null,
   job varchar(100) not null
 );
 
 
  CREATE TABLE public.verification_codes
 (
   id integer primary key not null,
   verification_code integer not null
 );
 
 
 CREATE TABLE public.employers_verificationcode_employees
(
    id integer NOT NULL PRIMARY KEY,
    employers_id INT NOT NULL,
    employees_id INT NOT NULL
 );
