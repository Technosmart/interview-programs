class pattern4
{
	public static void main(String... as)
	{
		int four=4;
		int count=1;
		int[][] a=new int[5][5];
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				
				if(i>0&&i<4)
				{
					if(j==4/2)
					{
						a[i][j]=count;
						count++;
					}
					else
						a[i][j]=four;
				}
				else
					a[i][j]=four;
				
			}
		
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
				System.out.print(a[i][j]+" ");
		System.out.println();
		}
	}
}