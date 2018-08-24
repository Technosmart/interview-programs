interface inter1{
void m1();
int a=10;
}
interface inter2{
void m2();
int b=11;
}
class Hello implements inter1,inter2
{
public void m1()
{
System.out.println("Hello->m1()");
}
public void m2(){
System.out.println("Hello->m2()");
}
}
class lab416{
public static void main(String args[])
{
Hello h=new Hello();
System.out.println(h.a);
System.out.println(h.b);
h.m1();
h.m2();
}
}