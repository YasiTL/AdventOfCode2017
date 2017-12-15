package day8;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day8 {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner file = new Scanner(new File("day8.in"));
		
		while(file.hasNextLine()){
			String line = file.nextLine();
			System.out.println(line);
			String[] info = line.split(" ");
			System.out.println(info);
		}
		
	}

}
