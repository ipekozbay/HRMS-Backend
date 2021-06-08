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
       company_name character varying(250) NOT NULL,
       is_active boolean,
       is_deleted boolean
);


 CREATE TABLE public.employers_verification_employees
 (
        id integer primary key not null,
        employer_id integer NOT NULL,
        employee_id integer NOT NULL,
        creat_at data NOT NULL,
        is_active boolean,
        is_deleted boolean
 );


 CREATE TABLE public.verification_codes
 (
 	id integer primary key not null,
        user_id integer NOT NULL,
        code character varying(50) NOT NULL,
        is_confirmed boolean NOT NULL,
        is_active boolean,
        is_deleted boolean
	 
 );
 
 
 CREATE TABLE public.jobSkeers 
 (
	id integer primary key not null,
        firstName varchar(50) not null,
        lastName varchar(50) not null,
        job varchar(100) not null,
        nationalIdentity varchar(11) NOT NULL,
        dateOfBirth date NOT NULL,
        is_active boolean,
        is_deleted boolean
 );
 
 CREATE TABLE public.users 
 (
 	id integer primary key not null, 
        firstName varchar(50) not null,
        lastName varchar(50) not null,
        email varchar(100) not null,
        password varchar(100) not null,
        is_active boolean,
        is_deleted boolean
 );

CREATE TABLE public.employees 
 (
        id integer primary key not null,
        firstName varchar(50) not null,
        lastName varchar(50) not null,
        job varchar(50) ,
        is_active boolean,
        is_deleted boolean
 );

 
 CREATE TABLE public.experiences_cv
 (
	id integer NOT NULL,
        working_place character varying(100) NOT NULL,
        mission character varying(100) NOT NULL,
        start_at date NOT NULL,
        end_at date,
        is_active boolean DEFAULT true,
        is_deleted boolean DEFAULT false

 );
 
 CREATE TABLE public.foreign_languages_cv(
	 id integer NOT NULL,
         is_active boolean DEFAULT true,
         is_deleted boolean DEFAULT false,
	 language character varying NOT NULL,
         jobseeker_id integer NOT NULL
         level integer NOT NULL

 );
 
 CREATE TABLE public.images_cv(
	 id integer NOT NULL,
         is_active boolean DEFAULT true,
         is_deleted boolean DEFAULT false,
 	 url character varying NOT NULL,
	 jobseeker_id integer NOT NULL,
         jobseeker_user_id integer
 
 );
 
CREATE TABLE public.links_cv(
	 id integer NOT NULL,
         is_active boolean DEFAULT true,
         is_deleted boolean DEFAULT false,
	 url character varying NOT NULL,
	 jobseeker_id integer NOT NULL
	
);

CREATE TABLE public.skills_cv(
	 id integer NOT NULL,
         is_active boolean DEFAULT true,
         is_deleted boolean DEFAULT false,
	 skill_name character varying NOT NULL,
	 jobseeker_id integer NOT NULL
	
);

CREATE TABLE public.schools_cv(
	 id integer NOT NULL,
         is_active boolean DEFAULT true,
         is_deleted boolean DEFAULT false,
	 name character varying NOT NULL,
	 section character varying NOT NULL,
	 start_at date NOT NULL,
         end_at date,
	 jobseeker_id integer NOT NULL
	
);

 CREATE TABLE public.cover_letters_cv
(
	id integer NOT NULL,
	content character varying NOT NULL,
        is_active boolean DEFAULT true,
        is_deleted boolean DEFAULT false,	
        jobseeker_id integer NOT NULL

);

CREATE TABLE public.cities 
(
       id integer NOT NULL,
       name character varying(75) NOT NULL,
       is_active boolean DEFAULT true,
       is_deleted boolean DEFAULT false,
);
 
 CREATE TABLE public.job_advert
(
	id integer NOT NULL,
	name character varying(100) NOT NULL,
	city_name character varying(50) NOT NULL,
	salary integer ,
	explanation character varying(10000) NOT NULL,
	is_open boolean NOT NULL,
	is_close boolean NOT NULL,
        is_active boolean DEFAULT true,
        is_deleted boolean DEFAULT false
	
);

	
	

