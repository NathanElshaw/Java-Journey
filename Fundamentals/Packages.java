package Fundamentals;

public class Packages {
}

/*
A java package is a group of similar types of classes, interfaces, and sub-packages

Java has some has built-in packages like java, lang, awt, javax, swing, net, io, util, sql etc.

To access packages from another package you using (package package.name for classes or package package)

Import process goes as
Package -> Import -> Class

How it works:

Package names and directory structure are directly related

if a package name is college.staff.cse then there are three directories, college, staff and cse such that cse is present in staff and staff is present in college

Also, the directory college is accessible through CLASSPATH variable path of the parent directory of college is present in Classpath

Adding a class to the package:

We can add more classes to a package by using package name at the top of the program.


SubPackages:

subpackages are packages within another package

These are not imported by default they have to be imported explicitly. Members of a subpackage have no access privileges they are considered as different packages for protected and default specifiers

Built-in packages

there are 2 types of packages built-in packages and user created packages.

built packages are as follows and are built into the java language
1) java.lang: Contains language support classes(e.g classed which defines primitive data types, math operations). This package is automatically imported.
2)  java.io: Contains classed for supporting input / output operations.
3)  java.util: Contains utility classes which implement data structures like Linked List, Dictionary and support ; for Date / Time operations.
4)  java.applet: Contains classes for creating Applets.
5)  java.awt: Contain classes for implementing the components for graphical user interfaces (like button , ;menus etc).
6)  java.net: Contain classes for supporting networking operations.

User-Defined packages
    These are packages that are defined by a user, First we create the directory myPackage name should be the same as the package. Then create a class called MyClass in side the directory with the first statement being the package name

Using Static import:
    Static import is a feature in Java (version 5+) that allows members(fields and methods) defined in a class as public static to be used in java code without specifying the class in which the field is defined

        Example:
            import static java.lang.System.*;

            class StaticImportDemo
            {
                public static void main(String args[])
                {
                    // We don't need to use 'System.out'
                    // as imported using static.
                    out.println("GeeksforGeeks");
                    }
                }
                Output: GeeksforGeeks


 */
