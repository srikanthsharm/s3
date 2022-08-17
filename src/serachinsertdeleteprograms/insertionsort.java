package serachinsertdeleteprograms;
import java.util.Scanner;
public class insertionsort {
	static void insertionSort(int[] a,int n)
	{
		int i=1;
		
		for(i=1;i<n;i++)
		{
			int temp=a[i];
			int j=i-1;
			while(j>=0&&a[j]>temp)
			{
				a[j+1]=a[j];
				j--;
			}
		
			a[j+1]=temp;
		}
		}
		public static void main(String[] args)	
		{
			
			int[] a= {1,4,3,5,2};
			
			int n=a.length;
			insertionSort(a,n);
			for(int i=0;i<n;i++)
			{
				System.out.print(a[i]+" ");
			}
			
		}
	

}
