package Tokeniser;
import java.util.*;


public class SToken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        String s=sc.nextLine();
        int sum=0;
        sc.close();
        StringTokenizer st=new StringTokenizer(s," ",false);
        while(st.hasMoreTokens()){
            int num=Integer.parseInt(st.nextToken());
            System.out.println(num);
            sum+=num;
        }
        System.out.println(sum);
    }
}
