package Fundamentals;

public class OOP {
    static String Employee_name;
    static Float Employee_salary;

    public static void set(String name, Float salary){
        Employee_name = name;
        Employee_salary = salary;
    }

    public static void returnInfo(){
        System.out.println("Employees name is " + Employee_name);
        System.out.println("Employees salary is " + Employee_salary);
    }

    public static void main(String arg[]){
        OOP.set("Basic", 10000.0f);
        OOP.returnInfo();
    }
}

/*
* OOP refers to Object-Oriented Programming, they use objects as its primary source to implement what is to happen in the code.
*
* Object-oriented programming aims to implement real-world entities like inheritance, hiding, polymorphism etc.
*
* The main aim of OOP is to bind together the data and the functions that operate on them so that no other part of the code can access this data except that function.
*
* Access Modifiers:
* These define the access type of the method i.e. from where the method can be accessed in your application.
* there are 4 kinds of access specifiers:
*
* Public: Access in all classes in your application
*
* Protected: Accessible within the package in which it is defined and in its subclasses including those outside the package.
*
* Private: only accessible within the class it is defined.
*
* Default: (No modifiers) Accessible within the same class and package within which its class is defined.
*
* Return Type: the data type of the value that is expected to be returned from the method or void if it does return anything.
*
* Method name: The rules for field names apply to method names as well but the convention is a little different.
*
* Parameter List: A comma seperated list of the input parameters that are defined, preceded by their data types, within the enclosed parentheses. if there are parameters it's an empty ().
*
* Exception List: The exceptions you expect the method to throw, you can specify these exceptions.
*
* Method Body: It's the block of code between the enclosed curly braces, that you need to execute to perform your intended operation.
*
* Message Passing: Objects communicate with one another by sending and receiving information to each other. A message for an object is a request for execution of a procedure and therefore will invoke a function in the receiving object that generates the desire result
*
* OOPs, concepts are as follows
* 1. Class
* 2. Object
* 3. Method and method passing
* 4. pillars of OOPs
*   - Abstraction
*   - Encapsulation
*   - Inheritance
*   - Polymorphism
*       - Compile-time polymorphism
*       - Runtime polymorphism
*
* Class:
*
* A class is a user-defined blueprint or prototype from which objects are created.
* it represents the set of properties or methods that are common to all objects of one type.
* Using classes, you can create  multiple objects with the same behavior instead of writing their code multiple times.
*
* 1. Modifiers: A class can be public or have default access (See access modifiers)
* 2. Class name: The name should begin with the initial letter capitalized by convention (Like this MyFunction)
* 3. Superclass (if any): The name of the parent class (Superclass), if any preceded by the keyword extends, A class can only extend (subclass) one parent
* 4. Interfaces (if any): A comma-seperated list of interfaces implemented by the class, if any preceded by the keyword implements. A class  can implement more than one interface.
* 5. Body: The class body surrounded by braces, {}
*
* An object is the basic unit of Object-Oriented Programming that represents real-life entities. A typical java program creates many objects.
* which we know as invoking methods. The objects are what perform your code, they are the part of your code visible to the viewer/user and they consist of
*
* 1. State: it is represented by the attributes of an object. it also reflects the properties of an object.
* 2. Behavior: It is represented by the methods of an object. It also reflects the response of the object to other objects.
* 3. Identity: It is a unique name given to an object that enables it to interact with other objects
* 4. Method: A method is a collection of statements that perform some specific task and return the result to its caller.
*            A method can perform some specific task without returning anything.
*            Methods allow use to reuse code without retyping it, which in turn saves us time.
*
* Pillar 1 Abstraction:
*   Data abstraction is the property by virtue of which only essential data is displayed to the user.
*   The trivial non-essential details are not displayed to the user, like a car you see but don't see every individual part,
*   Data abstraction may also be defined as the process of identifying only the required characteristics of an object, ignoring all the irreverent details.
*   The properties and behavior of an object differentiate it from other objects of similar type and also help classify/grouping the object
*
*   Consider a real life example of a man driving a car. The man know only pressing the accelerator will increase the cars speed or applying the brakes will decrease it.
*   but he does not know how pressing on the accelerator, the speed actually increasing. He does not know about how the mechanism of the car or the implementations of the accelerator, brakes, etc. in the car is abstraction
*
*   In java abstraction is achieved by interfaces and abstract classes. we achieve 100% abstraction with interfaces.
*
*   Example:
*      abstract class GFG{
        abstract void add();
        abstract void mul();
        abstract void div();
       }
*
* Pillar 2 Encapsulation
*   it is defined as the wrapping of data under a single unit. it is the mechanism that bind together the code and the data it manipulates.
*   Another way to think about encapsulation is that it is a protective shield that prevents data from being accessed by the code outside the shield.
*
*   Technically, in encapsulation, the variables or the data in a class is hidden from any other class and can be accessed only through any member function of the class in which they are declared.
    In encapsulation, the data in a class is hidden from other classes, which is similar to what data-hiding does. So, the terms “encapsulation” and “data-hiding” are used interchangeably.
    Encapsulation can be achieved by declaring all the variables in a class as private and writing public methods in the class to set and get the values of the variables.
*
* Pillar 3 Inheritance
*   Inheritance is an important pillar of OOP. it is the mechanism in java by which one class is allowed to inherit the features (fields and methods) of another class.
*   We are achieving inheritance by using the extends keyword. inheritance is known as "is-a" relationship
*
* Let us discuss some frequently used important terminologies:
*
*   Superclass: The class whose features are inherited is known as superclass (also known as base or parent class).
*   Subclass: The class that inherits the other class is known as subclass (also known as derived or extended or child class). The subclass can add its own fields and methods in addition to the superclass fields and methods.
*   Reusability: Inheritance supports the concept of “reusability”, i.e. when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class. By doing this, we are reusing the fields and methods of the existing class.
*
* Pillar 4 Polymorphism
*   It refers to the ability of object-oriented programming languages to differentiate between entities with the same name efficiently.
*   This is done by java with the help of signatures and declarations of these entities.
*   The ability to appear in many forms is known as polymorphism.
*
*   Example:
*
*    sleep(1000) //millis
*       sleep(1000,2000) //millis,nanos
* */
