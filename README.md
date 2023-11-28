# Java Basics - ReadMe

**Date:** Monday, November 27, 2023

## Overview

This document provides a summary of key concepts discussed on November 27, 2023, related to Java programming.

## Java Basics

- Monday, November 27, 2023
- Java Basics
- Jshell ( for writing java programs in cmd in one line,  introduced in java 9)
- Java -> Compile(JavaC) -> Bytecode (.class) -> JVM (to run the prgm)
- JDK -> JRE -> JVM
- To run the program in another machine we need only JRE + JVM
- Strongly Typed Lang (data type)
- Javac Hello.Java (compile), Java Hello(run using the className which contains Main)
- Byte,short,int,long,float,double,char,bool   default is int and double
- long l=4568l, float f=34.5f (l and f are needed bcs compiler thinks they are int and double)
- Implicit conversion(automatic conversion where smaller data type val is stored in larger data type)
- Explicit conversion is type casting( where larger data type is stored in smaller data type by casting) but there will be loss of conversion in some cases.
- result=(n%2==0)?10:20
- Class has a stack containing methods, and each method will have a stack containing local variables
- Class a; // reference variable for a class
- new Class();// creates an object for that class in the heap memory (instance variables and methods) and initializes the constructor.
- Each object has its own memory in heap, so changing of variable using one object does not reflect in other object.
- Int s[]={4,5} //Array, int a[]=new int[];
- Arrays homogenous(single data type but can store objects which can have multiple data types), continuous memory allocation, searching needs iterating over all the elements, fixed size(can have dynamic but creating new array and storing process more)
- String name=new String(“sass”), String name=“sass” (literals) // two ways of creation
- In JVM, in Heap Memory, We have string constant pool, where string literals are stored.  If a string literal of same string is created then it will check the pool if the string is present or not. 
- Strings are immutable, once created cannot be changed, if we concatenate a string then new object is created for that string, original one is not changed.
- StringBuffer and StringBuilder are used to create mutable strings. String Buffer is thread safe and String Builder is not.
- Static variables are shared by all the objects, if one object changes the value, then it is changed in all the objects. Static variables are called with class names. className.staticVariable.
- Constructor is used to initialize the variables, whenever an object is created , constructor is called and variables inside the constructor are initialized.
 - We can use static block to initialize static variables, if we initialise inside the constructor they are called everytime. In order to avoid that we use static block which is called only once in the whole execution.
- Static block is called before constructor because Object creation involves class loading and object creation, for the first object creation , class is loaded and static block is called , then for multiple objects , object is created as class is already loaded once.
- Class.forName(className)  // to load the class, this way we can check static block is called. 
- Static method does not require object creation , and static method cannot access non static elements, but can access them using objects shared through arguments.
- Instance variables should be kept private and should access them using methods.
- this - refers to the object that which is currently calling.
- Default constructor, parameterised constructor, can have method overloading in constructor
- When a subclass (Extended class) object is created , the super class default constructor is called first .
- If a parameterised constructor is created, then default constr must be created
- Every constructor contains super() which even if we dont mention , it is the first line in the constructor which calls super class constructor
- In order to call the parameterised constructor, use super(args) from the extended constructor, this() can be used to call the current class constructor.
- super() calls super class constructor, this() calls current class constructor
- Every class in Java extends Object class
- Anonymous objects are objects which dont have reference variable, just new A();
- We can create a method with same name in child class which is already  present in parent class, if child class object is created then child class method is called.
- Multi level is allowed - class B extends A - class C extends B
- No multiple inheritance - class A extends B,C - Not allowed - because if same method is present in B and C , then A will be in ambiguity to call which class method. 
- Package com.Source, import com.Source;
