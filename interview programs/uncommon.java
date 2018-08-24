import java.util.*;
class uncommon
{
public static int[] output1;
public static void main(String... as)
{
ArrayList<Integer> input1 = new ArrayList<Integer>();
ArrayList<Integer> input2 = new ArrayList<Integer>();
ArrayList<Integer> result = new ArrayList<Integer>();
input1.add(1);
input1.add(1);
input1.add(3);
input1.add(5);
input2.add(3);
input2.add(5);
Iterator<Integer> itr = input1.iterator();
		while(itr.hasNext())
		{
			Integer i= itr.next();
			if(!input2.contains(i))
			{
				result.add(i);
			}
		}	
		itr = input2.iterator();
		while(itr.hasNext())
		{
			Integer i= itr.next();
			if(!input1.contains(i))
				{
					result.add(i);
				}
		}
		int[] res = new int[result.size()];
		for(int i = 0;i<result.size();i++)
		{
			res[i] = result.get(i);
		}
		output1 = res;
	for(int i: output1)
	System.out.print(i+" ");
	}
}