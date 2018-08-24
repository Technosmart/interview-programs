class Diamond
{
	public static void main(String[] args) 
	{
	int i,j,k,n=4;
	for(i=0; i<=n; i++)
	{
		for(j=n-1; j>=i; j--)
		{
			System.out.print(" ");
		}
		for(k=0; k<=i; k++)
		{
			System.out.print(" *");
		}
			System.out.println(" ");
	}
		for(i=n;i>=1;i--)
		{
			for(j=n;j>=i;j--)
			{
			System.out.print(" ");
			}
			for(k=0;k<i;k++)
			{
			System.out.print(" *");
			}
			System.out.println(" ");
		}

	}
}