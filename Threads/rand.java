package Threads;

import java.util.*;


class randomgen extends Thread {
    public void run() {
        
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            int num=rnd.nextInt(10);
            System.out.println("number is:"+num);
            if(num%2==0){
                secondThread st=new secondThread(num);
                st.start();}
            else{
                ThirdThread tt=new ThirdThread(num);
                tt.start();
            }

        
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
    }
}
class secondThread extends Thread{
    int num;
    secondThread(int num){
        this.num=num;
}
    public void run(){
        System.out.println("square is"+num*num);
}
}
class ThirdThread extends Thread{
    int num;
    ThirdThread(int num){
        this.num=num;
    }
    public void run(){
        System.out.println("cube is:"+num*num*num);
    }
}
public class rand {
    public static void main(String[] args) {
        randomgen ft=new randomgen();
        ft.start();
    }
}
