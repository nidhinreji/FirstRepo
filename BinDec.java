import java.util.*;
class BinDec 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("ENTER THE BINARY NUMBER : ");
		int binary=sc.nextInt();
		int rem=0;
		int sum=0;
		int x=1;
		while (binary>0)
		{
			rem=binary%10;
			sum=sum+rem*x;
			x=x*2;
			binary/=10;
		}
		System.out.println("DECIMAL NUMBER : "+sum);
	}
}
