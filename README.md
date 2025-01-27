Project Overview

This project demonstrates various object-oriented programming (OOP) concepts, including single inheritance, multilevel inheritance, hierarchical inheritance, and encapsulation. Each problem showcases a real-world scenario and how these OOP principles can be applied effectively to solve them.

Problems

Problem 1: Single Inheritance

Scenario:
A company wants to manage its employees and their departments.

Classes and Functionality:
	1.	Employee (Base Class):
	•	Private Attributes:
	•	employeeId (String)
	•	name (String)
	•	department (String)
	•	Methods:
	•	Getters and setters for all attributes.
	2.	Manager (Subclass):
	•	Attributes:
	•	bonus (double).
	•	Methods:
	•	calculateTotalSalary(double baseSalary): Calculates and returns the sum of base salary and bonus.

Main Method Tasks:
	•	Create an object of Manager.
	•	Set attributes using setters.
	•	Call calculateTotalSalary() and display the manager’s details along with the total salary.

 Problem 2: Multilevel Inheritance

Scenario:
A university needs to track its faculty, students, and their respective departments.

Classes and Functionality:
	1.	Person (Base Class):
	•	Attributes:
	•	name (String)
	•	age (int)
	•	Methods:
	•	displayInfo(): Prints the person’s details.
	2.	Faculty (Subclass of Person):
	•	Attributes:
	•	facultyId (String)
	•	department (String)
	•	Methods:
	•	Overrides displayInfo() to include faculty details.
	3.	Professor (Subclass of Faculty):
	•	Attributes:
	•	researchArea (String)
	•	Methods:
	•	Overrides displayInfo() to include professor details.

Main Method Tasks:
	•	Create an object of Professor.
	•	Set attributes using setters.
	•	Call displayInfo() to display complete professor details.

 Problem 3: Hierarchical Inheritance

Scenario:
A vehicle showroom wants to classify its inventory into different types.

Classes and Functionality:
	1.	Vehicle (Base Class):
	•	Attributes:
	•	brand (String)
	•	model (String)
	•	price (double)
	•	Methods:
	•	displayDetails(): Prints the vehicle’s details.
	2.	Car (Subclass of Vehicle):
	•	Attributes:
	•	numberOfDoors (int)
	•	Methods:
	•	Overrides displayDetails() to include car-specific attributes.
	3.	Bike (Subclass of Vehicle):
	•	Attributes:
	•	engineCapacity (String)
	•	Methods:
	•	Overrides displayDetails() to include bike-specific attributes.

Main Method Tasks:
	•	Create objects of Car and Bike.
	•	Set their attributes using setters.
	•	Call displayDetails() to display their details.

 Problem 4: Combining Encapsulation and Inheritance

Scenario:
A library wants to track books and their issuers.

Classes and Functionality:
	1.	Book (Base Class):
	•	Private Attributes:
	•	bookId (String)
	•	title (String)
	•	author (String)
	•	Methods:
	•	Getters and setters for all attributes.
	2.	IssuedBook (Subclass of Book):
	•	Attributes:
	•	issuerName (String)
	•	issueDate (String)
	•	Methods:
	•	displayBookDetails(): Displays both book and issuer details.

Main Method Tasks:
	•	Create an object of IssuedBook.
	•	Set attributes using setters.
	•	Call displayBookDetails() to display all details.

 Problem 5: Real-Life Application (Multilevel + Encapsulation)

Scenario:
An e-commerce platform wants to track users and their order details.

Classes and Functionality:
	1.	User (Base Class):
	•	Private Attributes:
	•	userId (String)
	•	userName (String)
	•	Methods:
	•	Getters and setters for all attributes.
	2.	Customer (Subclass of User):
	•	Attributes:
	•	email (String)
	•	phoneNumber (String)
	•	Methods:
	•	displayCustomerInfo(): Displays user and customer details.
	3.	Order (Subclass of Customer):
	•	Attributes:
	•	orderId (String)
	•	orderAmount (double)
	•	Methods:
	•	Overrides displayCustomerInfo() to include order details.

Main Method Tasks:
	•	Create an object of Order.
	•	Set attributes for User, Customer, and Order using setters.
	•	Call displayCustomerInfo() to display all details.

 Key Concepts Covered
	1.	Encapsulation: Use of private attributes and public getter/setter methods to protect data.
	2.	Inheritance: Demonstrates single, multilevel, and hierarchical inheritance.
	3.	Polymorphism: Overriding methods to provide specific implementations in subclasses.
	4.	Object-Oriented Design: Application of OOP principles to solve real-world scenarios.

 How to Run the Program
	1.	Ensure you have a Java development environment set up (e.g., JDK and an IDE like IntelliJ IDEA or Eclipse).
	2.	Create individual Java files for each problem or combine them into one file.
	3.	Compile and run the program to test each scenario.

Author
@meetmehedi
This project was developed to demonstrate OOP concepts in Java with practical examples.
