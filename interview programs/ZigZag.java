import java.util.*;
class ZigZag
{
public static void main(String... as)
{
Scanner sc=new Scanner(System.in);
String str1=sc.next();
char[] cc=str1.toCharArray();
char temp=cc[0];
cc[0]=cc[cc.length-1];
cc[cc.length-1]=temp;

System.out.println(String.valueOf(cc));
}
}