public class wipro2
{ 
	public static void main(String... as)
	{
		int j, k = 0, n=4;
		for(int i = 1; i <= n; i++) 
		{
			// if row number is odd
			if(i % 2 != 0) 
			{
				// sign in increasing order
				for(j = k + 1; j < k + i; j++)
				System.out.print(j + " ");
				System.out.println(j++);
				k=j;
			}
			// if row number is even
			else
			{
				k = k + i - 1;
				// decreasing order
				for(j = k; j > k - i + 1; j--)
				System.out.print(j + " ");
				System.out.println(j);
			}
		}
	}
}