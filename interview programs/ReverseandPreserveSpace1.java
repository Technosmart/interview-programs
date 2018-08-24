import java.util.*;
class ReverseandPreserveSpace1 
{  
	public static void main(String[] args) 
	{    
   		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String..............");
		String str=sc.nextLine();
        	char[] cc = str.toCharArray();  
        	char[] ncc = new char[cc.length];  
		for (int i = 0; i < cc.length; i++) 
		{  
            		if (cc[i] == ' ') 
			{  
                		ncc[i] =' ';  
            		}  
        	}  
   		int j = ncc.length - 1;  
   		for (int i = 0; i < cc.length&&j>=0; i++) 
		{  
            		if (cc[i] != ' ') 
			{  
                		if (ncc[j] == ' ') 
				{  
                    			
					j--;  
                		}  
			ncc[j] = cc[i];  
       			j--;    
  			}
			
        	}  
	for(char nc:ncc)
        System.out.print(nc);  
    }  
}  