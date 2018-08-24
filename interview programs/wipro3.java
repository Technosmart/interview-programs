class wipro3
{
public static void main(String... as)
{
int i,j=0,k=1,n=5;
	for(i=1;i<=5;i++)
	{
		if(i==2||i==3)
		{
			k=5+j;
			n=n+10;
		}
		else if(i==4)
		{
			k=j-10;
			n=n-5;
		}
		else if(i==5)
		{
			k=j-15;
			n=n-10;
		}
		for(j=k;j<=n;j++)
		{
			if(j==n)
				System.out.print(j);
			else
				System.out.print(j+"*");
		}
	System.out.println();
	}
}
}