package com.core.ch08.io;

import java.io.File;

public class IO2 {

	public static void main(String[] args) {
		//Root directory : 
		//Windows => c:\
		//Linux => /
		//The file system is in charge of reading and writing data within a computer
		//Windows uses a backslash character for path
		//Linux uses a forward slash character for path
		System.out.println(System.getProperty("file.separator"));
		System.out.println(System.getProperty("line.separator"));
		System.out.println(java.io.File.separator);
		System.out.println(java.io.File.separatorChar);
		
		File file = new File("src/main/resources/toto.txt");
		System.out.println(file.exists());
		
		//Streams
		//This part is completely unrelated to the new Stream API which works with "Functional Programming"
		//Differences between FileInputStream and FileReader:
		//1.The stream classes are used for inputting and outputting all types of binary or byte data
		//2.The reader and writer classes are used for inputting and outputting only character and String data
		
		//A low-level stream connects directly with the source of the data such as file, an array or a string
		//A high-level stream is built on top of another stream using wrapping
		
		
	}
}
