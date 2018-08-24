class lab398
{
public static void main(String [] as)
{
A aobj=new B();
System.out.println(aobj.x);
}
}
class A
{
int x=10;
}
class B extends A
{
String x="JLC";
}