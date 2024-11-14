package pallindrome_qs;


import java.util.*;

public class StringBuilderQ {
    public static boolean ispalindrome(String word){
        int flag=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)!=word.charAt(word.length()-i-1)){
                flag=1;
            }
    }
    if(flag==0){
        return true;
    }
    else{
        return false;
    }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("enter a line :");
        String str=sc.nextLine();

        StringTokenizer sz=new StringTokenizer(str," ",false);
        StringBuilder s=new StringBuilder();

        while(sz.hasMoreTokens()){
            String w=sz.nextToken();
            if(ispalindrome(w) && w.length()>1){
                for(int i=0;i<w.length();i++){
                    s.append("*");
                }
                s.append(" ");
            }
            else{
                s.append(w);
                s.append(" ");
            }

        }
        System.out.println(s.toString());

    }
}
