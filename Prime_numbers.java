import java.util.*;
class Prime_numbers
{
	public static void main(String[] args)
	{	
		int i,j,count=0;
		for (j=2;j<=100;j++)
		   {
			for(i=2;i<=j;i++)
			{
				if(j%i==0)
				{
				  count++;
				}
			}
		         if(count==1)
		         {
		         	System.out.println(j);
		         }
		
		    }
			
 			
		}
	
	

}
