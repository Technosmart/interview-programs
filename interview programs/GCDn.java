import java.util.*;
class GCDn
{
public static void main(String... as)
{
Scanner sc=new Scanner(System.in);
int a,b;
System.out.println("Enter two values:");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("The GCD of "+a+" & "+b+" is: "+gcd(a,b));
}
static int gcd(int a, int b)
{
if(a==0)
return b;
else if(b==0)
return a;
else
return gcd(b,a%b);
}
}