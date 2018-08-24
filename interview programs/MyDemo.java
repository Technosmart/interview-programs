import java.util.*;
class MyException extends Exception{
public MyException(String s)
{
System.out.println(s);
}
}
class MyDemo 
{
public static void main(String... as) throws MyException
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Age:");
int n=sc.nextInt();

if(n<18)
{
throw new MyException("User is Under Age....");
}


}
}