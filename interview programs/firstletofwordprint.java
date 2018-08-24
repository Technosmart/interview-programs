import java.util.*;
class firstletofwordprint
{
public static void main(String... as)
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String[] ss=str.split(" ");
for(String s:ss)
{
System.out.print(s.charAt(0)+" ");
}
}
}