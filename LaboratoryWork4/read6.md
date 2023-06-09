# Laboratory Work 6

# Description
This project involves the following tasks:
 
1. Create a class called Person, which contains:
a) Fields fullName and age.
b) Methods move() and talk(), which simply print a message to the console - "{Person's name} is talking."
c) Add two constructors - Person() and Person(fullName, age).
Create two objects of this class. One object is initialized with the Person() constructor, and the other with the Person(fullName, age) constructor.

2. Class Phone.
a) Create a class called Phone, which contains the fields number, model, and weight.
b) Create three instances of this class.
c) Print the values of their variables to the console.
d) Add the following methods to the Phone class: receiveCall, which takes one parameter - the name of the caller. It prints the message "Calling {name}" to the console. getNumber - returns the phone number. Invoke these methods for each of the objects.
e) Add a constructor to the Phone class that takes three parameters to initialize the class fields - number, model, and weight.
f) Add a constructor that takes two parameters to initialize the class fields - number and model.
g) Add a parameterless constructor.
h) Add an overloaded method receiveCall that takes two parameters - the subscriber's name (the caller) and the phone number. Call this method.
i) Create a method sendMessage with variable-length arguments. This method takes phone numbers as input to which a message will be sent. The method prints the phone numbers to the console.

3. Implement a hierarchy.
![image](https://github.com/Stotskyi/OOP/assets/116818493/e46c2b44-5d49-463f-bea4-41cd6fab886d)

4. Create an abstract class Car with fields model, color, and maximum speed. The class also contains the "regular" gas() method, which simply prints some text to the screen (e.g., "Accelerating!"), and an abstract brake() method. Implement derived classes Sedan and Truck. Create objects of the Sedan and Truck classes. Execute the methods on behalf of the created objects.

5. Create a class that describes a library card. The class has the following data: name, surname, and number of borrowed books. Public class functions: input of name, surname, number of borrowed books, increasing or decreasing the number of borrowed books.

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.


# Requirements
In order to run this project, you will need to have the following installed on your computer:
Java Development Kit (JDK) version [insert version number here]

# Build Instructions
Navigate to the root directory of the project in your terminal
Run the following command to build  the project: 
```
build
```

# Run Instructions
Run the following command to run the projects:
```
run
```
After command enter the name of the Java class they wish to run, choosing from Task1, Task2, Task3, Task4, or Task5.
 




## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
