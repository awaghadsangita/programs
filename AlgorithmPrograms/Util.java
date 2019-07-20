package AlgorithmPrograms;

public class Util {

	/*Program for Anagram Detection*
	 * @param str denote firststring
	 * #param str1 denote secondstring*/
	
	public static boolean CheckAnagram(String str,String str1)
	{
		int i=0;
		int[] firstCount=new int[256];
		int[] secondCount=new int[256];
		
		char[] charArr1=str.toCharArray();
		char[] charArr2=str1.toCharArray();
		if(str.length()!=str1.length())
			return false;
		else
		{
			for(i=0;i<str.length();i++)
			{
				firstCount[charArr1[i]]++;
				secondCount[charArr2[i]]++;
			}
			
			for(i=0;i<256;i++)
			{
				if(firstCount[i]!=secondCount[i])
				{
					return false;
				}	
			}
			return true;
		}
	}
	/*Program to find prime numbers between 0 to 1000;
	 * @param start denote 0
	 * @param stop denote 1000*/
	public static int[] findPrime(int start,int stop)
	{
		int i,count=0;
		boolean isPrime=false;
		int[] prime=new int[500];
		for(i=start;i<=stop;i++)
		{
			isPrime=true;
			for(int j=2;j<=(i/2);j++)
			{
				if(i%j==0)
				{
				 isPrime=false;
				 break;
				}
			}
			if(isPrime)
			{
//				System.out.print(i+ ", ");
				prime[count]=i;
				count++;
			}
		}
		return prime;
	}
	/*program to find Anagram in 0 to 1000 range
	 * @param primeArr takes Prime number array in 0-1000 range*/
	public static int[] isAnangram(int[] primeArr)
	{
		
		int[] firstcount=new int[10];
		int[] secondcount=new int[10];
		int anagramCount=0;
		boolean isAnagram1=true;
		int digit;
		int anagramArr[]=new int[200];
		int count=0;

		System.out.println("\nAnanagram numbers are :");

		int i,j,k;
		for(i=0;i<primeArr.length-1;i++)
		{

			for(j=i+1;j<primeArr.length;j++)
			{
				if(primeArr[i]!=0&&primeArr[j]!=0)
				{
					int firstnum=primeArr[i];
					int secondnum=primeArr[j];
					int firstDigitCount=0,secondDigitCount=0;
					isAnagram1=true;
					for(k=0;k<10;k++)
					{
						firstcount[k]=0;
						secondcount[k]=0;
					}
					while(firstnum>0)
					{
						int digit1=firstnum%10;
						firstcount[digit1]=firstcount[digit1]+1;
						firstDigitCount++;
						firstnum/=10;
					}

					while(secondnum>0)
					{
						int digit2=secondnum%10;
						int index=digit2;
						secondcount[index]++;
						secondDigitCount++;
						secondnum/=10;
					}

					if(firstDigitCount==secondDigitCount)
					{
						for(int l=0;l<10;l++)
						{
							if(firstcount[l]!=secondcount[l])
							{
								isAnagram1=false;
								break;
							}	
						}
						if(isAnagram1)
						{
							System.out.println(primeArr[i]+" and "+primeArr[j]+" Are Ananagram");
							anagramArr[count]=primeArr[i];
							anagramArr[++count]=primeArr[j];
							count++;
							anagramCount++;
						}
					}
				}
			}
		}
		System.out.println("Total Ananagram numbers are :"+anagramCount);
		return anagramArr;
//		isPalindrome(anagramArr);
	}
	/*progrme to find Palindrome numbers that are anagram 
	 * @param anagramArr denote anagram array*/
    public static int[] isPalindrome(int[] anagramArr)
    {
    	int count=0;
    	int anagram[]=new int[500];
    	System.out.println("\nPalindrome numbers are as follow: ");
    	for(int i=0;i<anagramArr.length;i++)
    	{
    		if(anagramArr[i]>0)
    		{
    			//logic start
    			int digit,rnum=0,num;
    			num=anagramArr[i];
    			while(num>0)
    			{
    				digit=num%10;
    				rnum=digit+rnum*10;
    				num/=10;
    			}
    			if(anagramArr[i]==rnum)
    			{
    				System.out.println(rnum+" is Palindrome number");
    				anagram[count]=i;
    				count++;
    			}
    			//logic end
    		}
    	}
    	//System.out.println("Total Numbers of Prime number that are anagrame and palindrom: "+count++);
    	return anagram;
    }
	
	/* Function that return Day of Week
	 @param m denote Month;
	 @param d denote Day;
	 @param y denote Year; 
	 */
	public static int dayOfWeek(int m,int d,int y)
	{
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		return d0;
	}
	/* Program convert temperature from fahrenheit to Celcius and viceversa.
	 * @param temp take Temperature value 
	 * @param denote either fahenheit(f) or celcius(c) 
	 */
	public static float temperaturConversion(float temp,float method)
	{
		float convertedTemp=0;
		if(method=='f'||method=='F')
		{
			convertedTemp =(temp * 9/5) + 32;
		}
		else if(method=='c'||method=='C')
		{
			convertedTemp=(temp - 32) * 5/9;
		}
		return convertedTemp;
	}
	/* Program to calculate monthly Payment
	 * @param P denotes Principal Amount
	 * @param Y denotes Number of Years
	 * @param R denotes Rate of interest
	 */
	public static double monthlyPayment(double P,double Y,double R)
	{
		double  n = 12 * Y;
		double r = R / ( 12 * 100 );
		double payment = (P * r)/ (1-Math.pow((1 + r),-n));
		return payment;
	}
	/*Program to Calculate Square Root
	 *initialize t = c
	 *replace t with the average of c/t and t
     *repeat until desired accuracy reached using 
     *condition Math.abs(t - c/t) > epsilon*t
	 *where epsilon = 1e-15 ;
     */
	public static double sqrt(double c)
	{
		double t=c;
		double epsilon = 1e-15;
		while(Math.abs(t - c/t) > epsilon*t)
		{
			t=((c/t)+t)/2;
		}
		return t;
	}
	/**/
	public static String toBinary(int num)
	{
		String binary="";
		while(num>0)
		{
			binary=(num%2)+binary;
			num=num/2;
		}
		return binary;
	}
	/**/
	public static double toDecimal(char[] binary)
	{
		double decimal=0;
		int j=0;
		for(int i=binary.length-1;i>=0;i--)
		{
			if(binary[i]=='1')
				decimal=decimal+Math.pow(2, j);
			
			j++;
			
		}
		return decimal;
	}
}
