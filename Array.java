import java.util.*;

public class Array{

    public static void main(String[] args){
    
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter elements in the array:");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] arr2 = new int[n];
        int arr2len=0;

        for(int i=0;i<n;i++){
            int currentelement = arr[i];
            int count=0;
            boolean present =false;
            for(int j=0;j<arr2len;j++){
                if(arr2[j]==currentelement){
                    present=true;
                    break;
                }
            }
            if(!present){
                arr2[arr2len]=currentelement;
                arr2len++;

                for(int j=0;j<n;j++){
                    if(arr[j]==currentelement){
                        count++;
                    }
                }
            System.out.println(currentelement+"occurs"+count+"times");
            }
        }


    }
    
}
