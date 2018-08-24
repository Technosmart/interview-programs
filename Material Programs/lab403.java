//Abstract Classes and Abstract Methods
abstract class shape
{
abstract void area();
}
class square extends shape{}
class lab403
{
public static void main(String [] as)
{
shape sp=new square();
sp.area();
}
}