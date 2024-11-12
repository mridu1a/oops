//Write a Java Program to find the frequency of a given character in a string. 
import java.util.*;

public class Freq {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        char ch;
        char chars[] = new char[str.length()];
        int k=0;
        for(int i=0;i<str.length();i++) {
            ch = str.charAt(i);
            int flag1=0;
            for(int j=0;j<k;j++) {
                if(ch==chars[j]) {
                    flag1=1;
                    break;
                }
            }
                if(flag1==0) {
                    chars[k]=ch;
                    k++;
                    
            }
        }
        System.out.println(chars);
        System.out.println(k);
        for(int i=0;i<k;i++){
            count=0;
                       ch=chars[i];
            
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==ch){
                    count++;
                }
            }
            System.out.println(ch+" "+count);
        }
    }
}
