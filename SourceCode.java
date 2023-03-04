package lockedme.com;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SourceCode {
	Scanner sc = new scanner (System.in)
			//Retrieving the file name in an ascending order
			public void retrieve() {
		System.out.println("Enter File Path");
		String n = sc.nextline();
		
		File f = new file(n);
		String s[] = f.list();
		if (s!=null) {
			for(int i=0;i<s.length;i++) {System.out.println(s[i]);}
		}
		else System.out.println("file not found");
	}
	public void add() {
		System.out.println("Enter the file name which you want to create");
		String s1 = sc.nextLine();
		File f1 = new FIle(s1);
		try {
			if(f1.exists()==false) {
				f1.createNewFile();//Creates New File
				System.out.println("File successfully created");							
			}
			else {
				System.out.println("File already exists");
			}
		}
		catch(IOException e) {e.printStackTrace();}
	}
	public void delete() {
		System.out.println("Enter file namewhich you want to delete");
		String s2 = sc.nextLine();
		File f2 = new File(s2);
		if (f2.exists()==true)
		{f2.delete();System.out.println("File is successfully deleted";)}
		else {System.out.println("File does not exist";)}
	}
	public void searchfile() {
		Scanner sc = new Scanner(System.in);
		
	//Prompt user to enter the file name to search
		System.out.println("Enter the file name to search : ");
		String filename = sc.nextLine();
		
	//Prompt the user to enter the directory to search in
		System.out.println("Enter the directory to search in: ");
		String directoryPath = sc.nextLine();
		
	//Get the list of files in the directory and its subdirectories
		File[] files = f.listFiles();
		
	//Loop through the files and search for the specified file
		boolean isFound = false;
		try {for (File file : files) {
		if (file.isFile() && file.getName().equals(fileName)) {
			System.out.println("File found : " + file.getAbsolutePath());
			isFound = true;
			
			
			
		}
		
		}
		
		}catch(Exception e) {system.out,println(e.getMessage() + "wrong input entered";)}
		
	}
		
		
	}

