import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        float a,b,res,sc;
        Scanner s = new Scanner(System.in);    

        while(true){
            System.out.println("1.add\n2.subtract\n3.multiply\n4.divide\n5.exit\nenter your choice");
            sc = s.nextInt();
            if(sc==5){
                System.exit(0);
            }
            System.out.println("enter two numbers");
            a = s.nextFloat();
            b = s.nextFloat();
            if(sc==1){
                res = a+b;
                System.out.println("addition is:"+res);
            }
            else if(sc==2){
                res = a-b;
                System.out.println("subtraction is:"+res);
            }
            else if(sc==3){
                res = a*b;
                System.out.println("multiplication is:"+res);
            }
        }
    }
}