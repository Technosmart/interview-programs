import java.util.*;
public class LexographSubString {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter any string(without spaces)");
        String inputString = sc.nextLine();
	System.out.println("Enter Substring Length:");
        int length = sc.nextInt();
        String smallest="";
        String largest="";
        for(int i = 0;i<=inputString.length()-length;i++){
            String subString = inputString.substring(i,i+length);
            if(i == 0){
                smallest = subString;
            }
            if(subString.compareTo(largest)>0){
                largest = subString;
            }else if(subString.compareTo(smallest)<0)
                smallest = subString;
        }
        System.out.println(smallest);
        System.out.println(largest);
        
    }
}