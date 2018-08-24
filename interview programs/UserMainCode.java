import java.util.*;
class UserMainCode
{
public static void main(String... as)
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
if(UserMainCode.validateCity(str))
System.out.println("valid");
else
System.out.println("invalid");
}

public static boolean validateCity(String str)
{
char[] cc=str.toUpperCase().toCharArray();
int c=0;
if((cc[0]>=65&&cc[0]<=90)&&(cc[1]>=65&&cc[1]<=90)&&(cc[cc.length-1]>=65&&cc[cc.length-1]<=90)&&(cc[cc.length-2]>=65&&cc[cc.length-2]<=90))
{
	for(int i=2;i<cc.length-2;i++)
	{
		if(cc[i]!='*')
		{ 
			c=1;
			break;
		}
	}
}
else
c=1;
	if(c==1)
		return false;
	else 
		return true;

}
}