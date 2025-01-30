package com.core.miscellaneous;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TelephoneWords {

	public static void write(File destination) throws IOException {
		long nb = 0;
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(destination))) {
			for(int i = 0; i <= 999; i++) {
				for(int j = 0; j <=1000; j++) {
					String phone  = String.format("%03d", i) + "-" + String.format("%04d", j);
					nb++;
					System.out.println(nb + ":" + phone);
					writer.write(phone);
					writer.newLine();	
				}
			}
		} finally {
			System.out.println("Finish");
			System.out.println(destination.length() / (1024*1024));
		}
	}
	
	public static void read(File destination) throws FileNotFoundException, IOException {
		try(BufferedReader reader = new BufferedReader(new FileReader(destination))) {
			String s;
			while(null != (s = reader.readLine())) {
				System.out.println(s);
			}
		} finally {
			System.out.println("Well read..");
		}
	}
	
	public static void main(String[] args) throws IOException {
		File destination = new File("src/main/resources/phones.txt");
		//write(destination);
		read(destination);
	}
}
