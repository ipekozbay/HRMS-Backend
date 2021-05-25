CREATE TABLE public.job_positions (

    id integer NOT NULL,
    job_name character varying(150) NOT NULL,
    created_at date,
    is_active boolean,
    is_deleted boolean
);

CREATE TABLE public.employers (
    user_id integer NOT NULL,
    website character varying(250) NOT NULL,
    phone_number character varying(30) NOT NULL,
    is_verified boolean NOT NULL,
    company_name character varying(250) NOT NULL
);


 CREATE TABLE public.employers_verification_employees
 (
    id integer primary key not null,
    employer_id integer NOT NULL,
    employee_id integer NOT NULL,
	  creat_at data NOT NULL
 );


 CREATE TABLE public.verification_codes
 (
   id integer primary key not null,
    user_id integer NOT NULL,
    code character varying(50) NOT NULL,
    is_confirmed boolean NOT NULL
	 
 );
 
 
 CREATE TABLE public.jobSkeers 
 (
   id integer primary key not null,
   firstName varchar(50) not null,
   lastName varchar(50) not null,
   job varchar(100) not null,
   nationalIdentity varchar(11) NOT NULL,
   dateOfBirth date NOT NULL
 );
 
 CREATE TABLE public.users 
 (
   id integer primary key not null, 
   firstName varchar(50) not null,
   lastName varchar(50) not null,
   email varchar(100) not null,
   password varchar(100) not null
 );

CREATE TABLE public.employees 
 (
   id integer primary key not null,
   firstName varchar(50) not null,
   lastName varchar(50) not null,
   job varchar(50) 
 );

 
 
	
	

