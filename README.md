 <h2># UniversityRegistry </h2>


<h3>OVERVIEW</h3>

This is a backend University Registry which is still a work in progress. It was created using SpringToolsSuite4, MySQL and Postman which uses CRUD functionality (Create, Read, Update, Delete) to maintain the application. Its purpose is to enable a university to access their student’s data e.g., personal and course information. There are two tables, 1) students and 2) courses, and the relationship between the tables is one student can do many courses. 

## 
<h3>TOOLS USED:</h3>

 <strong>1 -</strong>  <strong>SpringToolsSuite4</strong>: To create the project
 
  <strong>2 -</strong>  <strong>MySQL Workbench</strong>: To build the database
 
  <strong>3 -</strong> <strong>Postman API</strong>: To perform Create, Read, Update, Delete <strong>(CRUD)</strong> tests

## 
<h3>OPERATION FUNCTIONALITIES BY TABLE:</h3>

 <h4>Table 1: Student</h4>

•	Add student 

•	View all students

•	Update student 

•	Delete student by ID 

•	View student by ID

•	View student by name 

<br>

<h4>Table 2: Course</h4>

•	Add course 

•	View all coursees

•	Update course

•	Delete course

•	View course by ID

•	View course by name 

•	View course by type 

<br>
<h4>Table Relationship</h4>

• One student can do many courses e.g. Intro to Pyschology summer short course, Bsc Psychology and Counselling Pyschology full time degree or Double Masters degree.

<br>
<h4>Table Linked By</h4>

• Course ID
## 
 <Strong>Dependencies Used As Follows:</Strong>
 
<Strong>1 </Strong>- spring-boot-starter-validation

<Strong>2 </Strong>- spring-boot-starter-actuator

<Strong>3 - </Strong>spring-boot-starter-data-jpa

<Strong>4 - </Strong>spring-boot-starter-tomcat

<Strong>5 -</Strong> spring-boot-starter-test

 <Strong>6 -</Strong> spring-boot-starter-web

  <Strong>7 - </Strong>spring-boot-devtools

   <Strong>8 - </Strong>mysql-connector-j

   <Strong>9 - </Strong>modelmapper

##

<h3> PROJECT STRUCTURE: </h3>

•	SpringToolsSuite Package Explorer for project below

<img src="https://user-images.githubusercontent.com/99997825/198855784-a0bd22ab-2fc5-4123-8032-515d5fb894c7.png" width="200" height="200">

•	ERD Diagram displaying database tables and their connection/relationship through the course ID below

<img src="https://user-images.githubusercontent.com/99997825/198855805-cca5fca2-7dcb-4c48-a816-705964abb07b.png" width="200" height="200">

•	SpringToolsSuite code pan displaying the student controller class which displays the Postman url commands below 

<img src="https://user-images.githubusercontent.com/99997825/198855806-a7eb6255-3412-41ed-ba3d-b36bd744c059.png" width="200" height="200">

•	Postman API displaying the addition of a student to the database below 

<img src="https://user-images.githubusercontent.com/99997825/198855811-2d2de830-59c8-435b-8cd2-9d6920a249a6.png" width="200" height="200">
 
 •	Postman API displaying the addition of a course to the database below 
 
<img src="https://user-images.githubusercontent.com/99997825/198855822-bdc352d8-e216-48dd-96fc-02fa6ecc2fd6.png" width="200" height="200">

 
## 

<h3>SPRINGBOOT EXECUTION: </h3>

•	This project was executed on the Tomcat server using port number 8080

<img src="https://user-images.githubusercontent.com/99997825/198855900-80f1e1d0-5ba5-4d1e-8930-4e22061aa765.png" width="600" height="250">

<h3>SpringToolsSuite Instructions For Use</h3>

<h4>NOTE:  The Server Must Remain Free To Avoid Unnecessary Errors </h4>

 <b> > </b> Click on the project name to open 

 <b> > </b> Right click in the code pan 
 
 <b> > </b> Scroll down to option Run As
 
 <b> > </b> Choose either Java Application or SpringBoot App to execute. 

Both options give the same result, however, if you want your console output to be colour coded for better visualisation, choose to run as SpringBoot App. 
 
## 

<h3>TESTING</h3>

The JUnit test which also uses Mockito to assess the functionality of the app failed to delete a student from the database, however, this will be recified in future. 

<img src="https://user-images.githubusercontent.com/99997825/198855828-13f5a374-a508-4b19-8861-d947c16ced15.png" width="200" height="200">

## 
<h3>KEY TAKEAWAY</h3>

I was able to understand how the packages and classes, MySQL and Postman all work together to bring about the functionality of the project. As it is, I would have liked to run all my API and JUnit tests successfully at the time of submission. Nevertheless, I shall continue working on my project to understand it further then I will add more tables and tests in future. Although learning Java was a stressful experience due to coming into it with zero previous knowledge, I can still say that it became enjoyable as the weeks went by even though it was and still is very challenging.
