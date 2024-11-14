//create class with method withdraw() which withdraw 5000 from an account and displays 0 balance.if a,c,b, has account of joint type 
//write thread sync prog to control entry to withdraw method.
package Threads;

class Account{
    static int balance=5000;
    int withdrawamnt;

    public synchronized void withdraw(int withdrawamnt){
        if(withdrawamnt>balance){
            System.out.println("insufficient balance");
        }
        else{
            balance=balance-withdrawamnt;
            System.out.println("balance is "+balance);
        }
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}

class Thread1 extends Thread{
    int withdraw;
    Account a;
    Thread1(Account a,int withdraw){
        this.a=a;
        this.withdraw=withdraw;
    }

    public void run(){
        a.withdraw(withdraw);
    }
}

public class SyncThreading {
    public static void main(String[] args) {
        Account a=new Account();
        
        Thread1 t1=new Thread1(a, 5000);
        Thread1 t2=new Thread1(a, 1000);
        Thread1 t3=new Thread1(a, 2000);
        t1.start();
        t2.start();
        t3.start();
    }
    
}
