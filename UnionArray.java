//wap to define the method of union of two sets
import java.util.Scanner;
class UnionArray
{
	public static void main(String arg[])
	{	
		Scanner sc=new Scanner(System.in);
		int a[]={23,45,32,56,67};
		int b[]={22,32,23,79};
		System.out.println("modified Array:");
		int c[]=union(a,b);
		for(int i=0;i<c.length;i++)
		{
		System.out.println(c[i]+" ");
		}

	}
	static int[] union(int a[],int b[])
	{
	int c[]=new int[a.length+b.length];
	for(int i=0;i<a.length;i++)
	{
		c[i]=a[i];
	}
	int k=a.length;
	for(int i=0;i<b.length;i++)
	{
		boolean rs=true;
		for(int j=0;j<a.length;j++)
		{
			if(b[i]==a[j])
			{
				rs=false;
				break;
			}
		}
		if(rs)
			c[k++]=b[i];
	}
		int s[]=new int[k];
		for(int t=0;t<k;t++)
		{
			s[t]=c[t];
		}
		return s;

	}
}