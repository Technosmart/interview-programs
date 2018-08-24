import java.util.*;


public class sai
{
  
	public static void main (String[]args)
  
	{
      
      
		Scanner sc = new Scanner (System.in);

    
		System.out.println("Enter No. of Strings:");
		int n = sc.nextInt();
   
		String[] st= new String[n];

		int count = 0;
    
		System.out.println("Enter total Strings:");
		for(int i=0;i<n;i++)
  
		st[i]=sc.next();
		for(int i=0;i<n;i++)
  
		{
      
			char[] a = st[i].toCharArray();
    
	
			for (char ch:a)
     
			{
         
	      
				switch (ch)
           
				{
               
          
				case 'a':
          
				case 'e':
          
				case 'i':
	      
				case 'o':
	      
				case 'u':
	      
				case 'A':
	      
				case 'E':
	      
				case 'I':
	      
				case 'O':
	      
				case 'U':
		
					count++;
		
				break;
		
	      
		      
				}
	
	      	}
     
		System.out.println ("vowels in: "+st[i]+" --> "+count);
   
		count=0;
		}
     
	}
   	      	      

}
