import java.util.*;
class arrrightrot
{
public static void main(String... as)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter array length:");
int len=sc.nextInt();
int[] a=new int[len];
System.out.println("Enter array Elements:");
for(int i=0;i<len;i++)
a[i]=sc.nextInt();
System.out.println("Enter No of Shifts");
int shifts=sc.nextInt();
for(int j=0;j<shifts;j++)
{
for(int i=len-1;i>0;i--)
{
int temp=a[i];
a[i]=a[i-1];
a[i-1]=temp;
}
}
for(int i:a)
System.out.print(i+" ");
}
}