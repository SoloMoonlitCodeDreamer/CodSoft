TASK 1 
ATM MANAGEMENT SYSTEM 

INTRODUCTION 

The ATM Mangement System is a Java based application that actually stimulates an ATM Machine with the functions like withdrawing, depositing and checking balance. I have used Graphical User Interface GUI for user interactions. 

STRUCTURE
This project has four Java classes which are: 
1. Main 
2. User
3. BankAccount 
4. ATM

CLASSES 

  -MAIN CLASS 
    This is the entry point of the application. It prompts the user for their personal details and initial balance, creates a User object, and initializes the ATM         interface.

  -USER CLASS 
    This class represents a user and extends the BankAccount class. It holds user-specific information and calculates the user's age based on their date of birth.

  -BANKACCOUNT CLASS
    This class represents a basic bank account with functionalities to deposit and withdraw money, and to check the balance.

  -ATM CLASS
    This class provides the ATM functionalities which are options to withdraw, deposit, check balance, and view user information. It interacts with the User class to      perform these actions.

RUN THE APPLICATION

-REQUIREMENTS 
    -Java Development Kit (JDK) installed on your machine.
    -The IDE i used was Vs Code
    
-Installation:
    -Clone or download the project to your local machine.
    -Open the project in your IDE or navigate to the project directory in your terminal.

-Running the Application:
    -Compile the Java files.
    -Run the Main class to start the ATM interface.
-Usage
    When you run the application, it will prompt you to enter your first name, surname, date of birth, email address, and initial balance. Once these details are          entered, you will be presented with a menu of options:

1. Withdraw: Withdraw money from your account.
2. Deposit: Deposit money into your account.
3. Check Balance: View your current account balance.
4. Check User Info: View your user information.
5. Exit: Exit the application.
Follow the on-screen instructions to interact with the ATM system.

TASK 2 
STUDENT GRADE CALCULATOR 

INTRODUCTION 

This is a Grade Calculator application written in Java language using Swing for GUI. The application allows users to enter student information and their marks, calculates the average percentage and grade, and displays the results.

STRUCTURE
This project consists of 2 classes:
1. GradeCalculator
2. Student

CLASSES 
  -GradeCalculator
    -This is the main class that handles the flow of the application. It contains the main method and uses a loop to allow multiple students' grades to be calculated.       -It performs the following functions:
        1.Prompts the user for the student's name and the number of subjects.
        2.Creates an instance of the Student class.
        3.Calls methods on the Student instance to input marks and display results.
        4.Provides an option to calculate grades for another student or exit the application.
  -Student 
    -This class handles the data and operations related to an individual student. It has the following features:
        1.name: Stores the student's name.
        2.totalMarks: Gets the total marks obtained.
        3.avgPercentage: Stores the average percentage of marks.
        4.subjects: It is an array to store the names of subjects.
        5.subjectMarks: An array to store the marks for each subject.

RUN THE APPLICATION
  1.When the application starts, it will prompt you to enter the student's name.
  2.Enter the number of subjects.
  3.For each subject, input the subject name and the marks obtained (out of 100).
  4.The application will calculate the total marks, average percentage, and grade.
  5.The results, including the name, total marks, average percentage, grade, and a breakdown of subjects and marks, will be displayed in a dialog box.
  6.You will be asked if you would like to calculate grades for another student or exit the application.

TASK 3
STUDENT MANAGEMENT SYSTEM

INTRODUCTION 

STRUCTURE
This project has 3 classes:
1. Main class
2. Student class
3. StudentManagement class

CLASSES 
    -Main Class 
      -This is the entry point of the application. It contains the main method which starts the StudentManagementSystem and gives the main menu for user interaction.
          -Methods
            1.main(String[] args): The main method that runs the application.
            2.addStudentDialog(StudentManagementSystem sms): Prompts the user to enter details for a new student and adds the student to the system.
            3.removeStudentDialog(StudentManagementSystem sms): Prompts the user to enter the enrollment number of the student to be removed.
            4.searchStudentDialog(StudentManagementSystem sms): Prompts the user to enter the enrollment number of the student to search for.
    -Student Class
      -This class represents a student with characteristics such as name, surname, gender, age, enrollment number, and course name.
        -Characteristics
          *String name
          *String surname
          *String gender
          *int age
          *String enrollmentNumber
          *String courseName
            -Methods
              -Getters and setters for each characteristic.
              -toString(): Returns a string representation of the student object.
    -StudentManagement class
      -This class manages the collection of students. It provides methods to add, remove, search, and display students.
        -Attributes
          1.List<Student> students: A list to store student objects.
        -Methods
          1.addStudent(Student student): Adds a student to the list.
          2.removeStudent(String enrollmentNumber): Removes a student from the list usin the enrollment number.
          3.searchStudent(String enrollmentNumber): Searches for a student using enrollment number.
          4.displayAllStudents(): Displays all students in the list.
          5.getStudentCount(): Returns the total number of students in the list.
RUN THE APPLICATION
  -Run the Main class to start the application.
  -A GUI will appear with options to:
    1.Add Student
    2.Remove Student
    3.Search Student
    4.Display All Students
    5.Exit
