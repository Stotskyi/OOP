# Laboratory Work 7

# Description
This project involves the following tasks:

1. Create a TaxiService class. To begin with, our service needs cars. Create a Car class with the following fields: 
  Car brand, Engine power, Driver, Price, Year of manufacture.
  
  Create a Driver class with the following fields: Name, Age, Driving experience.
  
  (Note: You need to choose the data types for each field on your own. The classes should have all the necessary methods,     including constructors.)
  
  Create at least 10 and no more than 20 cars. Use parameterized constructors when creating objects. Put all our created      cars into an ArrayList.
  
  Repair the engine of half the car fleet, which will increase the power of the cars by 10% (reassign the power field).       
  Hire new drivers for the repaired cars (reassign the driver field).
  
  Next, take every second car (use a loop with a step of 2 and the size() method) and increase its engine power by 10% and    price by 5%.
  
  After that, check the experience of ALL our drivers. If a driver has less than 5 years of experience but their age is       over 25, send them to a qualification improvement course, which will increase their experience by 1 year.
  
  Create a Helper class and write a method that takes an array of cars as a parameter and selects a random element from       this array (use new Random().nextInt(cars.length); where "cars" is the name of the cars array (replace it with your own     array name)).
  
  After finding the element, print the text to the console in the following format: "A car of the model brand with the        driver name is coming for you." Then pass this car to the next method, which will print "Driver name has arrived at the    destination" to the console.

2. Write a program called "PhoneBook" that will store surnames and phone numbers using the HashMap class.

Try the following operations with the Map:

put(K key, V value) - adds an element to the map.

get(Object key) - searches for a value by its key.

remove(Object key) - removes a value by its key.

containsKey(Object key) - checks if the map contains a given key.

containsValue(Object value) - checks if the map contains a given value.

size() - returns the size of the map (the number of key-value pairs).

Add at least 10 surnames and phone numbers to the phone book.

Using a loop, print the information from the phone book.

Find a given number in the book by surname. If the surname is not found, display the message "The subscriber is not found   
in the phone book" on the screen. Delete a random entry from the phone book. Print the number of entries in the phone book

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
