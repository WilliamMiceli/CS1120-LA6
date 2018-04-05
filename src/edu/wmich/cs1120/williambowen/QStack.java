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
		queue2.add(data);
		while(queue1.size() > 0) {
			queue2.add(queue1.poll());
		}
		while(queue2.size() > 0) {
			queue1.add(queue2.poll());
		}
		++size;
		return data;
	}
	/**
	 * Pop data off the top of the stack
	 * 
	 * @return The popped data
	 */
	public T pop() {
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

