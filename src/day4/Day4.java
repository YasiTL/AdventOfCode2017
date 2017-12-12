package day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Day4 {
	public static void main(String[] args) throws IOException{
		List<String> input = Files.readAllLines(Paths.get("day4.in"));

		//		//PART ONE\\
		//		int total = 0;
		//		for(int x = 0; x < input.size(); x++){
		//			String line = input.get(x);
		//			ArrayList<String> words = new ArrayList<>(Arrays.asList(line.split(" ")));
		//			for(int word = 0; word < words.size(); word++){
		//				if (Collections.frequency(words, words.get(word)) > 1){
		//					total++;
		//					break;
		//				}
		//			}
		//		}
		//		System.out.println("Part 1: " + (input.size() - total));

		//PART TWO\\
		int total2 = 0;
		int public_word2= 0;
		int public_word = 0;

		for(int x = 0; x < input.size(); x++){
			String line = input.get(x);
			ArrayList<String> words = new ArrayList<>(Arrays.asList(line.split(" ")));

			char[] word_array = new char[words.size()];
			char[] next_word_array = new char[words.size()];

			for(int word = 0; word < words.size(); word++){
				word_array = words.get(word).toCharArray();
				Arrays.sort(word_array);

				for(int word2 = 0; word2 < words.size(); word2++){
					next_word_array = words.get(word2).toCharArray();
					Arrays.sort(next_word_array);

					System.out.println(Arrays.toString(word_array) + "compared to" + Arrays.toString(next_word_array));
					if(Arrays.equals(word_array, next_word_array)){
						total2 += 1;
						System.out.println("anagram present");
						break;
					}
				}
			}
		}
		System.out.println(total2);
		System.out.println(input.size());
		System.out.println("Part 2: " + (input.size() - total2));
	}
}
