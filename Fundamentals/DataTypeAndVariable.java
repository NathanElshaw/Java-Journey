package Fundamentals;

public class DataTypeAndVariable {

}

/*
 * -Variables
 * to declare variables you need to initalize them using a declaration such as
 * int, float,
 * double, char
 * 
 * to initalzie them you use syntax like int a = 100 which makes variable a
 * equal to 100
 * 
 * some uncommon initalizers are pi, do, and a
 * 
 * you can combine delcarations and initalization like int a=10, b=10, c=20 or
 * float pi = 3.14f
 * 
 * -Types of Variables
 * Local: These are decalred within a body of a method
 * 
 * Instance: These are variables declared without the Static keyword, they are
 * defined outside
 * a method declaration. They are object specific
 * 
 * Static: These only initalized once at the start of the programs execution.
 * these should be
 * initalized first, before ant Instance variables
 * Ex:
 * 
 * class Example {
 * static int a=1; Static Variable
 * int data = 99; instance variable
 * void method() {
 * int b = 90 local variable
 * }
 * }
 */

/*
 * Data Types
 * There are 2 types of data types primative and non primative
 * Primative: are predefined and available with in java and do not share state
 * with other
 * primative values
 * 
 * Primative types:
 * byte(1 byte), short(2 byte), int(4 byte), long(8 byte), char(2 byte), float(4
 * byte), double(8 byte),
 * boolean(1 byte) (true/false)
 * 
 * all numeric data types are (+/-)
 * the size of data types remain the same on all platforms
 * char data type is 2 bytes because it uses unicode
 * 
 * Non-Primative types:
 * Strings, Array and others
 */

/*
 * Type conversion and Type casting
 * a variable of one type can recieve the value of another type in 2 cases
 * Type Conversion:
 * double d;
 * int i = 10;
 * d = i;
 * 
 * Type Casting:
 * double d = 10;
 * int i;
 * i = (int) d
 */
