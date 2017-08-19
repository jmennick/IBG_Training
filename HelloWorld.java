/*class header, public accessor is described below
 *but public in this instance allows for another class to instantiate an object representing this class
 *and being able to call the methods associated to it
 *class keyword to let the compiler know that this is a class, not a method
 *HelloWorld is the name of the class
 */
public class HelloWorld {
	/*main method, public is an accessor allowing for other classes
	 *to run this method, given that the other class calling this method passes the required
	 *parameter: String[] args.
	 *static means that this is a class method
	 *void means that this method passes nothing to any other classes or methods
	 *main is the name of the method
	 *String[] pronounced "array" is a list of String arguments that are passed to our program at runtime
	 *args is the name of the String[] and it is a keyword representing the aforementioned arguments
	 *
	 *system is a class in java
	 *out is an output stream of system
	 *println is a method of this output stream, which outputs either String arguments or variable data,
	 *whichever is in the argument parentheses
	 */
	public static void main(String[] args) { 
		System.out.println("Hello World");
	}

}
