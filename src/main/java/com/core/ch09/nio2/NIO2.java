package com.core.ch09.nio2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIO2 {

	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get("src/main/resources/zoo.txt");
		//IO:
		File file1 = path1.toFile();
		System.out.println("File exists : " + file1.exists() + " # " + Files.exists(path1));
		System.out.println("Name : " + file1.getName() + " # " + path1.getFileName());
		System.out.println("Absolute Path : " + file1.getAbsolutePath() + " # " + path1.toAbsolutePath());
		System.out.println("Is Directory : " + file1.isDirectory() + " # " + Files.isDirectory(path1));
		System.out.println("Is File : " + file1.isFile() + " # " + Files.isRegularFile(path1));
		System.out.println("Length : " + file1.length() + " # " + Files.size(path1));
		System.out.println("Parent Path : " + file1.getParent() + " # " + path1.getParent());
		
		//Stream.
	}
}
