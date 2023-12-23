# Command-Line Calculator

## Description

The Command-Line Calculator is a simple Java program that performs various mathematical operations based on user commands. The user can input commands to perform operations such as addition, subtraction, multiplication, division, factorial, palindrome check, prime check, power calculation, square root, finding the maximum, calculating the average, checking if a number is even or odd, and exiting the command-line interface.

## Usage

To use the command-line calculator, follow the instructions below:

1. Run the program.
2. Enter a command along with the necessary parameters (if required).
3. The program will execute the specified mathematical operation and display the result.
4. Repeat steps 2-3 for additional operations.
5. To exit the command-line calculator, enter the command `exit`.

## Supported Commands

- `add <num1> <num2> ...`: Perform addition.
- `sub <num1> <num2> ...`: Perform subtraction.
- `mul <num1> <num2> ...`: Perform multiplication.
- `div <num1> <num2>`: Perform division.
- `fact <num>`: Calculate factorial.
- `pal <num>`: Check if a number is a palindrome.
- `prime <num>`: Check if a number is prime.
- `pow <base> <exponent>`: Calculate power.
- `square <num>`: Calculate square root.
- `max <num1> <num2> ...`: Find the maximum of given numbers.
- `avg <num1> <num2> ...`: Calculate the average of given numbers.
- `even <num>`: Check if a number is even.
- `odd <num>`: Check if a number is odd.
- `exit`: Terminate the command-line calculator.

## Example

```sh
$ java MathOperations

~~~~~ Welcome to Math Operations Command Terminal ~~~~~
----- Enter a command or type 'exit' to terminate the command line

>> add 5 6 5
Result: 16

>> mul 3 4
Result: 12

>> prime 7
Result: true

>> avg 10 20 30 40
Result: 25.0

>> exit
Exiting the command line. Goodbye!
