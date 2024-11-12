//Write a Java program that checks whether a given string is a palindrome or not.Ex: MALAYALAM is palindrome. 
import java.util.*;

public class Pallind {
    public static void main(String[] args) {
        String str;
        int flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        str= new String();
        str=sc.nextLine();
        System.out.println("String is: "+str);

        for(int i=0;i<str.length();i++){
                if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                    flag=1;
                    break;
                }
        }

        if(flag==1){
            System.out.println("String is not a palindrome");
        }
        else{
            System.out.println("String is a palindrome");
        }
    }
}
