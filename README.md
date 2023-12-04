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

# Java Basics - ReadMe

**Date:** Tuesday, November 28, 2023

## Overview

This document provides a summary of key concepts discussed on November 28, 2023, related to Java programming.

## Java Basics

- Tuesday, November 28, 2023
- Public (can be used from anywhere), Private (Only in same class), default (same package), protected(same package, outside package extended class only)
- Generally Class public, instance variables private, Methods can be public/protected, don’t use default much without knowing where to use
- Compile Time polymorphism (behavior is defined at compile time, EX: overloading) , Run time polymorphism (behavior is defined at run time EX: overriding)
- Dynamic Method dispatch which method runs depends at run time, can create a reference variable of parent class and object of child class.
- Final variable cannot be changed, final class cannot be extended, final method cannot be overridden(so no method overriding)
- Every class extends Object class, if we do not override the methods from object class , then it will call Object class methods like toString(), hasCode(), equals()
- Upcasting and Downcasting of objects.
- Cannot create an object for abstract class, abstract class can have both abstract and non abstract methods, abstract methods should have only declaration, class which extends abstract class should define the abstract methods, if the method is abstract then class should be abstract.
- Inner class can be static, inner class object should be created using outer class object if inner is not static.
- When we need a method which should be overridden and used only once, then rather than extending the class and creating a new one, we can use anonymous inner class where overridden method is  written beside object creation. Where the object is created for the new overridden method and not for the original class.
- We can also do the same for abstract methods.
- If we have a abstract class, which has only abstract methods, then we can use interface instead of abstract.
- Interface only declaration of methods are allowed, methods are public&abstract by default but from java 8 we can define methods in interface.
- Multiple inheritance of interfaces are allowed - interface A implements B,C
- Interface Y extends X
- enum - classes
- Annotations - supplement to compiler, - @Override, @Deprecate
- @FunctionalInterface - interface which contains only one method, it doesn’t need to be implemented in another class and write its definition, we can create an object for interface and define the function beside the object using the interface name. Same like anonymous abstract functions.
- For functional interfaces, java8 introduced Lambda functions ()->{} where you just define the function in the brackets. So less verbose.
- Different types of interface —- Normal, Functional/SAM(Single Abstract Method) , Marker Interface
- Marker Interface - blank interface no methods, nothing - used to update something to compiler saying please allow this (Ex serialization - storing objects in hard drive, so saying compiler to allow the objects to be able to store).
- Errors - Compile time , run time or Exceptions, logical
- Exception Handling - handling runtime errors
- To Handle Exception Using try, catch block - if try fails , then catch will be executed and the remaining program continues
- Try executes , till it finds an Exception and then if it finds it will move to catch block. Whatever the statements are executed before the exception in try they are continued after the catch too. So the statements are computed.
- Object -> Throwable -> Exception
- Exception -> RuntimeException(called as Unchecked Exceptions) , SQLException, IOException.. etc
- RuntimeException -> ArrayIndexOutOfBounds, ArithmeticException, NullPointerException etc..
- throw - throw keyword is used to throw the exception and catch block catches it. So we throw the exception and we handle them in catch.
- throws - saying I am throwing an exception, not handling. The method which is calling me will handle the exception using try , catch or throw. So we just throw and wont handle. Used for checked exceptions.
- println( ) is a method in PrintStream Class, out is an object of PrintStream Class which is a static variable of type PrintStream class created in System class.
- Taking input : InputSystemReader in=new InputSystemReader(system.in), BufferedReader bf=new BufferedReader(in), bf.readLine( ), bf.close( ) //closing bcs buffered reader is a resource
- Scanner sc = new Scanner(system.in), sc.next( )
- Finally block can be used to execute things irrespective of try & catch. We can have try and finally without having catch block. Finally can be used to close the resources.
- If you have a finally block, it will be executed regardless of whether there's a return statement or an exception within the try block. The purpose of the finally block is to ensure that certain code is executed regardless of how control leaves the try block—whether it's due to normal execution or an exception.
- try(resources) - this can be used where the resources are given inside a try function and they are auto closeable.
- Threads - Smallest Unit of execution in a process
- Creating a Thread - Class A extends Thread , class A implements Runnable
- A scheduler job is to allow which  threads to run at a time, so these threads can run parallel. The operating system's scheduler decides which threads get processed on which cores, based on factors like priority, thread readiness, and available resources.
- Multi-threading is the concurrent execution of multiple threads within the same process.
- Parallel:Parallel refers to events or processes that occur independently, side by side, and at the same time.In computing, parallelism often involves the simultaneous execution of multiple tasks on separate processing units, such as multiple CPU cores or processors. This can result in true concurrency, with each task making progress independently.
- Simultaneous:Simultaneous means occurring at the same time.It can refer to events happening at the same moment, but it doesn't necessarily imply independence. Events can be simultaneous without occurring independently or in parallel. For example, two events might be scheduled to happen at the same time, but one might depend on the other.
- Concurrent: Concurrent means events or processes that are in progress at the same time. It implies that multiple tasks are being executed, but, similar to "simultaneous," it doesn't inherently suggest independence. Concurrent tasks may share resources or be interleaved rather than running independently in parallel.
- Thread.sleep(10) //asking the thread to wait
- Threads & Mutation - where multiple threads are trying to update the same value ( Ex : Using 2 debit cards for a single bank account debiting money) , so in order to avoid that use immutable data or thread safe
- Thread safe - means only one thread can work on a data or an element at one time
- t1.join() - to make sure thread completes its execution
- Synchronized - used to make sure only one thread can access the method at a time.

  # Java Basics - ReadMe

