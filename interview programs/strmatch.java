import java.util.*;
class strmatch
{
public static void main(String... as)
{
Scanner sc=new Scanner(System.in);
String str1=sc.nextLine();
String str2=sc.nextLine();
String[] ss1=str1.split(" ");
String[] ss2=str2.split(" ");
int len1=ss1.length;
int len2=ss2.length;
	for(int i=0;i<len1;i++)
	{
		for(int j=0;j<len2;j++)
		{
			if(ss1[i].equals(ss2[j]))
			{
			System.out.print(ss1[i]);				
			System.out.print(" ");
			}
		}
	

	}
}
}