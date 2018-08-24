import java.util.*;

public class AvoidSpecialAndTwoSpaces{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ssp = scan.nextLine();
	ssp=ssp.trim();
	
        char s[]=ssp.toCharArray();
        for(int i=s.length-1;i>=0;i--)
            if(!((s[i]>=65&&s[i]<=90)||(s[i]>=97&&s[i]<=122)||(s[i]>=48&&s[i]<=57)))
                s[i]=' ';
        
               String st=String.valueOf(s);
        st= st.replaceAll("( )+", " ");
        if (st.length() == 0) {
            System.out.println(0);
            return;
        }
	String[] str=st.split(" ");
        
        System.out.println(str.length);
        for(String ss: str )
        	if(ss==" ") 
		{}
		else                  
            System.out.println(ss);

        scan.close();
    }
}

/*
Sample Input:

My name is phani kumar, isn't he

Sample Output:

My
name
is
phani
kumar
isn
t
he

*/


