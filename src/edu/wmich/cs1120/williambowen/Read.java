package edu.wmich.cs1120.williambowen;

import java.util.ArrayList;
import java.io.*;
/**
 * 
 *
 */
public class Read {
	
	private ArrayList<Short> store; 
	
	public Read(ArrayList<Short> store) {
		this.store = store;
	}
	/**
	 * read the data and save them into an ArrayList.
	 * @param filename
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
