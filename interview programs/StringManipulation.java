import java.util.*;
public class StringManipulation
{
public static String op1;
public void returnlastchar(String input1, int n)
{
char[] cc=input1.toCharArray();
String str1="";
int sub=cc.length-n;
for(int i=sub;i<=cc.length-1;i++)
{
str1=str1+cc[i];
}
for(int i=0;i<n;i++)
System.out.print(str1);
}
public static void main(String... as)
{
Scanner sc=new Scanner(System.in);
String input1=sc.next();
int n=sc.nextInt();
StringManipulation s1=new StringManipulation();
s1.returnlastchar(input1, n);
}
}