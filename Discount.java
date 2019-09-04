import java.util.*;
class Discount
{
 	public static void main(String[] args)
	{
		int discount,price;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the cost of the item:");
		int cost=scanner.nextInt();
		if (cost>=10000 && cost<=15000)
		{
		       System.out.println("Discount is:"+(cost*0.1));
			System.out.println("price is:"+(cost*0.9));
		}
		else if (cost>=15000 && cost<=25000)
		{
		       System.out.println("Discount is:"+(cost*0.15));
			System.out.println("price is:"+(cost*0.85));
		}
		if (cost>=25000)
		{
		       System.out.println("Discount is:"+(cost*0.2));
			System.out.println("price is:"+(cost*0.8));
		}
	}

}