import java.util.*;
class vowelremoval
{
public static void main(String... as)
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char[] cc=str.toCharArray();
for(char c:cc)
{
	if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
	{}	
	else
		System.out.print(c);
}
}
}