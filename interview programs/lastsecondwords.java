import java.util.*;
class lastsecondwords
{
public static void main(String... as)
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String[] ss=str.split(" ");
int len=ss.length-2;
System.out.println(ss[len]);
}
}