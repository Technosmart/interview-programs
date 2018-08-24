import java.util.*;

class Palindrome
{
	public static void main (String[] args) 
   
  	{
    
       
            
   		String temp="";
           
   		Scanner sc=new Scanner(System.in);
        
   		System.out.println("Enter No. of Test Cases:");
		int cases= sc.nextInt();
            
   		String[] str=new String[cases];
            
   		System.out.println("Enter "+cases+" Strings:");           
		for (int i=0;i<cases;i++ ) 
        
    		{
      
      			str[i]=sc.next();
     
		}  
    		for(String ss:str)
        
    		{
               
    			for(int j=ss.length()-1;j>=0;j--)
         
      			{
                  
         			temp=temp+ss.charAt(j);
     
      			}
            
    		if(temp.equals(ss))
                
      			System.out.println(temp+" =YES");
               
    		else
                
      			System.out.println(temp+" =NO");
           
      		temp="";
                
            
            
		}	

 		
 
	}    
   
}