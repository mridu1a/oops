import java.util.*;

public class LSearch {
    public static void main(String[] args){
        int n,search,flag=0,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array");
        n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter elements of array");
        for(int j=0;j<n;j++){
            arr[j]=sc.nextInt();
        }

        System.out.println("enter search key:");
        search=sc.nextInt();
        for(i=0;i<n;i++){
            if(arr[i]==search){
                flag=1;
                break;
                
            }

        }
        if(flag==1){
            System.out.println("search key found at index "+i);
        }
        else
            System.out.println("search key not found");


}


}
