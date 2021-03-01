package TestPK;
import java.util.*;
public class Aman
{
	public static void Repeating(int a[],int n)
	{
		int count;
		System.out.println("Repeating number in array:");
		for(int i=0;i<n;i++)
		{
			count=0;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j] && i!=j)
					System.out.print(a[i]+" ");
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[50];
		System.out.println("Enter size:");
		int size=sc.nextInt();
		System.out.println("Enter element:");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		Repeating(a,size);
	}
}

