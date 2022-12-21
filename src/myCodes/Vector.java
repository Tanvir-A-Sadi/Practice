package myCodes;

/*
 * Vectors are also a dynamic array like ArrayList 
 * but it has two major differences.
 * - Vector is synchronized, but ArrayList are not
 * - Vector contains many legacy methods that are not 
 * 	part of the collections framework.
 * 
 * The vector class is an implementation of the List interface
 * that allows us to create resizable-arrays similar to the 
 * ArrayList Class.
 * add(element - adds an element to vectors
 * add(index, element) - adds an element to the specified position
 * addAll(vector) - adds all elements of vector to another vector.
 * 
 */

import java.util.Vector;
public class Vector {
public static void main(String[] args) {
		Vector numVector = new Vector();
		numVector.add(10);
		numVector.add(20);
		numVector.add(30);
		numVector.add(40);
		numVector.add(50);
		System.out.println("The size of te vector: " + numVector.size());
		System.out.println("Numbers: " + numVector);
	}
}
