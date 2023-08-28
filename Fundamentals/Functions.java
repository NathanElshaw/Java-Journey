package Fundamentals;

public class Functions {

}

/*
 * Method Declaration:
 * Public(Access Specifier) int(Return type) name(Method Name) (Parameters) >
 * Method header
 * 
 * Access Specifier:
 * This specifies the acess type of the method and the visiability of it.
 * these include:
 * Public: Access from all classes
 * Private: Access from classes that specify it
 * Protected: Access from the same package or subclass
 * Default: Visible from only the same package
 * 
 * Return type:
 * the return data type if it doesnt return anything then its void
 * 
 * Method Name:
 * the name of the method usually linked to the functionality of the method like
 * Add() or Subtract()
 * 
 * Parameter list:
 * each parameter is seperated by a comma and is used with in the function
 * 
 * Method Body:
 * this contains all the actions with in the method enclosed with curly braces
 */

/*
 * Naming a Method:
 * should be a verb and start with a lower case letter. usally followed by a
 * noun or adj to better describe the methods use
 * 
 * Single word methods:
 * named as sum() or area()
 * 
 * Muli word methods:
 * named as areaOfCricle() or stringCompression()
 * 
 * its possible to have the same name in a method as another in the same class
 * its know as method overloading
 */

/*
 * Types of Methods:
 * Pre-defined and User defiend:
 * 
 * Java comes with some predefined methods such as length(), toString() and
 * equals()
 * 
 * In Java you can also make your own classes such as evenOdd() or fooBar()
 * 
 * Static Methods:
 * a method that contains the static keyword. or in other words it belongs to a
 * class rather than a instance of a class
 * 
 * the main advantage is that we can call it without creating an object for
 * example the public static main function
 * 
 * public class Display {
 * public static void main(String[], args){
 * show();
 * }
 * static void show()
 * {
 * System.out.println("This is a static method")
 * } *}
 * 
 * Instance Method:
 * The method class is know as an instance method is a non-static method defined
 * in the class. Before calling or invoking the instance method
 * 
 * Ex:
 * public class InstanceMethodExample {
 * public static void main(String[], arg){
 * InstanceMethodExample obj = new InstanceMethodExample()
 * System.out.println("This sum is: "+obj.add(12,13))
 * }
 * public int add(int a, int b){
 * s = a + b;
 * return s;
 * }
 * }
 * 
 * there are 2 types of instance methods
 * Accessor method:
 * the method(s) that reads the instance variables is known as the accessor
 * method.
 * its ususally marked with the word get and is known as getters.
 * Mutator method:
 * The method(s) read the instance variable and also modifies them, they are
 * usually marked with the word set
 * and are known as setters or modifiers. They do not return anything. they
 * accept the same parameter of the same data type that depends on the feild.
 * its used to set the value of a private field
 * 
 * Abstract Method:
 * The method that does not have a method body is known as an abstract method.
 * in other words, without implementation id known as abstract method. it always
 * declares in the abstract class. it means the class itself must be abstract if
 * it has a abstract method. use the key word abstract
 * 
 * Ex:
 * abstract class Demo {
 * abstract void display();
 * }
 * 
 * public class MyCLass extends Demo {
 * void display()
 * {
 * System.out.println("Abstract Method?")
 * }
 * public static void main(String[], arg){
 * Demo obj = new MyClass();
 * 
 * obj.display();
 * }
 * }
 * 
 */
