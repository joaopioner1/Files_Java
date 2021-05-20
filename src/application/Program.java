package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = in.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);//create a file array that contains each folder's path
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		System.out.println("");
		
		File[] files = path.listFiles(File::isFile);//create a file array that contains each file's path
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\newFolder").mkdir();
		System.out.println("Directory created successfully " + success);
		in.close();
	}
}
/*
 String[] lines = new String[] {"Good morning", "Good afternoon", "Good evening", "Good night"};
		
		String path = "D:\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
 */
