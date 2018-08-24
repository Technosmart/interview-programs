import java.util.*;
class Validation
{
public static void main(String... as)
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
System.out.print(!(Character.isDigit(str.charAt(0))));
}
}