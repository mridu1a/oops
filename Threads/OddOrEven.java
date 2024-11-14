package Threads;
// Write a Java program to create two threads: One for displaying all odd number between 1 and 100
// and second thread for displaying all even numbers between 1 and 100. 

class Odd implements Runnable{
   
    public void run(){
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                System.out.println(i+"is odd");
            }
        }
    }
}
class Even implements Runnable{
    public void run(){
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.println(i+"is even");
            }
        }
    }
}

public class OddOrEven {
    public static void main(String[] args) {
        Odd o=new Odd();
        Even e=new Even();
        Thread t1=new Thread(o);
        Thread t2=new Thread(e);
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();

    }
    
}
