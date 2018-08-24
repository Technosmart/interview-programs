import java.util.*;
public class MatrixRightRotation
{
public static void main(String... as)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter M & N size:");
int m=sc.nextInt();
int n=sc.nextInt();
int a[][]=new int[m][n];
int na[][]=new int[m][n];
System.out.println("Enter Matrix");
for(int i=0;i<m;i++)
for(int j=0;j<n;j++)
a[i][j]=sc.nextInt();
		System.out.println("Right Rotation");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				na[i][j]=a[j][i];
			}
	
		}

		for (int j = 0; j < na.length/2; j++)
           	{
		for (int i = 0; i < na[0].length; i++) 
		{
                int x = na[i][j];
                na[i][j] = na[i][na.length -1 -j]; 
                na[i][na.length -1 -j] = x;
            }
		}
		for(int i=0;i<m;i++){
		for(int j=0;j<n;j++)
		System.out.print(na[i][j]+" ");
		System.out.println();
		}
		}
}