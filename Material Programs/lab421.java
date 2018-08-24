interface inter1{
void show();
}
class A{
public void show()
{
System.out.println("A->show()");
}
}
class B extends A implements inter1
{}
class lab421{
public static void main(String [] as)
{
B ref=new B();
b.show();
}
}