package com.jlc.p2;
import com.jlc.p1.Hello;
class Xyz extends Hello
{
}
class Hai extends Hello
{
void show()
{
System.out.println("Hai->show()");
Hello h=new Hello();
System.out.println(h.ab);
Xyz ref=new Xyz();
System.out.println(ref.ab);
}
}
class lab371
{
public static void main(String [] as)
{
Hai hai=new Hai();
hai.show();
}
}


