import java.util.ArrayList;
import java.util.List;

public class Day3 {
	public static void main (String[] args){
		//		Point p = new Point(5,-7);
		//		System.out.println(p.getManhattanDistance());

		//These are constants-- they say final and are stylistically caps 
		final int RIGHT = 0;
		final int UP = 1;
		final int LEFT = 2;
		final int DOWN = 3;

		int direction = RIGHT; //We start off going right
		int steps = 1; //We start off at 1
		int target = 5; 

		List<Point> points = new ArrayList<>();
		points.add(new Point(0,0));
		while(points.size() < target){
			for(int i = 0; i < 2; i++){ //i < 2 because we want to move in steps of 2
				for(int j = 0; j < steps; j++){
					Point lastPoint = points.get(points.size()-1); //local variable holds last point
					int dx, dy; //holds the direction we are going to move.
					if(direction == RIGHT){
						dx = 1;
						dy = 0;
					}else if(direction == UP){
						dx = 0;
						dy = 1;
					}else if(direction == LEFT){
						dx = -1;
						dy = 0;

					}else{
						dx = 0;
						dy = -1;
					}
					points.add(new Point(lastPoint.getX() + dx, lastPoint.getY() + dy)); 
					//Add a new point from adding the last point's x and y values to direction of x and y
				}
				direction = (direction + 1) % 4;
			}
			steps++;
		}
		
		System.out.println(points);
		System.out.println("(" + points.get(target - 1) + ")" + " " + points.get(target-1).getManhattanDistance());

	}

}
