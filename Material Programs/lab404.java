//Abstract Classes and Abstract Methods
abstract class shape
{
abstract void area();
}
class square extends shape{
void area()
{
System.out.println("Square->area()");
}
}
class lab404
{
public static void main(String [] as)
{
shape sp=new square();
sp.area();
}
}