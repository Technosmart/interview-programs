class lab374
{
public static void main(String [] as)
{
B bobj=new B();
bobj.show();
bobj.SHOW();
}
}
class A
{
void show()
{
System.out.println("A->show()");
}
}
class B extends A
{
void SHOW()
{
System.out.println("B->SHOW()");
}
}