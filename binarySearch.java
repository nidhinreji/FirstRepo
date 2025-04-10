import java.util.*;
class binarySearch 
{
	static Scanner sc=new Scanner(System.in);
	public static String bsearch(int[] a,int key)
	{
		int i=0,j=a.length-1,m=(i+j)/2;
		while (i<=j)
		{
			if (key==a[m])
			{
				return "number is present";
			}
			else if (key<a[m])
			{
				j=m-1;
			}
			else if (key>a[m])
			{
				i=m+1;
			}
		}
		return "number is not present";
	}
	public static int[] sorting(int[] a)
	{
		for (int i=0;i<a.length;i++)
		{
			for (int j=i;j<a.length;j++)
			{
				if (a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
	public static void main(String[] args) 
	{
		System.out.print("ENTER THE SIZE OF THE ARRAY : ");
		int n=sc.nextInt();
		int[] array=new int[n];
		System.out.println();
		for (int i=0;i<array.length;i++)
		{
			System.out.print("ENTER THE "+(i+1)+" ELEMENT : ");
			array[i]=sc.nextInt();
		}
		System.out.println();
		System.out.print("ENTER THE SEARCHING ELEMENT : ");
		int y=sc.nextInt();
		System.out.println("ORGINAL ARRAY : "+Arrays.toString(array));
		System.out.println();
		int[] sorted=sorting(array);
		System.out.println("SORTED  ARRAY : "+Arrays.toString(sorted));
		System.out.println();
		String res=bsearch(sorted,y);
		System.out.println(res);
	}
}
