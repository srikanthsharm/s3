package serachinsertdeleteprograms;
import java.util.Scanner;
public class deleteelement {
	
	static int findElement(int a[],int n,int key)
	{
		int i;
		for(i=0;i<n;i++)
			if(a[i] == key)
				
			return i;
		return -1;
		
	}
	static int deleteElement(int a[],int n,int key)
	{
		int pos=findElement(a,n,key);
		if(pos==-1)
			System.out.println("element not found");
		for(int i=pos;i<n-1;i++)
			a[i]=a[i+1];
		return n-1;
	}
   public static void main(String [] args)
   {
	 /*  Scanner sc=new Scanner(System.in);
	   System.out.println("enter size of an array");
	   int size=sc.nextInt();
	   int [] a= new int[size];
	   
	   int n=a.length;
	   System.out.println("enter integers");
	   int j;
	  
	   for(j=0;j<size;j++);
	   {
		
		a[j]=sc.nextInt();
				   
	   }
	   
	   System.out.println("enter an element to delete which it should be you entered");
	   int key = sc.nextInt();
	   findElement(a,n,key);
	   System.out.println("before deleting");
	   for(int i=0;i<n;i++)
	   {
		   System.out.println(a[i]+" ");
	   }
	   System.out.println("after deleting element");
	   n=deleteElement(a,n,key);
	   for(int i=0;i<n;i++)
	   {
		   System.out.println(a[i]+" ");
	   }*/
	   int [] a= {1,22,47,57,41,};
	   int n=a.length;
	   int key=57;
	   System.out.println("before deleeting");
	   for(int i=0;i<n;i++)
	   {
		   System.out.println(a[i]+" ");
	   }
	   System.out.println("after deleting the element");
	   n=deleteElement(a,n,key);
	   for(int i=0;i<n;i++)
	   {
		   System.out.println(a[i]+" ");
	   
	   }
   }
		   
    		 
}
