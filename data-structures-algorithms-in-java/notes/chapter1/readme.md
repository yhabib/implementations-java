# Java Primer

## Keywords
* Polymorfis: More than one method can have the same name if the list of 
arguments is different.
* Encapsulation

## Data types

8 Primitive Types in Java, if none value are defined Java initilizes default to default>
* boolean -> false
* char -> null character
* byte -> 0
* short -> 0
* int -> 0
* long -> 0
* float -> 0
* double -> 0

## Classes
Every object is an instance of a class, which serves as the type of the object and as a blueprint:
* Instance variables or fields, represent the data associated with an object of a class. They have a type, that can be a primitive one
or any class type(reference type).
	`[modifiers] type identifier1[=initialValue1], identifier2[=initialValue2]`
* Methods, can be divided into two types, *accessor* and *update* methods. The first group retrive info without changing any instance variables,
when the second group can change one or more instances.
	* Method's name combined with number and types of its parameters is called *signature*, but it does not contain the type of data returned so it
	is not allowed to have two methods with the same signature to return different types.
	* All parameters in Java are passed **by value**, for objects this means that a new variable is created pointing to the same object.
	```java
	[modifiers] returnType methodName(type1 param1 , ..., typen paramn) {
		body;
	}
	```
* Constructors, they look like regular methods but have some particularities:
	* Cannot be static, abstract or final.
	* Its name must be identical to the name of the class.
	* It does not need a return type specified.
	* When no constructor is defined, Java provides an implicit *default contructor* for the class, but when
	a non default constructor is defined Java proves nothing, so it is nice to define our own default constructor.
* Classes are known as *reference types* so to create a new one **new**.
	* A reference value can store **null**, to represent the lack of an object.
	* Using the **dot** operator on a reference that is **null**, the JRE will throw a *Null Pointer Exception*.
* Remote&TV analogy

#### Modifiers
##### Access Control
They control the level of access (visibility) that the defining class grants
to other classes in the context of a Java Program, **encapsulation**.
* Public, it allows any other class to make a call to that method.
* Protected, it grants access to:
	* Subclasses defined through inheritance
	* Classes that belong to the same package as the given class.
* Private, it grants access to a defined member of a class, only to code within that class.
* Default, it allows other classes in the same package to have access, but not any classes
or subclasses form other packages.

##### The *static*
It ca be declared for any variable or method of a class. When that happens, its value is associated with
the class as a whole, rather than wich each individual instance of that class!! 
* An instance variable can be defined as *static* when we want to store *global* information about its class.
* When a method of a class is defined as *static*, it means that this method is associated with the class
itself, and not with a particular instance of the class, thereby we cannot use *dot* notation with it, instead
it is invoked using the name of the class as a qualifier(Math class). 
This is useful for providing utility behaviors related to a class that need not
rely on the state of any particular instance of that class.


##### The *abstract*
A method of a class may be declared as abstract, in which case its signature is pro- vided but without 
an implementation of the method body. This is useful when combining OOP with inheritance.

##### The *final*
A variable that is declared with the final modifier can be initialized as part of that declaration, but can never again be assigned a new value.
If it is a primitive type, then it is a constant and if it is a reference to an instance, then it will always point or refer
to the same object.

### *this*




