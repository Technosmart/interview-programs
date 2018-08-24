class Memory
{
public static void main(String... as)
{
Runtime r=Runtime.getRuntime();
System.out.println("Total Heap Memory "+r.totalMemory());
System.out.println("Free Heap Memory "+r.freeMemory());
Memory m=new Memory();
r.gc();
System.out.println("Total Heap Memory after Gc "+r.freeMemory());
}
}