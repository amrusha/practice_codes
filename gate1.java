import java.util.Scanner;
class gate1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number");
		int p=sc.nextInt();
		int q=sc.nextInt();
		System.out.println(" ");
		System.out.println(gate(p,q));
	}
		public static int gate(int p,int q)
	{
		int r1=0;
		int r2=0;
		string k=""
		while(p!=0&&q!=0)
		{
			r1=p%10;
			r2=q%10;
			if(r1==r2)
			{
			k="0"+k;
			}
			else
			{
			k="1"+k;
			}
			p=p/10;
			q=q/10;
			
		}
		System.out.println("XOR form of p and q is"+k);
		return 0;
}
}
