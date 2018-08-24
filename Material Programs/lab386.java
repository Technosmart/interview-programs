class lab386{
public static void main(String [] as)
{
new B().m1();
}
}
class A{
protected void m1(){}
protected void m2(){}

}
class B extends A{
private void m1(){}
void m2(){}

}
