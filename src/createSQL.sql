DROP DATABASE if exists edgedb;
CREATE DATABASE edgedb;
USE edgedb;

CREATE TABLE student (
    name VARCHAR(30), 
    studentSSN VARCHAR(9),
    PRIMARY KEY (studentSSN)
);
CREATE TABLE faculty (
    name VARCHAR(30), 
    facSSN VARCHAR(9),
    PRIMARY KEY (facSSN)
);
CREATE TABLE courses (
    courseName VARCHAR(20), 
    courseNumber INTEGER,
    PRIMARY KEY (courseName)
);
