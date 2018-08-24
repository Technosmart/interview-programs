import java.util.*;
class Camelformat
{
public static void main(String... as)
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String[] ss=str.split(" ");
char[] cc;
for(String s:ss)
{
	cc=s.toCharArray();
	for(int i=0;i<cc.length;i++)
	{
		if(cc[0]>=97&&cc[0]<=122)	
		cc[0]=(char)((cc[0])-32);
	System.out.print(cc[i]);		
	}
System.out.print(" ");
}
}
}