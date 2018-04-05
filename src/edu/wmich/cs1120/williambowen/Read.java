package edu.wmich.cs1120.williambowen;

import java.util.ArrayList;
import java.io.*;
/**
 * Reads the data from the provided file
 *
 */
public class Read {
	
	private ArrayList<Short> store; 
	/**
	 * Constructor
	 * @param store the ArrayList of the data read from the file
	 */
	public Read(ArrayList<Short> store) {
		this.store = store;
	}
	/**
	 * read the data and save them into an ArrayList.
	 * @param filename The name of the file provided
	 */
	public void readFileInputStream(String filename) {
		try (InputStream inputStream = new FileInputStream(filename);) {
			DataInputStream is = new DataInputStream(new BufferedInputStream(inputStream));
				while(true) {
					this.store.add(is.readShort());
				}
		} catch (EOFException ex) {
			// Import is complete
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
