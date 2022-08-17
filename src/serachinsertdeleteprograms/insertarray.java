package serachinsertdeleteprograms;

public class insertarray {

	static int insertElement(int[] a,int n,int key,int capacity)
	{
		if(n>=capacity)
		return n;
		else
			a[n]=key;
		return n+1;
	}
	public static void main(String[] args) {
		int[] a=new int[15];
		a[0]=101;
		a[1]=102;
		a[2]=103;
		a[3]=104;
		a[4]=105;
		int n=2;
		int key=22;
		int capacity=5;
		int i;
		System.out.println("before");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("after");
	n=	insertElement(a,n,key,capacity);
for(int k=0;k<n;k++)
{
	System.out.println(a[k]+" ");
}
	}

			
}
