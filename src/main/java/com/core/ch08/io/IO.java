package com.core.ch08.io;

import java.io.File;

public class IO {

	public static void main(String[] args) {

		File file = new File("src/main/resources/zoo.txt");
		System.out.println("File exists : " + file.exists());
		if(file.exists()) {
			System.out.println("Absolute Path : " + file.getAbsolutePath());
			System.out.println("Is Directory : " + file.isDirectory());
			System.out.println("Parent Path : " + file.getParent());
			if(file.isFile()) {
				System.out.println("File size : " + file.length());
				System.out.println("File lastModified : " + file.lastModified());
			} else {
				for(File subFile : file.listFiles())
					System.out.println(subFile.getName());
			}
		}
	}
}
