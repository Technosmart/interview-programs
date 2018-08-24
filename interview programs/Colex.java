import java.util.*;
class Colex
{
//public static boolean ASC = true;
public static void main(String... as)
{
HashMap<Integer, String> hs=new HashMap<>();
hs.put(1,"phani");
hs.put(2,"kumar");
System.out.println(hs);
Iterator<Integer> itr1=hs.keySet().iterator();
while(itr1.hasNext())
System.out.println(itr1.next());

Iterator<String> itr2=hs.values().iterator();
while(itr2.hasNext())
System.out.println(itr2.next());


hs.forEach((key, value) ->
{
if(value.equals("phani"))
System.out.println(key);
});


}
}