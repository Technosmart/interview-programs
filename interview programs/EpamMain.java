import java.util.*;
public class EpamMain
{

String name;
int id;
long phno;
EPAM(String name, int id, long phno)
{
this.name=name;
this.id=id;
this.phno=phno;
}


public static void main(String... as)
{
ArrayList<EPAM> al=new ArrayList<EPAM>();
al.add("Phani",101,8008309);
}
}