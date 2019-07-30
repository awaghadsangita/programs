package com.bridgelabz.algorithmprograms;
import java.util.*;
public class temperaturConversionMain extends Util{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Temperature in fahrenheit");
		float temp=sc.nextFloat();
		
		float celcius=Util.temperaturConversion(temp, 'c');
		System.out.println("Give Temperatur in fahrenheit is "+temp);
		System.out.println("Temperatur in Celecius is "+celcius);
		
		float fahrenheit=Util.temperaturConversion(celcius, 'f');
		System.out.println("\nTemperatur in Celecius is "+celcius);
		System.out.println("Temperatur in fahrenheit is "+fahrenheit);
		
	}
}
