select '$' || max(hours * base_pay) "Highest Weekly Gross Pay"
 from x_hours, x_job, x_employee
 where x_employee.emp_code = x_hours.emp_code and x_employee.job_code = x_job.job_code;
select '$' || min (ytd_sales) "Lowest Sales For The Year"
 from x_store2;
select '$' || min (startingbid) "Minimum Starting Bid"
 from x_item
 where opendatetime between '1-JAN-08' and '31-JAN-08';
select store_name, '$' || sum(weekly_sales) "Weekly Sales"
 from x_store, x_store_sales
 where x_store.store_code = x_store_sales.store_code
 group by rollup (store_name);

select description as "Course", first_name || ' ' || last_name as "Professor"
 from course, instructor, section
 where section.course_no = course.course_no and section.instructor_id = instructor.instructor_id;
select description as "Course", first_name || ' ' || last_name as "Professor"
 from course cross join instructor cross join section
 where section.course_no = course.course_no and section.instructor_id = instructor.instructor_id;
select distinct salutation || ' ' || first_name || ' ' || last_name as "Student Name", description as "Course", numeric_grade as "Grade"
from course, grade, student, section, enrollment
where enrollment.student_id = student.student_id and student.student_id = grade.student_id and enrollment.section_id = section.section_id and section.course_no = course.course_no and grade.grade_type_code = 'FI';
select distinct salutation || ' ' || first_name || ' ' || last_name as "Student Name", description as "Course", numeric_grade as "Grade"
from course cross join grade cross join student cross join section cross join enrollment
where enrollment.student_id = student.student_id and student.student_id = grade.student_id and enrollment.section_id = section.section_id and section.course_no = course.course_no and grade.grade_type_code = 'FI';
select c.description as "Course", r.prerequisite as "Prerequisite"
 from course c, course r
 where c.course_no = r.course_no;
select c.description as "Course", r.prerequisite as "Prerequisite"
 from course c join course r
 on c.course_no = r.course_no;
select distinct s.first_name || ' ' || s.last_name as "Student", i.first_name || '   ' || i.last_name as "Professor", c.description as "Course Description", e.final_grade as "Grade"
 from student s, instructor i, course c, enrollment e, section t
 where e.final_grade is not null and s.student_id = e.student_id and e.section_id = t.section_id and t.course_no = c.course_no and t. instructor_id = i.instructor_id;
select distinct s.first_name || ' ' || s.last_name as "Student", i.first_name || ' ' || i.last_name as "Professor", c.description as "Course Description", e.final_grade as "Grade"
 from student s cross join instructor i cross join course c cross join enrollment e cross join section t
 where e.final_grade is not null and s.student_id = e.student_id and e.section_id = t.section_id and t.course_no = c.course_no and t. instructor_id = i.instructor_id;

select * FROM CUSTOMERS 
where state = 'NJ';
select lname, fname from author
where lname like '%IN%'
order by lname, fname;
select title, category from books
where category like 'C%N%';
select title, category from books
where category = 'CHILDREN' or category = 'COOKING';

select isbn, title from books 
where title like '_A_N%'
order by title desc;
select title, pubdate from books
where pubdate between '01-JAN-05' and '31-DEC-05' and category in ('COMPUTER');
select title, pubdate from books
where (pubdate >= '01-JAN-05' and pubdate <= '31-DEC-05') and category = 'COMPUTER';
select title, pubdate from books 
where pubdate like '%-05' and category like 'COMPUTER';
