create table if not exists student (
student_id serial primary key ,
student_name varchar(50) not null,
description varchar(100)
);