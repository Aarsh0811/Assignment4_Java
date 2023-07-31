DROP DATABASE IF EXISTS student_info_system;
CREATE DATABASE student_info_system;

SHOW DATABASES;

USE student_info_system;

CREATE TABLE student (
    StudentID INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    Name VARCHAR(100),
    Age INT,
    Address VARCHAR(300),
    Gender VARCHAR(10),
    ContactNumber VARCHAR(10)
);

CREATE TABLE courses (
    CourseID INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    CourseName VARCHAR(100),
    CourseInstructor VARCHAR(100),
    CourseDescription VARCHAR(500),
    CourseDelivery VARCHAR(50),
    CourseCapacity INT,
    CourseCredits INT
);

CREATE TABLE enrollments (
  EnrollmentID INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  StudentID INT NOT NULL,
  ProfessorID INT NOT NULL,
  CourseID INT NOT NULL,
  EnrollmentType VARCHAR(50),
  EnrollmentDate DATE,
  EnrollmentTerm VARCHAR(50),
  FOREIGN KEY (StudentID) REFERENCES student(StudentID),
  FOREIGN KEY (CourseID) REFERENCES courses(CourseID)
);

CREATE TABLE grades (
    GradeID INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    StudentID INT NOT NULL,
    ProfessorID INT NOT NULL,
    CourseID INT NOT NULL,
    GradeValue VARCHAR(3) NOT NULL,
    GradeDate DATE NOT NULL,
    FOREIGN KEY (StudentID) REFERENCES student(StudentID),
    FOREIGN KEY (CourseID) REFERENCES courses(CourseID)
);

CREATE TABLE exams (
    ExamID INT PRIMARY KEY NOT NULL,
    StudentID INT NOT NULL,
    ProfessorID INT NOT NULL,
    CourseID INT NOT NULL,
    ExamName VARCHAR(100) NOT NULL,
    ExamType VARCHAR(20) NOT NULL,
    ExamDate DATE NOT NULL,
    FOREIGN KEY (StudentID) REFERENCES student(StudentID),
    FOREIGN KEY (CourseID) REFERENCES courses(CourseID)
);

SELECT * FROM student;
SELECT * FROM courses;
SELECT * FROM grades;
SELECT * FROM exams;
SELECT * FROM enrollments;
