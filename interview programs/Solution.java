import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        char[] a=A.toCharArray();
        
        int len=A.length()+B.length();
        System.out.println(len);
        int count=0;
        int nn=(A.length()<B.length())?B.length():A.length();
	int nm=(A.length()>B.length())?A.length():B.length();
	
	for(int j=0, k=nn-1;j<nm;j++)
		
        for(int i=0;i<nm;i++)
        {
            if(a[i]==b[i])
            count=0;
            else if(a[i]>b[i])
                count=1;
            else
                count=2;
        
        }
        if(count==0)
		
            System.out.println("No");
        if(count==1)
            System.out.println("No");
        else if(count==2)
            System.out.println("Yes");
        for(int i=0;i<A.length();i++)
        {
            if(i==0)
            {   
                if(a[i]>=65&&a[i]<=90){}
                else{
                int c=a[i];
                int n=c-32;
                a[i]=(char)n;
                }
            }System.out.print(a[i]+"");
        }
        System.out.print(" ");
        for(int i=0;i<B.length();i++)
        {
            if(i==0){
                    if(b[i]>=65&&b[i]<=90){}
                else{
                int c=b[i];
                int n=c-32;
                b[i]=(char)n;
                }
            }
            System.out.print(b[i]+"");
        }
        
        
    }
}



