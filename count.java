import java.util.Scanner;
class count
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number");
		int n=sc.nextInt();
		System.out.prinln(" ");
		System.out.prinln(calc(n));
	}
	public static int calc(int n)
	{
		int r=0;
		int k=0;
		int l=0;
		int num=n;
		while(num!=0)
		{
			r=num%10;
			if(r==0)
			{
			k++;
			}

			if(r==1)
			{
			l++;
			}
			num=num/10;
		}
		System.out.println("no. of zeros are"+k);
		System.out.println("no. of zeros are"+l);
}
}
