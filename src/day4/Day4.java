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
		//System.out.println(input.toString());

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
	}
}
