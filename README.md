# calculette
As part of my training at the efrei school, I set up a calculator. The challenge of the project is to practice using classes and objects. The names of objects, classes and variables will be in French.
object-oriented design and

Prof: Tierry Marianne.
programming a calculator in java
 
We want to return the result of arithmetic operations such as
- addition
- substraction
- multiplication
- dividing
 
Our classes will be the following (optional proposals):
- Calculator
- TypeOperation (main)
- Operand
 
Our methods will be as follows:
- calculate
- add
at least
 
as a bonus
- multiply
- to subtract
- divide
 
We can rely on the following primitive types:
- boolean
- string of characters
- floating
at least
! Attention, integers are to be avoided here.
 
Our project will have at most 5 classes
and at least 2 classes.
 
The result of an operation is displayed on the screen
by calling the calculate method
 
We pass operands and the type of operation as an argument
of our program in the form of character strings.
 
For example :
java -classpath ./src Calculator plus 1 2
#3
 
Our program will be responsible for validating the operands (http://fr.wikipedia.org/wiki/Op%C3%A9rande)
in the case of division (! division by 0 is not defined)
 
The entry point will be added to the Calculator class.
 
No inheritance is allowed in this exercise in order to promote composition (next week's session devoted to these notions).
As a bonus, you are free to enter the operands and the type of operation one by one.
 
We are free to make use of exceptions for error handling.
 
The program must be executable (this point will be checked strictly). A deliverable (github link or zip archive must be provided before 5 p.m. Thursday via Teams (in the 2023-03-23_travaux-pratiques folder).
 
Better a calculator capable of adding correctly than a calculator with several possible operations displaying no result or a false result.
 
Working with up to three individuals is strongly encouraged
(bonus for close-knit teams that have specified in the comments of the code the responsibilities of each member of the team).
