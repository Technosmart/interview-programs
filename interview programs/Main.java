public class Main
{
public String value="Face Value";
public  Main()
{
value="Main Value";
System.out.println(value);
}
{
System.out.println(value);
value="System Value";
System.out.println(value);
}
public static void main(String... as)
{
Main n=new Main();

}
}