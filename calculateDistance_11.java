import java.lang.Math;
public class calculateDistance_11 {
	public static void main(String[] args)
	{
		float x=Float.parseFloat(args[0]);
		float y=Float.parseFloat(args[1]);
		
		calculateDistance(x,y);
	}
	public static void calculateDistance(float x1,float y1)
	{
		float distance=(float)Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
		System.out.println("Euclidean distance from the point ("+x1+","+ y1+") to the origin (0, 0) is "+distance);
	}
}
