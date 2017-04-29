import java.io.*;
import java.util.Scanner;
class exp
{
	public static void main(String args[])
	{
	System.out.println("ENTER THE ARITHMETIC EXPRESSION:");
	Scanner sc =new Scanner(System.in);
	String s=sc.nextLine();
	System.out.println(analyse(s));
	}
	public static int analyse(String s)
	{
	char s1='y';
	int n=s.length();
	int i;
	for(i=0;i<n;i++)
	{
	s1=s.charAt(i);
	if((s1>='a' && s1<='z') || (s1>='A' && s1<='Z'))
	{
	System.out.println("OPERAND " + s1);
	}
	else if(s1=='*')
	{
	System.out.println("multiplication operator "+ s1);
	}
	else if(s1=='/')
	{
	System.out.println("division operator " + s1);
	}
	else if(s1=='+')
	{
	System.out.println("addition operator " + s1);
	}
	else if(s1=='=')
	{
	System.out.println("assignment operator " + s1);
	}
	else if(s1=='-')
	{
	System.out.println("substraction operator " + s1);
	}
	else
	{
	System.out.println("constant " + s1);
	}
	}
	return 0;
	}
}
