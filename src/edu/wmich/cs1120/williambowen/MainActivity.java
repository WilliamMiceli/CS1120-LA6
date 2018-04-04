package edu.wmich.cs1120.williambowen;

import java.util.ArrayList;
import java.io.*;
/**
 * 
 *
 */
public class MainActivity {

	// YOU NEED TO REPLACE ALL ‘T’s WITH THE APPROPRIATE CLASS NAME FOR THE TYPE 
	// PARAMETER. WHAT IS THE TYPE OF ELEMENTS READ FROM THE INPUT FILE?

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ArrayList<Short> store = new ArrayList<>();
		Read read = new Read(store);

		QStack<Short> stack = new QStack<>();
		SQueue<Short> queue = new SQueue<>();
		MinValueStack<Short> mVStack = new MinValueStack<>();

		read.readFileInputStream("TestData.dat");

		System.out.println("The values pushed onto the stack are:");
			// INCLUDE CODE TO STORE ALL ELEMENTS FROM THE ARRAYLIST IN BOTH “stack” AND 
			// “mVStack”
		System.out.println();
		for(int i = 0; i < store.size(); ++i) {
			System.out.print(store.get(i) + " ");
			stack.push(store.get(i));
		}

		System.out.println("\n\nThe values popped off the stack in order are:");
			// INCLUDE CODE TO REMOVE AND DISPLAY ALL ELEMENTS STORED IN “stack”.
		System.out.println();
		for(int i = 0; i < stack.getSize(); ++i) {
			System.out.println(stack.pop() + " ");
		}
		System.out.println("\n\nThe min value (from the minimum value stack) is:"+mVStack.minValue());
		
		System.out.println("\nThe values popped off the minimum value stack in order are:");
			// INCLUDE CODE TO REMOVE AND DISPLAY ALL ELEMENTS STORED IN “mVStack”.

		System.out.println("\n\nThe values enqueued onto the queue are:");
			// INCLUDE CODE TO DISPLAY AND STORE ALL ELEMENTS FROM THE ARRAYLIST IN “queue”.
		System.out.println();
		for(int i = 0; i < store.size(); ++i) {
			System.out.print(store.get(i) + " ");
			queue.enqueue(store.get(i));
		}
		System.out.println("\n\nThe values dequeued from the queue in order are:");
			// INCLUDE CODE TO REMOVE AND DISPLAY ALL ELEMENTS STORED IN “queue”.
		System.out.println();
		for(int i = 0; i < queue.getSize(); ++i) {
			System.out.println(queue.dequeue() + " ");
		}
	}
}
