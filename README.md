# UniversityRegistry 

This is a backend University Registry which is still a work in progress. It was created using SpringToolsSuite4, MySQL and Postman which uses CRUD functionality (Create, Read, Update, Delete) to maintain the application. Its purpose is to enable a university to access their student’s data e.g., personal and course information. There are two tables, 1) students and 2) courses, and the relationship between the tables is one student can do many courses. 

Operations

Student

•	Add new student 
•	View student
•	Update student 
•	Delete student 
•	View student by ID
•	View student by name 

Course

•	Add new course 
•	View course
•	Update course
•	Delete course
•	View course by ID
•	View course by name 
•	View course by type
•	

Project Structure:

•	ERD Diagram displaying database tables and their connection/relationship through the course ID below
 

•	SpringToolsSuite Package Explorer for project below

 
•	SpringToolsSuite code pan displaying the student controller class which displays the Postman url commands below 

 

•	Postman API displaying the addition of a student to the database below 
 


SpringTools Execution:

•	This project was executed on the tomcat server using port number 8080
•	The server must remain free to avoid unnecessary errors of conflict 

•	Click on the project name to open then right click in the code pan, scroll down to Run As and choose either Java Application or SpringBoot App. Both options give the same result, however, if you want your output in the console to be colour coded for better visualisation then choose to run as SpringBoot App. 


Testing

The JUnit test to test which also uses Mockito to test the functionality of the app failed to delete a student from the database. 

 

Key Takeaway

I was able to understand how the packages and classes, MySQL and Postman all work together to bring about the functionality of the project. As it is, I would have liked to run all my API and JUnit tests successfully at the time of submission. Nevertheless, I shall continue working on my project to understand it further then I will add more tables and tests in future. Although learning Java was a stressful experience due to coming into it with zero previous knowledge, I can still say that it became enjoyable as the weeks went by even though it was and still is very challenging.

![image](https://user-images.githubusercontent.com/99997825/198854646-26efa1cd-da92-4f98-83d9-e52a8e272d7a.png)
