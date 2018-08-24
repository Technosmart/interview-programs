import java.util.*;
class spaceremoval
{
	public static void main(String... as)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] cc=str.toCharArray();
		String ss="";
		for(char c:cc)
		{
			if(c!=' ')
				ss=ss+c;	
		}
	System.out.print(ss);
	}
}