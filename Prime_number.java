import java.util.*;
class Prime_number
{
	public static void main(String[] args)
	{	int i,count=0;
		System.out.println("Enter the number;");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		if (num==0 || num==1)
			System.out.println("the number is not prime number");
		else 
		{
			for(i=2;i<=num;i++)
			{
				if(num%i==0)
					count++;
			}
 			
		}
	    System.out.println("count:"+count);
		if (count>=2)
		{
		System.out.println("the number is not a prime number");
		}
		else if(count==1)
		{
		System.out.println("the number is prime number");
		}
	
	}

}
