//Abstract Classes and Abstract Methods
class shape
{
void area(){}
}
class square extends shape{}
class lab399
{
public static void main(String [] as)
{
shape sp=new square();
sp.area();
}
}