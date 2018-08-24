import java.util.*;
class Ocw
{
	public static void main(String... as)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		//str=str.toLowerCase();
		String[] strarr=str.split(" ");
		for(int i=0;i<strarr.length;i++)
		{ 
		int count=1;
			for(int j=i+1;j<strarr.length;j++)
			{
				if(strarr[i]!="0")
				{
					if(strarr[i].equals(strarr[j]))
					{
						count++;
						strarr[j]="0";
					}
				}	
			
			}
			if(strarr[i]!="0"  )
			System.out.println(strarr[i] +"-->"+ count);	
		}
	}
}