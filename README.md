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

