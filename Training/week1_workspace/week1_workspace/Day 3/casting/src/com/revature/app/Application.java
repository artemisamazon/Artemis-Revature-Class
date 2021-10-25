package com.revature.app;

import com.revature.model.Animal;
import com.revature.model.Cat;
import com.revature.model.Dog;

public class Application {

	public static void main(String[] args) {
		/* Casting is the conversion from one type to another
		 * Remember that we have two different types of variables
		 * 1. primitive variables
		 * 2. reference variables
		 * 
		 * This means, wer also have 2 different types of casting:
		 * 1. Widening/narrowing conversions (primitives)
		 * 2. Upcasting/downcasting conversions (reference types)*/
		
		
		/* 
		 * Widening/narrowing conversions
		 * 
		 * When we convert from one primitive type to another, we are either widdening or narrowing our type
		 * 
		 * byte, short, char, int, long, float, double
		 * 
		 *This type of casting can either be implicit or explicit
		 *
		 * Implicit: occurs when yo wnat to fit a narrower type into a larger type
		 * Explicit: we need to explicitly specify that we want to convert from a wider type to a narrower type
		 * 	We need to do this, beacause if we have a number outside of the range of the narrow type, we lose that 
		 *  information. Another way of putting it is that going from a wider to a narrower type is a "dangerous conversion"
		 *  (we could lose information)
		 */
		
		
		
		//Implicit (widening conversion)
		long myLong;
		int myInt =1000;
		
		myLong = myInt; //We know the long variable can ALWAYS store anything that the int variable stores
		
		//Explicit  (narrowing conversion)
		int myInt2;
		//myLong has a value of 1000
		myInt2 = (int) myLong; // A long can contain a value outside the range of what an int can store
		System.out.println("myInt2" + myInt2);// myInt2 will print out a value of 1000 as well, because 1000 fits inside an int as well
		
		
		myInt2 = (int) 3_000_000_000L; // a long is 64 bits, we are cutting off the 32 leftmost bits of information to fit this value into an int
		//we lose, in other words, 32 bits of information. The remaining 32 bits of information to the right represent the number -1294967296
		System.out.println("myInt2" +myInt2);
		
		
		/*
		 * Reference type casting
		 * 
		 * 	1. Upcasting (implicit): from a more specific type to a less specific type
		 *  2. Downcasting (explicit): from a less specific type to a more specific type (unsafe operation)
		 *  
		 *  This has to do particularly with inheritance
		 *  
		 *  Animal (top of the hierarchy)
		 *   ^   ^
		 *  Dog Cat (bottom of the hierarchy)
		 */
		
		// When you create classes, you are creating new types of reference variables
		// We have the Animal, Dog, and Cat types
		Animal a1 = new Animal();
		a1 = new Dog();
		
		Dog d1 = (Dog) a1; // Downcasting, we are going from the Animal type to a Dog type -> from less specific to more specific
		// Cat c1 = (Cat) a1; // Downcasting
		// ClassCastException is thrown when we try to cast a parent reference type to a child reference type when that parent is pointing to an object that is not of the child type
		// Ex. Animal a1 is pointing to a Dog object, so we cannot cast to the Cat type (because a Dog is not a Cat)
		
		// On the other hand, we know that cats and dogs are ALWAYS animals (Animals are not always dogs or cats)		
		Dog d2 = new Dog();
		Cat c2 = new Cat();
		
		a1 = d2; // Dogs are always animals, so upcasting is implicit and we do not need to explicitly write the casting ourselves
		a1 = c2; // Cats are always animals
	}


	
		
		
		
	}


