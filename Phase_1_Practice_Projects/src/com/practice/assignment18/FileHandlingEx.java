package com.practice.assignment18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

//wap to demonstrate the create, read, update, and delete operations on the files in Java.
public class FileHandlingEx {

	public void createFile() {
		try {
			File file = new File("C:\\Users\\Ronali\\Desktop\\Demo\\demo.txt");
			boolean flag = file.createNewFile();
			if (flag) {
				System.out.println("File has been created successfully at the specified location");
			} else {
				System.out.println("File already present at the specified location");
			}
		} catch (IOException e) {
			System.out.println("Exception Occurred:");
			e.printStackTrace();
		}

	}

	public void insertOrUpdateFile() {
		FileWriter fstream = null;
		try {
			fstream = new FileWriter("C:\\Users\\Ronali\\Desktop\\Demo\\demo.txt", true);
			BufferedWriter fbw = new BufferedWriter(fstream);
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the fileData");
			String s = sc.nextLine();
			fbw.write(s);
			fbw.newLine();
			fbw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void readFileData() {

		try {
			BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Ronali\\Desktop\\Demo\\demo.txt"));
			String str;

			while ((str = in.readLine()) != null) {
				System.out.println(str);
			}
			System.out.println(str);
		} catch (IOException e) {
		}

	}

	public void deleteFileData() {
		Path path = Paths.get("C:\\Users\\Ronali\\Desktop\\Demo\\demo.txt");
		try {
			if (Files.exists(path))
				Files.delete(path);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		FileHandlingEx object = new FileHandlingEx();
		object.createFile();
		object.insertOrUpdateFile();
		object.readFileData();
		object.deleteFileData();

	}

}
