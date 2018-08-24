import java.util.*;
class Occ
{
	public static void main(String... as)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toLowerCase();
		char[] cc=str.toCharArray();
		for(int i=0;i<cc.length;i++)
		{ 
		int count=1;
			for(int j=i+1;j<cc.length;j++)
			{
				if(cc[i]!='\000' && cc[i]!=' ')
				{
					if(cc[i]==cc[j])
					{
						count++;
						cc[j]='\000';
					}
				}	
			
			}
			if(cc[i]!='\000' && cc[i]!=' ')
			System.out.print(cc[i] +""+ count);	
		}
	}
}