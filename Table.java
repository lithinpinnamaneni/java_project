import java.util.*;
class Table
{
	public static void main(String[] args)
	{ 	int i;
		System.out.println("enter the number");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		for (i=1;i<=15;i++)
		{
			System.out.println(i+ "*" +num + "=" +(i*num));
		}
	}
}