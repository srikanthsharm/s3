package serachinsertdeleteprograms;

public class travers2d {
	
	static void travers(int[][] a,int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[j][i]+",");
						
			}
		}
	}

public static void main(String[] args) {
  int [][] a= {{1,4,6,8},{2,4,6,7},{7,8,9,10}};
	int n=a.length;
	travers(a,n);
}
}
