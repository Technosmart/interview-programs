class lab379{
public static void main(String [] as)
{
Hai hai=new Hai();
hai.m1();
}
}
class Hello{
A m1()
{
return new A();
}
}
class Hai extends Hello
{
B m1()
{
return new B();
}
}
class A{}
class B extends A{
}
