import java.util.*;
public class EPAM
{
String name;
int id;
long phno;
public EPAM(String name, int id, long phno)
{
this.name=name;
this.id=id;
this.phno=phno;
}
}

public class epam1
{
public static void main(String... as)
{
ArrayList<EPAM> al=new ArrayList<EPAM>();
al.add("Phani",101,8008309);
}
}