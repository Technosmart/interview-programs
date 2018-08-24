class Lab372
{
public static void main(String [] as)
{
A aobj=new A(98);
System.out.println(aobj.getX());
aobj.setX(123);
}
}
class A
{
private int x;
A(int x)
{
this.x=x;
public void setX(int x)
{
this.x=x;
}
public int getX(int x)
{
return this.x
}
}