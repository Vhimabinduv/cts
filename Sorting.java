import java.util.*;
public class Sorting
{
	public static void main(String args[])
		{	
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			int []ar=new int[n];
			int temp;
			
			for(int i=0; i<n; i++)
				{
					ar[i]=s.nextInt();
				}
			for(int i=0; i<n-1; i++)
				{
					for(int j=i+1; j<n; j++)
						{
							if(ar[i]>ar[j])
							{
								temp=ar[i];
								ar[i]=ar[j];
								ar[j]=temp;
							}
						}
				}
				
			for(int i:ar)
	                      System.out.println(i);
		}
}