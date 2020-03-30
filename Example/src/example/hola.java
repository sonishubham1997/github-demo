package example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class hola {
	public static void main(String args[]) throws FileNotFoundException 
	{
	
		File file =new File("readfile.txt");
		Scanner input=new Scanner(file);
		while(input.hasNextLine())
		{
		String line=input.nextLine();
		System.out.println(line);
		}
		input.close();
		
}
	}

