class wipro1
{
public static void main(String... as)
{
int i,j,k=1,l=2,h;	
int n=4;
int rest=n*(n+1)+1,rn=0;
	for(i=n;i>0;i--)
    	{
      		if(i<n)
        	{
          		for(h=1;h<=l;h++)
				System.out.print("-");
          		l=l+2;
        	}
      		for(j=1;j<=i;j++)
        	{
          		System.out.print(k);
          	k++;           
          	System.out.print("*");
        	}
		rest=rest-i;
      		rn=rest;
		for(int p=1;p<=i;p++)
        	{      
			System.out.print(rn);
          		rn++;
          		if(p!=i)
            			System.out.print("*");

	        }
	System.out.println();  
	}
}
}