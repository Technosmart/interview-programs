class lab381{
public static void main(String [] as)
{
B bobj=new B();
bobj.m1();
}
}
class A{
void m1()
{}
}
class B extends A{
final void m1()
{}
}
