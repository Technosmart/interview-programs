import java.util.*;
class binser
{
	public static void main(String... as)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Array Elements:");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter Key Value:");
		int key=sc.nextInt();
		int low=0,high=n-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==key)
			{
				System.out.println("Element Found at location "+(mid+1)+ "");
				break;
			}
			else if(arr[mid]>key)
				high=mid-1;
			else if(arr[mid]<key)
				low=mid+1;
		}
		if(low>high)
		System.out.println("Element not found");
	}
}