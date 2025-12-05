package super_and_this_keyword;

public class Audi extends Car{
	//super()-Calling the Parent Class Constructor: When we create an object of the subclass, its constructor needs to call the constructor of the parent class. 
//	This can be done with the help of the super keyword and it calls the constructor of the parent class.

//First Statement in a Constructor: When calling a superclass constructor, the super() statement must be the first statement in the constructor of the subclass. 
	//This ensures that the parent class is properly initialized before the subclass does anything else.
	/**
	 * If a constructor does not explicitly invoke a superclass constructor, the Java compiler automatically inserts a call to the no-argument constructor of the superclass. If the superclass does not have a no-argument constructor, you will get a compile-time error. 
	 * The object does have such a constructor, so if the Object is the only superclass, there is no problem.
	 * If a subclass constructor invokes a constructor of its superclass, either explicitly or implicitly, you might think that a whole chain of constructors is called, all the way back to the constructor of Object.
	 *  This, in fact, is the case. It is called constructor chaining.
	 *  If the superclass does not have a no-argument constructor
	 *  and the subclass doesn't explicitly call another superclass constructor, a compilation error will occur.
	 */
	public Audi() {
		
		/**super()-calling the constructor of superclass constructor from the child class constructor
		 * The call to super() (with or without arguments) must be the very first statement in the subclass constructor.
		 * 
		 */
		//super()
		System.out.println("no arg");
	}
public Audi(int a) {
	//super()
	System.out.println("single arg "+a);	
	}
public Audi(int a,int b) {
	//super()
	System.out.println("parameterized constructor "+(a+b));
}
/**
 * this-
 * To refer to current class instance variables: This is the most common use. When a constructor or method parameter has the same name as an instance variable, 
 * this.variableName is used to distinguish the instance variable from the local parameter, preventing variable shadowing
 * To invoke current class methods: You can use this.methodName() to explicitly call another method within the same class. While often optional (as methods can typically be called directly), it can improve readability in some cases.
*To invoke current class constructors: From one constructor, you can call another constructor within the same class using this(parameters). 
*This is useful for constructor chaining, where a more general constructor can initialize common fields and then delegate to a more specific constructor for additional setup
 * To pass the current object as an argument in a method call: You can pass this as an argument to another method if that method requires an instance of the current class.
*To return the current class instance: In some methods, particularly builder patterns or fluent APIs, return this; is used to return the current object, allowing for method chaining.
 * 
 * 
 */

}
