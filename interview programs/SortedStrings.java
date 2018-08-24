import java.util.*;
class SortedStrings
{
public static String[] op1;
public static void main(String... as)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String[] input1=new String[n];
for(int i=0;i<n;i++)
input1[i]=sc.next();
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if((input1[i].compareTo(input1[j]))>0)
{
String temp=input1[i];
input1[i]=input1[j];
input1[j]=temp;
}
}
}
HashSet<String> al=new HashSet<String>(Arrays.asList(input1));

for(String s:al)
System.out.print(s.toUpperCase()+" ");


}
}