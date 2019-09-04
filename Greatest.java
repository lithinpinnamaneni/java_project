import java.util.Scanner;
class Greatest
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter num1");
		int num1=scanner.nextInt();
		System.out.println("enter num2");
		int num2=scanner.nextInt();
		System.out.println("enter num3");
		int num3=scanner.nextInt();
		if (num1>num2)
		{
			if(num1>num3)
				System.out.println("num1 is greatest");
			else
				System.out.println("num3 is greatest");
		}
		if (num1<num2)
		{
			if(num2>num3)
				System.out.println("num2 is greatest");
			else
				System.out.println("num3 is greatest");
		}
	}
}