package edu.wmich.cs1120.williambowen;

import java.util.*;
/**
 * A version of a stack implemented with two queues
 * @param <T>  Type parameter for Generic class QStack.
 */
public class QStack<T> {
	private Queue<T> queue1;
	private Queue<T> queue2;
	private int size;

	/**
	 * No-arg constructor to initialize members
	 */
	public QStack() {
		queue1 = new LinkedList<T>();
		queue2 = new LinkedList<T>();
		size = 0;
	}
	/**
	 * Add data to the stack.
	 * 
	 * @param data   The data to add to the stack.
	 * @return The data added to the stack (for simpler print statements)
	 */
	public T push(T data) {
	// INCLUDE CODE TO PERFORM REQUIRED ACTION(S).
		queue2.add(data);
		queue2.addAll(queue1);
		queue1.addAll(queue2);
		++size;
		return data;
	}
	/**
	 * Pop data off the top of the stack
	 * 
	 * @return The popped data
	 */
	public T pop() {
	// INCLUDE CODE TO PERFORM REQUIRED ACTION(S).
		if(size > 0) {
			--size;
		}
		return queue1.poll();
	}
    /**
     * Return the size of the stack (number of elements stored in it)
     * @return  The size of the stack
     */
    public int getSize() {
    	return size;
    }
}

