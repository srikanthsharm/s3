package serachinsertdeleteprograms;
/// serching key in array
public class search {
	
// we use traversal to search from first element to last element
	static int searchElement(int a[], int n,int key)
	{
		int i;
		for(i=0;i<n;i++)
			if(a[i]==key)
			return i;
		return -1;
	}
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,6,};
		int n= a.length;
		int key=5;
		int p=searchElement(a,n,key);
		if(p==-1)
		{
			System.out.println("element not found");
			
		}
		else
			System.out.println("position "+p);
	}
	
	}

