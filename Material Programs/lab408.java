abstract class Hello{
int a;
Hello(int a)
{
this.a=a;
System.out.println("Hello (int) Cons");
}
void show()
{
System.out.println("Hello->show()");
}
}
class Hai extends Hello
{
Hai(int a){
super(a);
}}
class lab408
{
public static void main(String [] as)
{
Hai hai=new Hai(10);
hai.show();
}
}