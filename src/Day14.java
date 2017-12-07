import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Day14 {
	public static void main(String[] args) throws FileNotFoundException {
		
		
		Scanner file = new Scanner(new File("day14.in"));
		System.out.println(file.toString());
		ArrayList<Reindeer> reindeers = new ArrayList<>();
		
		HashMap hm = new HashMap();
		while(file.hasNextLine()){
			String line = file.nextLine();
			System.out.println(line);
			String[] info = line.split(" ");
			reindeers.add(new Reindeer(info[0],
											Integer.parseInt(info[3]),
											Integer.parseInt(info[6]),
											Integer.parseInt(info[13])
											));
		}
		
		
//		for(int i = 0; i < 2503; i++){
//			for(Reindeer reindeer : reindeers){
//				if 
//				reindeer.setDistance();
//			
//			}
		//Reindeer r1 = new Reindeer("Rudolph", 22, 8, 165, 8);
		//Collections.sort(reindeers);
		
		System.out.print(reindeers);
	}
}
