
import java.util.List;
import java.io.File;
	import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
	import java.util.HashMap;
	import java.util.Scanner;

public class Day1 {
	public static void main(String[] args) throws IOException {
		
		//List<String> input = Files.readAllLines(Paths.get("day1.in"));
		//The above is a nicer way to read files and such. Use later.
		
		Scanner file = new Scanner(new File("day1.in"));
		String input = file.nextLine();
		
		char[] char_array = new char[input.length()];
		char_array = input.toCharArray();
		
		int total = 0;
		int[] int_array = new int[char_array.length];
		
		for(int i = 0; i < char_array.length; i++){
			int_array[i] = Character.getNumericValue(char_array[i]);
		}
		
		for(int x = 0; x < int_array.length - 1; x++){
			if (int_array[x] == int_array[x + 1]){
				total += int_array[x];
				//then add 5 to the end b/c the last number and the first number match.
			}
		}
		System.out.println(total + int_array[int_array.length-1]);
		
//		for(int x = 0; x < char_array.length - 1; x++){
//			if (char_array[x] == char_array[x + 1]){
//				total += Character.getNumericValue(char_array[x]);
//				//then add 5 to the end b/c the last number and the first number match.
//			}
//		}
//		System.out.println(total + Character.getNumericValue(char_array[char_array.length-1]));
		
		//int [] A = new int [.length/2];
		//char [] B = new char [char_array.length/2];
		
		int A[] = Arrays.copyOfRange(int_array, 0, int_array.length/2);
		int B[] = Arrays.copyOfRange(int_array, int_array.length/2, int_array.length);
		
		
		
//		for(int x : A){
//			if(A[x] == B[x]){
//				int total2 = 0;
//			}
//				total += A[x] * 2;
//		}
		
	}
}