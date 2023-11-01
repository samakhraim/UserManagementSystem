# UserManagementSystem
Using the Java design principle I am required to design and implement a small application for a company that manages the following user structure:
● Director: Has a list of Managers and Staff.
● Manager: Has a list of Staff. 
● Staff
![user management system (1)](https://github.com/samakhraim/UserManagementSystem/assets/62477773/10e09925-f386-4df9-a216-058aa5e585a6)
This Object Oriented Project was done following the 5 rules of the SOLID principle.

Single Responsibility
Open-Closed Principle
Liskov Substitution Principle
Interface Segregation Principle
Dependency Inversion Principle

The class diagram consists of 9 different Objects.
A User Object which serves as the main abstract class in our code.
From this User Abstract Class, the Staff, Director, and Manager classes are inherited, each with their own Implementations.

The Staff, Director, and Manager classes have their own unique attributes and methods, in addition to the ones inherited from the User Abstract Class.

We also have a Data Base Class, which is responsible for holding and saving the information of all the Staff, Director, and Manager Classes.

Finally, we have the 2 interfaces for generating Reports for the Director and Manager.

The IBudgetReport and the StaffListGenerator interfaces are responsible for accessing the Data Base class and retrieving certain information.

Their Job is to print different lists based on the assignment for each Director and Manager. This is done by creating BudgetReport and StaffListReport and making them implement the IBudgetReport interface and the StaffListGenerator interface respectively.

Finally, all 9 classes come together in the Main code, to create, add, and manage different types of users type Staff, Director, and Manager. These Users are saved in a Data Base class, and then different types of reports are generated using the BudgetReport Class and the StaffListReport Class.

Dividing my work into all these classes allowed me to follow all 5 Rules of the SOLID Principle, with each class having the correct responsibilities, and my code being flexible in general.
