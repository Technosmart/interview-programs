class lab375
{
public static void main(String [] as)
{
B bobj=new B();
bobj.show(99);
bobj.show("JLC");
}
}
class A
{
void show(int ab)
{
System.out.println("A->show (int)");
}
}
class B extends A
{
void show(String ab)
{
System.out.println("B->SHOW (String)");
}
}