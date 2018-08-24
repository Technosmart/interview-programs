import java.util.*;
class UserMainCode57
{
public static void main(String... as)
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
if(UserMainCode57.validateOver(str))
System.out.println("valid");
else
System.out.println("invalid");
}
public static boolean validateOver(String str)
{
char[] cc=str.toCharArray();
int len=cc.length;
int k=0;
	if(len==6) 
	{
		for(char c:cc)
		{
			if(c=='N')
			{
				k=1;
				break;
			}
		}
	}
	else
		k=1;
if(k==0)
return true;
else
return false;
}
}