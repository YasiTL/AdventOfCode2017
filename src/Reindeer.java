
public class Reindeer implements Comparable<Reindeer>{
	
	private String name;
	private int speed, endurance, restTime, distance, travelTime;
	public Reindeer(String name, int speed, int endurance, int restTime) {
		this.name = name;
		this.speed = speed;
		this.endurance = endurance;
		this.restTime = restTime;
		//this.travelTime = travelTime;
		//setDistance(travelTime);
	}
	public void setDistance(int travelTime){
		while(travelTime > 0){
			int timeToTravel = Math.min(endurance, travelTime);
			distance += timeToTravel * speed;
			travelTime -= timeToTravel;
			travelTime -= restTime;
		}
	}
	@Override
	public String toString() {
		return name + ": " + distance; 
	}
	public int compareTo(Reindeer o){
		return o.distance - this.distance;
	}
	
}
