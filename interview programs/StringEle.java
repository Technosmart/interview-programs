import java.util.*;
class StringEle
{
public static String[] output1;
public static void main(String... as)
{
ArrayList<String> input1 = new ArrayList<String>();
ArrayList<String> input2 = new ArrayList<String>();
input1.add("Apple");
input1.add("Cherry");
input1.add("Grapes");

input2.add("Orange");
input2.add("Mango");
input2.add("Apple");
Iterator<String> itr = input1.iterator();
int c=0,j=0;
		while(itr.hasNext())
		{
			String i= itr.next();
			if(i.endsWith("a")||i.endsWith("e"))
			{
				input1.remove(c);
				c--;
			}
			c++;
		}	
c=0;
		itr = input2.iterator();
		while(itr.hasNext())
		{
			String i= itr.next();
			if(i.startsWith("M")||i.startsWith("A"))
				{
					input2.remove(c); c--;
				}
			c++;
		}
	for(String str : input1){
			output1[j]=str;
			j++;
		}
		for(String str : input2){
			output1[j]=str;
			j++;
		}
	for(String i: input1)
	System.out.print(i+" ");
	}
}