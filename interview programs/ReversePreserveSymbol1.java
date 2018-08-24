import java.util.*;
class ReversePreserveSymbol1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] str1=str.split(" ");
		for(String tempstr:str1)
		{
			char[] cc=tempstr.toCharArray();
			char[] ncc=new char[cc.length];
			for(int i=0;i<cc.length;i++)
			{
				if(!((cc[i]>=65 && cc[i]<=90)||(cc[i]>=97 && cc[i]<=122)||(cc[i]>=48 && cc[i]<=57)))
				{
					ncc[i]=cc[i];
				}
				else
				{
					ncc[i]='\000';	
				}			
			}
			int i=0,j=cc.length-1;
			while(i<ncc.length && j>=0)
			{
				if((cc[j]>=65 && cc[j]<=90)||(cc[j]>=97 && cc[j]<=122)||(cc[j]>=48 && cc[j]<=57))
				{
					if(ncc[i]=='\000')
					{
						ncc[i]=cc[j];
						i++;j--;
					}
					else 
						i++;
				}	
				else
					j--;	
			 }
			for(char ccc:ncc)
		 	System.out.print(ccc);
		
			System.out.print(" ");
		}
	}
}