abstract class Hello{
static int A=1234;
static void show()
{
System.out.println("Hello->show()");
}
}
class lab407
{
public static void main(String [] as)
{
System.out.println(Hello.A);
Hello.show();
}
}