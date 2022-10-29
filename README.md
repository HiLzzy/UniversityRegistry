# UniversityRegistry 

This is a backend University Registry which is still a work in progress. It was created using SpringToolsSuite4, MySQL and Postman which uses CRUD functionality (Create, Read, Update, Delete) to maintain the application. Its purpose is to enable a university to access their student’s data e.g., personal and course information. There are two tables, 1) students and 2) courses, and the relationship between the tables is one student can do many courses. 

________________________________________________________________________________________________________


<br>

Operations

Student

•	Add new student 

•	View student

•	Update student 

•	Delete student 

•	View student by ID

•	View student by name 

<br>

Course

•	Add new course 

•	View course

•	Update course

•	Delete course

•	View course by ID

•	View course by name 

•	View course by type

________________________________________________________________________________________________________


<br>

Project Structure:

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

________________________________________________________________________________________________________


<br>

SpringTools Execution:

•	This project was executed on the tomcat server using port number 8080

<img src="https://user-images.githubusercontent.com/99997825/198855900-80f1e1d0-5ba5-4d1e-8930-4e22061aa765.png" width="200" height="200">

SpringToolsSuite Instructions For Use

•	The server must remain free to avoid unnecessary errors of conflict 

•	Click on the project name to open then right click in the code pan, scroll down to Run As and choose either Java Application or SpringBoot App. Both options give the same result, however, if you want your output in the console to be colour coded for better visualisation then choose to run as SpringBoot App. 

________________________________________________________________________________________________________


<br>

Testing

The JUnit test to test which also uses Mockito to test the functionality of the app failed to delete a student from the database. 

<img src=" https://user-images.githubusercontent.com/99997825/198855828-13f5a374-a508-4b19-8861-d947c16ced15.png" width="200" height="200">

________________________________________________________________________________________________________

<br>

Key Takeaway

I was able to understand how the packages and classes, MySQL and Postman all work together to bring about the functionality of the project. As it is, I would have liked to run all my API and JUnit tests successfully at the time of submission. Nevertheless, I shall continue working on my project to understand it further then I will add more tables and tests in future. Although learning Java was a stressful experience due to coming into it with zero previous knowledge, I can still say that it became enjoyable as the weeks went by even though it was and still is very challenging.
