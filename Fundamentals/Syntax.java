package Fundamentals;
/*
 Class-
    is a blue print of the instance of a class that
    can share common properties and methods

 Object-
    The object is an instance of a class. it has an entity that has 
    behavior and state

 Method-
    The behavior of an object is the method

 Instance variable-
    The state of an object is generally created by the 
    values that are assigned to these instance variables 
 */

public class Syntax {
   public static void main(String[] args) {
      IamDog dog = new IamDog(); // make a new instance of this class
      System.out.println(dog.Bark());
   }
}

/*
 * The Name of the source file should match the public class name such as
 * Basic.java should have
 * pulic class java
 * 
 * Java is CaseSensative
 * 
 * Text based class names are perferred and cannot start with a number
 * and inner words should be upper case like NewClass
 */

/*
 * -Identifiers
 * these are names of local variable, instance or class and labels All unicode
 * charater are
 * valid
 * 
 * all being with a letter
 * 
 * first charaters can be followed by any combination of letters digits currency
 * symbols and
 * underscores(not recommened)
 * 
 * are case sensative
 * 
 * keywords cannot be used as identifiers as they are reservered
 * 
 * White spaces are ignored in java
 */

/*
 * -Access Modifiers
 * Access modifiers
 * default, public, private
 * Non access Modifiers
 * final, abstract, static, transient, synchronzied, volatile, native
 * 
 * Access Modifier | Within Class | Within Pkg | Outside pkg by subclass |
 * Outside class
 * Private Y N N N
 * Default Y Y N N
 * Protected Y Y Y N
 * Public Y Y Y Y
 */
