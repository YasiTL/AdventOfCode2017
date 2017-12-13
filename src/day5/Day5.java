package day5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Day5 {
	public static void main(String[] args) throws IOException {
		List<String> input = Files.readAllLines(Paths.get("day5.in"));
		//ArrayList<Integer> input_list = new ArrayList<>();
		int[] int_array = new int[input.size()];
		
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

		int position = 0;
		int steps = 0;
		int steps2 = 0;
		int value, new_value;
		
		for(int x = 0; x < input.size(); x++){
			int_array[x] = Integer.valueOf(input.get(x));
			//hmap.put(x, Integer.valueOf(input.get(x)));
			//input_list.add(Integer.valueOf(input.get(x)));
		}
		
//		//PART ONE\\
//		while(position < input.size()){
//			int nextPosition = int_array[position] + position;
//			int_array[position]++;
//			position = nextPosition;
//			steps++;
//			
//		}
//		System.out.println("Part 1:" + steps);
		
		//PART TWO\\
		while(position < input.size()){
			int nextPosition = int_array[position] + position;
			if (int_array[position] >= 3){
				int_array[position]--;
			}else{
				int_array[position]++;
			}
			position = nextPosition;
			steps2++;
		}
		System.out.println("Part 2:" + steps2);
		
		
	}

}
