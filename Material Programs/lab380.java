class lab380{
public static void main(String [] as)
{
B bobj=new B();
bobj.m1();
}
}
class A{
final void m1()
{}
}
class B extends A{
void m1()
{}
}
