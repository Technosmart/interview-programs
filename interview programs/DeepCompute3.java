import java.util.*;
class DeepCompute3
{
public static void main(String... as)
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char[] cc=str.toCharArray();
for(char c:cc)
{
if(c==' '){
System.out.print(" ");
}
else
{
int a=(int)c;
a+=1;
char b=(char)a;
System.out.print(b);
}
}

}
}