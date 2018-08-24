import java.util.*;
class 	common
{
public static int output1;
public static void main(String... as)
{
HashSet<String> input1 = new HashSet<String>();
HashSet<String> input2 = new HashSet<String>();

input1.add("1");
input1.add("2");
input1.add("3");
input1.add("5");	//1 2 3 5 2 -->1 2 2 3 5
input1.add("2");	//3 5 2 2   -->2 2 3 5
input2.add("3");
input2.add("5");
input2.add("2");
input2.add("2");
Set<String> set1 = new HashSet<String>();
		for(String str: input1){
			set1.add(str);
		}
		
		Set<String> set2 = new HashSet<String>();
		for(String str: input2){
			set2.add(str);
		}
		
		int i=0;
		
		Iterator<String> itr = set1.iterator();
		
		while(itr.hasNext()){
			String str = itr.next();
			if(set2.contains(str)){
				i++;
			}
		}
		
		output1 = i;
System.out.print(output1);
}
}