**Date:** Wednesday, November 29, 2023

## Overview

This document provides a summary of key concepts discussed on November 29, 2023, related to Java programming.

## Java Basics

- Thread States - “New” (when a thread is created it will be in new state) —> start( ) ->  After start() it will go into “Runnable” state —> It will be in Runnable state waiting for scheduler —-> Using Run( ) it will move to “Running” state —> using sleep( ) or wait( ) it will move into “Waiting” state ——> using notify( ) it will move into Runnable from Waiting 
- Using stop( ) to move from Runnable to “Dead” state or Running to “Dead” . But this is deprecated. We don’t need to explicitly close the threads, as they automatically close when we come out of execution.
- When wait( ) is used notify( ) should be used to move from Waiting to Runnable
- Collection API or Collections Framework , Collection(which is an interface) , Collections ( this is a class which has some methods) . All three are different
- Iterable interface is extended by -> Collection Interface is extended by List , Queue, Set interfaces. Which again these interfaces are implemented by their classes as List Interface - ArrayList,LinkedList class, Queue Interface - DeQueue, Set Interface - HashSet, LinkedHashSet classes
- List allows duplicate values, Set won’t ,  HashSet doesn’t follow the order and has no indexing, TreeSet sorts the values
- Iterator( ) is used to iterate, which belongs to Iterator interface.
- Map Interface is a part of Collection API, HashMap is a class which implements Map interface, supports key value pair, keys should be unique, null keys and values are allowed,
- Hashtable is a class which implements Map, both are same but Hashtable is Synchronized(which allows only one thread to modify the Hashtable at a time)
- Collections.sort(list) - this belongs to Collections class, used to sort the collection
- Can write own our sort logic using Comparator. Compares the values of the list based on the logic and sorts.Collections.sort(list,comparator), 
- We can use compareTo( ) method by implementing Comparable interface too. If the class is implementing Comparable  we dont need Comparator.
- To give power to the class, We can use Comparable and, to specify on which logic we need to compare , we can use Comparator
- Java 8, Streams API, Stream used to work on data, one Stream can be used only once, using it again throws error.provides methods to perform operations like filter, map, reduce.

# OOPS - ReadMe

**Date:** Thursday, November 30, 2023

## Overview

This document provides a summary of key concepts discussed on November 30, 2023, related to Java programming.

- Class: logical entity, object: physical reality , instance of class, occupies space in memory
- new - dynamically allocates memory, and returns a reference.
- Wrapper classes like Integer,Float,Double and Boolean are final classes.
- If a primitive variable is final, we cannot change its value. But, if a non primitive variable like an object reference variable is final, we can change its value, but cannot reassign it Ito other objects.
- Garbage Collection will destroy unused objects from the memory. But Java provides methods , to use before garbage collection . finalize( )  is the method which we can use to perform things before garbage collection.
- Singleton class - where you allow only one object to be created, make constructor private and access it using a public method, check if object is created or not. 
- Inheritance, Polymorphism, Encapsulation, Abstraction

# OOPS - ReadMe

**Date:**  Monday, December 4, 2023

## Overview

- Type of reference variable determines what we can access, it doesn’t depend on the object.
- Inbuilt Packages - lang(Essentials Java), io(input, output), util, applet, AWT, net(for networking)
- Obj instanceof A: to check obj is instance of class A or not
- obj.getClass( )  - gives the class, obj.getClass( ).getName( )
- Abstract static method cannot be created , as static method cannot be overridden.
- Interface variables are final & static. 
- From java 8, Interface can have default and static methods which should contain a body.
- If an interface contains protected access for a method, then in implementation , the method should be either protected or more restrictive like private.  overridden methods - should not be less protective.
- In Generics, Type Parameter (T) is not allowed for static variables. 
- Can you upper bound wildcards ( ? ) to relax the restrictions on a variable. process(ArrayList< ? Extends Number) , Here process will accept Number and its subtypes which are Integer, Double etc. So extends should be with upper bound.
- Shallow copy and deep copying
- Vector is synchronised

