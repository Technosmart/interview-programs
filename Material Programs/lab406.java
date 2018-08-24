//Abstract Classes and Abstract Methods
abstract class person
{
abstract void sleeping();
abstract void walking();
}
class student extends person{
void sleeping()
{
System.out.println("student->sleeping()");
}
void walking()
{
System.out.println("CurrentStudent->walking()");
}

}
class currentstudent extends student{
}
class lab406
{
public static void main(String [] as)
{
person pob=new currentstudent();
pob.sleeping();

}
}