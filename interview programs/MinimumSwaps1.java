import java.util.*;
public class MinimumSwaps1{

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
    int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    count++;
                }
            }
        }
        return count;

    }

   

    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int[] arr = new int[n];

      


        for (int i = 0; i < n; i++) {
		arr[i]=sc.nextInt();            
        }

        int res = minimumSwaps(arr);

       System.out.println(res);

        sc.close();
    }
}
