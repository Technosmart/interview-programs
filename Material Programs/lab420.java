class Hello implements inter1,inter2{
}
class lab420{
public static void main(String [] args)
{
Hello h=new Hello();
inter1 ref1=h;
ref1.m1();
ref1.m2();
inter2 ref2=h;
ref2.m2();
ref2.m3();
}
}