class printaz
{
public static void main(String... as)
{
char c=(char)0;
int n=(int)c;
	while(true)
	{
		if(c>=0&&c<=47)
		{
			System.out.print(c+" ");		
		}
		if(c==47)
			System.out.println();
		if(c>=48&&c<=57)
		{
				System.out.print(c+" ");		
		}
		if(c==57)
			System.out.println();
		if(c>=58&&c<=64)
		{
				System.out.print(c+" ");		
		}
		if(c==64)
			System.out.println();
		
		if(c>=65&&c<=90)
		{
			System.out.print(c+" ");
			
		}
		if(c==96)
			System.out.println();
		if(c>=97&&c<=122)
		{
			System.out.print(c+" ");		
		}
		if(c>122)
		{	
			break;
		}
		c++;

		
	}
}
}