package ch10_files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {

	public static List<String> readFile(File source) throws FileNotFoundException, IOException {
		List<String> data = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
			String s;
			while(null != (s = reader.readLine())) {
				data.add(s);
			}
		}
		return data;
	}
	
	public static void writeFile(List<String> data, File destination) throws IOException {
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(destination))) {
			for(String s : data) {
				writer.write(s);
				writer.newLine();
			}
		}
	}
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File source = new File("src/main/resources/zoo.txt");
		File destination = new File("src/main/resources/zoo-copy.txt");
		List<String> data = readFile(source);
		for(String s : data)
			System.out.println(s);
		
		writeFile(data, destination);
	}
}
