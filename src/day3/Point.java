package day3;
import java.util.ArrayList;
import java.util.List;

public class Point {
	
	private int x, y;
	
	public Point(int x, int y){ //This is a constructor because there is no return type and
								//it shares the same name as the class
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override //This is a compiler check to make sure you are actually overriding toString
	public String toString(){
		return String.format("%d,%d", x,y); //this says (put int here, put int here), here the two ints
		//return "(" + x + "," + y + ")";
	}
	
	public int getManhattanDistance(){
		return Math.abs(x) + Math.abs(y);
	}
	
	public List<Point> getNeighboors(){
		List<Point> neighboors = new ArrayList<>();
		neighboors.add(new Point(x + 1,y));
		neighboors.add(new Point(x - 1, y));
		neighboors.add(new Point (x, y + 1));
		neighboors.add(new Point (x, y - 1));
		neighboors.add(new Point (x + 1, y + 1));
		neighboors.add(new Point (x - 1, y - 1));
		neighboors.add(new Point (x + 1, y - 1));
		neighboors.add(new Point (x - 1, y + 1));
		
		return neighboors;
		
	}

}
