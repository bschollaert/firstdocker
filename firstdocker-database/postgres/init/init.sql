CREATE TABLE public.config (
	id int4 NOT NULL,
	app varchar(128) NOT NULL,
	profile varchar(128) NOT NULL,
	"label" varchar(128) NOT NULL,
	ky varchar(255) NOT NULL,
	val varchar(255) NOT NULL,
	CONSTRAINT pk_config PRIMARY KEY (id)
);

INSERT INTO public.config
(id, app, profile, "label", ky, val)
VALUES(2000, 'firstdocker-member-service', 'local-dev', 'master', 'management.endpoints.web.exposure.include', '*');
INSERT INTO public.config
(id, app, profile, "label", ky, val)
VALUES(2001, 'firstdocker-member-service', 'local-dev', 'master', 'spring.datasource.url', 'jdbc:postgresql://localhost:5432/firstdocker');
INSERT INTO public.config
(id, app, profile, "label", ky, val)
VALUES(2002, 'firstdocker-member-service', 'local-dev', 'master', 'spring.datasource.username', 'userdocker');
INSERT INTO public.config
(id, app, profile, "label", ky, val)
VALUES(2003, 'firstdocker-member-service', 'local-dev', 'master', 'spring.datasource.password', 'mypwd');
INSERT INTO public.config
(id, app, profile, "label", ky, val)
VALUES(4000, 'firstdocker-member-service', 'dev', 'master', 'management.endpoints.web.exposure.include', '*');
INSERT INTO public.config
(id, app, profile, "label", ky, val)
VALUES(4001, 'firstdocker-member-service', 'dev', 'master', 'spring.datasource.url', 'jdbc:postgresql://firstdocker-postgres:5432/firstdocker');
INSERT INTO public.config
(id, app, profile, "label", ky, val)
VALUES(4002, 'firstdocker-member-service', 'dev', 'master', 'spring.datasource.username', 'userdocker');
INSERT INTO public.config
(id, app, profile, "label", ky, val)
VALUES(4003, 'firstdocker-member-service', 'dev', 'master', 'spring.datasource.password', 'mypwd');

CREATE TABLE people (people_id integer NOT NULL, surname varchar(100) NOT NULL, age integer NOT NULL, PRIMARY KEY(people_id));
INSERT INTO people (people_id,surname,age) VALUES (1,'TEST1',25);
INSERT INTO people (people_id,surname,age) VALUES (2,'TEST2',35);
INSERT INTO people (people_id,surname,age) VALUES (3,'TEST3',35);
INSERT INTO people (people_id,surname,age) VALUES (4,'TEST4',45);
INSERT INTO people (people_id,surname,age) VALUES (5,'TEST5',45);
COMMIT;
SELECT * from people;
