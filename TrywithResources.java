package com.info;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TrywithResources {
	public static void main(String[] args) throws URISyntaxException {
		try (BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Users\\Sunil\\Documents\\workspace-1\\Tester\\src\\com\\info\\text.txt"))) {
				System.out.println("---------------------------------Files readall line using paths-----------------------------------");
				System.out.println(Files.readAllLines(Paths.get(("C:\\Users\\Sunil\\Documents\\workspace-1\\Tester\\src\\com\\info\\text.txt"))));
				
				System.out.println("---------------------------------Read all bytes using paths-----------------------------------");
				
				System.out.println(new String(Files.readAllBytes(Paths.get(("C:\\Users\\Sunil\\Documents\\workspace-1\\Tester\\src\\com\\info\\text.txt")))));
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
