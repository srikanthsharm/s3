package serachinsertdeleteprograms;

public class insertelementinarray {
// inserting an element in array
	static int insertElement(int a[],int n,int key,int capacity)
	{
		// if leanght is greater or equal to capacity then return n else return n+1 if insertionn possible
		if(n>=capacity)
			return n;
			else
				a[n]=key;
		return n+1;
			
	}
	public static void main(String[] args) {
		int[] a=new int[10];
		a[0]=10;
		a[1]=11;
		a[2]=12;
		a[3]=13;
		a[4]=14;
		a[5]=15;
		int capacity=10;
		int n=8;
		int key=33;
		System.out.println("before insertion the element");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println("after insertion");
		n=insertElement(a,n,key,capacity);
		for(int i=0;i<n;i++)
		{
			System.out.print(" "+a[i]);
		}
		
	}
}
