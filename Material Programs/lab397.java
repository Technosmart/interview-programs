class lab397
{
public static void main(String [] as)
{
Person pob=null;
pob=new Student();
Student stu=(Student)pob;
stu.reading();
pob=new Employee();
Employee emp=(Employee)pob;
emp.working();
}
}