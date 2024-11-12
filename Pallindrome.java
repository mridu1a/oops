import java.util.*;

class Pallindrome{

    public static boolean isPalindrome(int num){
        int orgnum=num;
        int revnum=0;

        while(num!=0){
            int remain=num%10;
            revnum= revnum*10 + remain;
            num/=10;

        }
        return orgnum==revnum;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number");
        int num= sc.nextInt();

        if(isPalindrome(num))
        {System.out.println(num+"is pallindrome");}
        else
        {System.out.println(num+"is not pallindrome");}

        

    }
}