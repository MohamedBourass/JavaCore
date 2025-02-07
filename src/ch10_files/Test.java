package ch10_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		String fileName = "src/main/resources/phones.txt";

		//read file into stream, try-with-resources
		
		//StringBuilder word = sco.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);

		
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			stream.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
