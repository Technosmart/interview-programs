import java.util.*;
class nextcharprint
{
public static void main(String... as)
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char[] cc=str.toCharArray();
char c1='\000';
int b;
for(char c:cc)
{
	if(c!=' ')
	{
		if(c=='z')
		b=(char)97;
		else if(c=='Z')
		b=(char)65;
		else{
		b=(int)c;
		b++;
		}
		System.out.print((char)b);
	}
	else
		System.out.print(c);
}
}
}