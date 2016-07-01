package Chapter3DataTypes;

public class Light {

	public static void main(String[] args) {

     int lightspeed;
     long days;
     long seconds;
     long distance;
     
     lightspeed = 186000;// according to light speed
     
     days = 1000;// travel these days
     
     seconds = days * 24 * 60 * 60;
    distance  = lightspeed * seconds;
     
     System.out.println("In " + days);
     System.out.println(" days Light wil travel about ");
     System.out.println(distance + " miles.");
     
     
	}
}
     
     