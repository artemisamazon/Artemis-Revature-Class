package com.revature.app;

import com.revature.model.Bus;

public class Main {
	
	/*
	 * Variables
	 * 
	 * What types of variables do we have in Java?
	 * 
	 * 1. Primitives: directly store values "within  them" in memory
	 * 2. reference variables : refer to other locations in memory. In particular, reference variables "point" to the location of objects in memory
	 * 
	 * 
	 * Within memory (RAM), we have two 
	 * What types of primitive variables do we have?
	 *  1. int
	 *  2. double 
	 *  3. boolean
	 *  4. char
	 *  5. float 
	 *  6. long
	 *  7. byte
	 *  8. short
	 *  
	 *  3 Overarching primitive types: 
	 *  	1. boolean
	 *  	2. integral types (byte, short, char, int, long)
	 *  	3. floating types (float, double)
	 *  
	 *  1. boolean: technically 1 bit, JVM dependent (sometimes the JVM allocates, for example 8 bits, but in reality you just need 1 bit)
	 *  2. byte: 8 bites (bits are the smallest units of data that can be either 0 or 1). Bye has a range from -128 to 127 (integral types)
	 *  3. short: 16 bits. -32768 to 32767. (integral types)
	 *  4. char: 16 bits. 0 to 65535. Typically not used to store numbers. (integral types)
	 *  5. int: 32 bits. (integral types)
	 *  6. long: 64 bits. (integral types)
	 *  7. float: 32 bits. (floating point types)
	 *  8. double: 64 bits. (floating point types)
	 *  
	 */
	
	public static void main(String[] args) {
		primitivesExample();
		
		System.out.println();	
		
		referenceExample();
	}

	public static void primitivesExample() {
		// 
		/*
		 * Integral Types
		 */
		
		// 8 bits
		byte myByte = 10; // Variable declaration
		System.out.println("myByte = " + myByte);
		
		byte anotherByte = 10; // Initialization = the initial assignment of a value to a local variable. 
		
		System.out.println("anotherByte = " + anotherByte); 
		
		
		// 16 bits
		short myShort = 25_767; // _  is used for readability cannot be used at the beginning or at the end of the number
		System.out.println("myShort = " + myShort); 
		
		char myChar = 'A'; // 'A' is an example of a "char literal"
//		myChar = 100; // you can change the value that the variable is storing
		
		System.out.println("myChar = " + myChar); 
		
		// 32 bits
		int myInt = 2_000_123_100;
		System.out.println("myInt = " + myInt); 
		
		// 64 bits
		long myLong = 21224434342342342L; // with the L, we signify that this number is a "Long literal"
		System.out.println("myLong = " + myLong); 
		
		/*
		 * 
		 * Floating Types
		 */
		
		float myFloat = 3.14159f; //A decimal number by default is a "double literal" Doubles are larger than floats, so we need to explicityly specify
		// a "float literal" by putting f at the end of the number
		System.out.println("myFloat = " + myFloat); 
		
		double myDouble = 3.14159; // 3.114159 is a "double literal" that can fit into a double
		System.out.println("myDouble = " + myDouble); 
		/*
		 * Boolean Type
		 */
		
		boolean myBoolean = true;
		myBoolean = false;
		
		myBoolean = (10 == 100);
		System.out.println("myBoolean = " + myBoolean); 
		
	}
	
	
	public static void referenceExample(){
		// Reference Variables: refer to the location of an object
		Bus bus1 = null; // Because Bus is in a different package, we must import it
		// reference variables can either be null or be pointing to an object
		
		// Without the reference variable actually pointing to an object, whenever we try to access the properties from that variable, it will give a NullPointerException
		bus1 = new Bus(); // new Bus() is what create a Bus object.
		// bus1  = ... is what point the bus1 variable to the newly created object 
		
		bus1.model = "Greyhound";
		bus1.type = "Express";
		bus1.year = 2020;
		bus1.numberOfWheels = 18;
		
		System.out.println(bus1.model);
		System.out.println(bus1.numberOfWheels);
		System.out.println(bus1.type);
		System.out.println(bus1.year);
		
		Bus bus2 = new Bus(10, 2020, "Some Model", "Express");
		
		System.out.println(bus2.model);
		System.out.println(bus2.numberOfWheels);
		System.out.println(bus2.type);
		System.out.println(bus2.year);
		
		
		Bus bus3 = new Bus(30, 2010, "Another Model", "City");
		
		bus2 = bus3; // We are copying the location of the object bus3 is pointing to over to bus2
		// This means that both bus2 and bus3 are refrencing the same object in memory
		
		// The original object that bus2 was pointing to, which now has 0 reference, will be garbage collected
		bus3 = null; 
				
	}

}
