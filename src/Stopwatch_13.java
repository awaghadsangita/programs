import java.util.Scanner;
public class Stopwatch_13 {
	static long startTime=0;
	long duration=0;
	static long stopTime=0;
	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Press 1 to Start Stop Watch and Press 0 to Stop Stop Watch :");
		 int start=sc.nextInt();
		 if(start==1)
			 StartWatch();
		 
		 int stop=sc.nextInt();
		 if(stop==0)
			 StopWatch();
		 getElapseTime();
	}
	
	public static void StartWatch()
	{
		startTime=System.currentTimeMillis();
		
	}
	public static void StopWatch()
	{
		stopTime=System.currentTimeMillis();
	}
	public static void getElapseTime()
	{
		long elapseTime=stopTime-startTime;
		System.out.println("Elapsed Time is:"+elapseTime/1000f+" seconds");
	}
}
