
public class power_4 {
	public static void main(String[] args)
	{
		int i=0;
		int table=1;
		int power=Integer.parseInt(args[0]);
		
		if(power>=0 && power<32)
		{
				for(i=0;i<=power;i++)
				{
					System.out.println("2^"+i+" ="+table);
					table *=2;
					
				}
		}
		else
		{
			System.out.println("Power Must be between 0 and 32");
		}
	}
}
