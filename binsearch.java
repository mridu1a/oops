import java.util.*;
public class binsearch{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter elements of array in sorted order");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }   

        System.out.println("enter search key");
        int key = sc.nextInt();

        int low = 0, high = size - 1, mid = 0;
        while(low<=high) {
            mid= low+(high-low)/2;

            if(arr[mid]==key) {
                System.out.println(key+" found at index "+mid);
                break;
            } else if(arr[mid]<key) {
                low=mid+1;
            } else {
                high=mid-1;
            }
        }   
        if(arr[mid]!=key) { 
            System.out.println(key+" not found");

        }
        sc.close();
}
}
 