import java.util.*;
class MatrixLeftRotation
{
	public static void main(String as[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rows and col");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		int na[][]=new int[m][n];
		System.out.println("enter ele");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("After Left Rotation");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				na[i][j]=a[j][i];
			}
		}
		
		for (int i = 0; i < na.length/2; i++)
           	{
			for (int j = 0; j < na[0].length; j++) 
			{
                		int x = na[i][j];
                		na[i][j] = na[na.length -1 -i][j]; 
                		na[na.length -1 -i][j] = x;
            		}
		}
		for(int i=0;i<m;i++){
		for(int j=0;j<n;j++)
		System.out.print(na[i][j]+" ");
		System.out.println();
		}

	}
}