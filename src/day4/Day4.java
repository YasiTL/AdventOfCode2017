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

				//PART ONE\\
				int total = 0;
				for(int x = 0; x < input.size(); x++){
					String line = input.get(x);
					ArrayList<String> words = new ArrayList<>(Arrays.asList(line.split(" ")));
					for(int word = 0; word < words.size(); word++){
						if (Collections.frequency(words, words.get(word)) > 1){
							total++;
							break;
						}
					}
				}
				System.out.println("Part 1: " + (input.size() - total));

		//PART TWO\\ Get ready for a really mangled solution :)
		int total2 = 0;

		for(int x = 0; x < input.size(); x++){
			String line = input.get(x);
			ArrayList<String> words = new ArrayList<>(Arrays.asList(line.split(" ")));

			char[] word_array = new char[words.size()];
			char[] next_word_array = new char[words.size()];
			
			OUTER_LOOP: //In charge of setting word_array equal to a sorted char array for each word
			for(int word = 0; word < words.size(); word++){
				word_array = words.get(word).toCharArray();
				Arrays.sort(word_array);
				
				//Sets next_word_array to a sorted char array so we can compare word_array to it
				for(int word2 = 0; word2 < words.size(); word2++){
					if(word2 == word){ //Make sure that we arent comparing the same thing
						continue;
					}
					next_word_array = words.get(word2).toCharArray();
					Arrays.sort(next_word_array);
					//System.out.println(Arrays.toString(word_array) + "compared to" + Arrays.toString(next_word_array));
					if(Arrays.equals(word_array, next_word_array)){
						total2 ++;
						break OUTER_LOOP; //Break out of the comparison loops and just go to the next line
					}
				}
			}
		}
		System.out.println("Part 2: " + (input.size() - total2));
	}
}
