CREATE VIEW number_2 AS SELECT first_name, last_name, BannerID 
FROM does_not_exist;
CREATE VIEW number_3 AS SELECT student.student_id, student.last_name, student.first_name, SECTION.section_id, course.description
CREATE VIEW number_4 AS SELECT student_id, last_name, first_name 
FROM student;

INSERT INTO number_4 (student_id,last_name,first_name)
VALUES (500,'Lasher','Ryan');

ALTER TABLE student
MODIFY (zip VARCHAR2(5) NULL,
registration_date DATE NULL,
created_by VARCHAR2(30) NULL, 
created_date DATE NULL,
modified_by VARCHAR2(30) NULL,
modified_date DATE NULL);

insert into employees
 values (1015, 'Fenter', 'Jim', ' ', 'Chesapeake', 'VA', 23320, ' ', 'N', 'N');
insert into employees
 values (1016, 'Saunder', 'Bill', '11 Apple Rd.', 'Virginia Beach', 'VA', 23455, 7678217443, 'N', 'N');
insert into employees
 values (1017, 'Painter', 'Troy', '77 Ship Lane', 'Norfolk', 'VA', 22093, 7677655454, 'N', 'N');
 alter table employees
 add (Mail_flag char(1));
update employees
set mail_flag = 'Y';
update employees
set mail_flag = 'N'
where street = ' ';
update employees
set phone = 7225659032
where id = 1016;
delete from employees
where id = 1017;
