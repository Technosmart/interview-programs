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
}
class currentstudent extends student{
void walking()
{
System.out.println("CurrentStudent->walking()");
}
}
class lab405
{
public static void main(String [] as)
{
person pob=new currentstudent();
pob.sleeping();
pob.walking();
}
}