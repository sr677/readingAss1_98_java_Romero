/**
 * 
 */

/**
 * @author Silvana
 *
 */
public class Fan {

	/**
	 * 
	 */
	public Fan() {		
		// TODO Auto-generated constructor stub
	

speed = slow;
on = false;
radius = 5;
color = "blue";

}
public static final int slow = 1;
public static final int medium = 2;
public static final int fast = 3;

private int speed;
private boolean on;
private double radius;
String color;
public int getSpeed() {
return speed;
}
public void setSpeed(int speed) {
this.speed = speed;
}
public boolean isOn() {
return on;
}
public void setOn(boolean on) {
this.on = on;
}
public double getRadius() {
return radius;
}
public void setRadius(double radius) {
this.radius = radius;
}
public String getColor() {
return color;
}
public void setColor(String color) {
this.color = color;
}
public String toString()
{
if (on == true)
{
	return "Fan Speed: " + getSpeed() + " color " + getColor() + ", radius " + getRadius() + "\n";
	
}
else
{
	return "Fan Color " + getColor() + " radius " + getRadius() + " fan is off";
}
// return; 

}


}
