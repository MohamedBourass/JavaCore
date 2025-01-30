# Java Basics

## 4 Principles of Object Oriented Programming (OOP)
### Abstraction
Abstraction is to turn real world objects, properties, and behaviors into a computational representation.

### Encapsulation
Encapsulation is to protect internal properties and behaviors of an object from being manipulated externally.

### Inheritance
Inheritance is to reuse properties and behaviors of a base class by a derived class.

### Polymorphism
Polymorphism is the ability of an object to assume and be used as other forms.

## Class
- Every class in Java is a subclass of `Object`
- The class Object contains the methods `equals(Object obj)`, `hashCode()`, `toString()`, `getClass()`
- In Java, the main scopes are `public`, `private`, `protected`
- When no scope, this is the scope `package` which is applied
- Public scope ==> Accessible from anywhere in the program
- Protected scope ==> Accessible within the same package and by subclasses (even if they are in different packages)
- Private ==> Accessible only within the class where it is defined.
- Package ==> Accessible only within the same package. 
- A final class cannot be inherited

## Interfaces

## Methods

## Primitives

```java
int[] key; //recommended
int key[]; //legal but less readable
String[][][] toto; //3D array
String [] titi[]; //2D array
int[5] toto; //not legal
```






// only one public class per source code file ==> check me! because this is not the case in Outer!
// 
// an interface is a contract , its methods are implicitly public and abstract
// all variables defined in an interface must be public, static and final
// interface methods cannot be static
// if there is a method "abstract" in a class, this class must be declared as "abstract"
// a method cannot be "abstract" and "final", "abstract" and "private
// " or "abstract" and "static"
// "synchronized" is applied only to method and indicated a method can be accessed by only one thread at a time
// a constructor cannot have a return type
// a constructor cannot be static, final or abstract
// instance variable cannot be marked as "static"
// local variables are always on the stack, not on the heap
// the compiler will reject local variables that has not been assigned value (because no default value) ==> check me !
/
/ array is always an object on the heap




// final for a primitive means that the value will never be changed
// final for an object ref means that the ref will not change but the values within the object can change
// transient means that the variable is ignored if the object is serialized
// volatile tell the JVM that a thread accessing the variable must always reconcile its own private copy of the variable with the master copy in memory
// in overriding, the access level cannot be more restrictive than the overridden method
// you cannot override a method called static
// the overriding method must not throw checked exception that are new or broader than those declared by the overridden method
// ordering: init blocks, static init blocks, => check me!
	
## Garbage collection

- The role of GC is to make sure that the heap has as much free space as possible
- Instance variables and objects live on the heap, local variables live on the stack
- The GC is under the control of the JVM, the JVM decides when to run the GC
- An object is eligible to GC when no live thread can access it
- To be eligible = nulling a reference or reassigning a ref variable or isolating a reference
- The GC cannot be forced, in reality, it is possible only to suggest the JVM to run the GC with the `System.gc()` which is the same that `Runtime.getRuntime().gc();`
- When you use finalize(code)  to run some code before your object is deleted by GC