package demoprogram;
import java.util.*;


public class practise {
	
	static long startTime=0;
	static long stopTime=0;
	static long elapseTime=0;
	 public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Element 1 to Start Stop Watch and 0 to Stop StopWatch");
		int startWatch=sc.nextInt();
		if(startWatch==1)
			toStartstopWatch();
		
		int stopWatch=sc.nextInt();
		if(stopWatch==0)
			toStopstopWatch();
		elapseTime=stopTime-startTime;
		System.out.println("Elapse Time :"+elapseTime/1000f+"sec");
		
	}  
	 public static void toStartstopWatch()
	 {
		 startTime=System.currentTimeMillis();
	 }
	 public static void toStopstopWatch()
	 {
		 stopTime=System.currentTimeMillis();
	 }
		  
}
