package AlgorithmPrograms;

public class PrimeNumber_2 extends Util {
	public static void main(String args[])
	{
		int[] prime=Util.findPrime(0,1000);
		int count=0;
		System.out.println("Prime Numbers are as follows\n ");
		for(int i=0;i<500;i++)
		{
			if(prime[i]>0)
			{
				System.out.print(prime[i]+" ");
				count++;
			}
		}
		System.out.println("\nTotal Prime Numbers : "+count);
		
	}
}
