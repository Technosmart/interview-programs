import java.util.*;
public class matmul
{
public static void main(String... as)
{
Scanner sc=new Scanner(System.in);
int rows=sc.nextInt();
int cols=sc.nextInt();
int[][] a=new int[rows][cols];
int[][] b=new int[cols][rows];
int[][] c=new int[rows][rows];
for(int i=0;i<rows;i++)
for(int j=0;j<cols;j++)
a[i][j]=sc.nextInt();

for(int i=0;i<cols;i++)
for(int j=0;j<rows;j++)
b[i][j]=a[j][i];

for(int i=0;i<cols;i++){
for(int j=0;j<rows;j++)
System.out.print(b[i][j]+" ");
System.out.println();
}

for(int i=0;i<rows;i++)
for(int j=0;j<cols;j++)
for(int k=0;k<cols;k++)
 c[i][j] = c[i][j] + a[i][k] * b[k][j];
for(int i=0;i<cols;i++){
for(int j=0;j<rows;j++)
System.out.print(c[i][j]+" ");
System.out.println();
}
}
}
