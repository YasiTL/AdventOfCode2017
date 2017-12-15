package day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class day2 {
	public static void main(String[] args) throws IOException{
		List<String> input = Files.readAllLines(Paths.get("day2.in"));
		
		//PART ONE\\
		int total = 0;
		for(int x = 0; x < input.size(); x++){
			String line = input.get(x);
			ArrayList<String> numbers = new ArrayList<>(Arrays.asList(line.split("\t")));
			
			int max = Integer.parseInt(numbers.get(0));
			int min = Integer.parseInt(numbers.get(0));
	
			for(int i = 0; i < numbers.size(); i++){
				if(Integer.parseInt(numbers.get(i)) > max){
					max = Integer.parseInt(numbers.get(i));
				}
				else if(Integer.parseInt(numbers.get(i)) < min){
					min = Integer.parseInt(numbers.get(i));
					}
				}
			total += max - min;
			}
		System.out.println("Part 1: " + total);

//		//PART TWO\\
//		int firstNum = 0;
//		int secondNum = 0;
//		int total2 = 0;
//		for(int x = 0; x < input.size(); x++){
//			String line = input.get(x);
//			ArrayList<String> numbers = new ArrayList<>(Arrays.asList(line.split("\t")));
//			ArrayList<String> numbers2 = new ArrayList<>(Arrays.asList(line.split("\t")));
//	
//			for(int number = 0; number < numbers.size(); number++){
//				firstNum = Integer.parseInt(numbers.get(number));
//				for(int j = 0; j < numbers2.size(); j++){
//					secondNum = Integer.parseInt(numbers.get(j));
//					if (firstNum % secondNum == 0 && number != j ){
//						total2 += firstNum / secondNum;
//					}
//				}
//			}
//		}
//		System.out.println("Part 2: " + total2);
		
	}
}
