//Interface Concept
interface inter1
{
void m1();
public abstract void m2();
int a=10;
public final int b=20;
}
abstract class Hello implements inter1
{
public void m1()
{
System.out.println("Hello->m1():"+a);
}
}
class Hai extends Hello{
public void m2()
{
System.out.println("Hello->m2():"+b);
}
void m3()
{
System.out.println("Hai->m3()");
}
}
class lab415
{
public static void main(String args[])
{
inter1 ref=null;
//ref=new inter1();
ref=new Hai();
ref.m1();
ref.m2();
}
}