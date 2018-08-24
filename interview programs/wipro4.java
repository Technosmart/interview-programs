import java.util.*;
class wipro4
{
public static void main(String... as)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int start=sc.nextInt();
for(int i=1;i<=n;i++)
{for(int j=1;j<=i;j++){
System.out.print(start);
}start++;
System.out.println();
}
for(int i=n;i>=1;i--)
{
start--;
for(int j=i;j>=1;j--){
System.out.print(start);
}
System.out.println();
}
}
}