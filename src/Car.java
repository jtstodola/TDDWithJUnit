/**
 * Implementation of a Car object for a game or simulation.
 * Includes acceleration and deceleration.
 * @author Brian Hogan
 * @author yourname
 */
public class Car {

	private String color;
	private int speed;
	private int maxSpeed;
	
	/**
	 * Creates a new car instance
	 * @param color
	 * @param maxSpeed
	 */
	public Car(String color, int maxSpeed){
		// using this. prefix to avoid shadowing local params.
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = 0;
	}
	
	/**
	 * Return the current speed of the car.
	 * @return the current speed of the car.
	 */
	public int getSpeed(){
		return(speed);
	};
	
	/**
	 * Accelerates the car up to the maximum amount
	 * set in the object constructor.
	 * @param amount	The amount the car will accelerate
	 */
	public void accelerate(int amount){
		int limit = maxSpeed - speed;
		speed = (amount >= limit) ? limit : (speed += amount);
	}
	
	/**
	 * Decelerates the car by specified amount, no less than 0
	 * set in the object constructor.
	 * @param amount	The amount the car will decelerate
	 */
	public void decelerate(int amount) {
		speed = (speed <= amount) ? 0 : (speed -= amount);
	}
	
	/**
	 * Displays the object as a string in the format
	 * "Color: red, Speed: 100"
	 * @return string representation of object. 
	 */
	public String toString(){
		Car car = new Car("Red", 100);
		return("Color: " + car.color + ", Speed: " + car.speed);
	}
}