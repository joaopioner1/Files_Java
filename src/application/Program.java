package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		File file = new File("D:\\jesus.txt");
		Scanner in = null;
		try {
			in = new Scanner(file);
			while (in.hasNextLine()) {
				System.out.println(in.nextLine());
			}
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if (in != null) {
				in.close();
			}
		}
	}
}
