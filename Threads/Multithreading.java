package Threads;

class Number extends Thread {
    public void run() {
        
            for (int i = 1; i <= 5; i++) {
                System.out.println("Number: " + i);

                Square t1 = new Square(i);
                Cube t2 = new Cube(i);

                t1.start();
                t2.start();
                try{
                    t1.sleep(2000);
                    t2.sleep(2000);
                }
            
         catch (InterruptedException e) {
            System.out.print(e);
        }
    }
    }
}

class Square extends Thread {
    int i;

    Square(int i) {
        this.i = i;
    }

    public void run() {
        int j = i * i;
        System.out.println("Square of " + i + ": " + j);
    }
}

class Cube extends Thread {
    int i;

    Cube(int i) {
        this.i = i;
    }

    public void run() {
        int j = i * i * i;
        System.out.println("Cube of " + i + ": " + j);
    }
}

public class Multithreading {
    public static void main(String[] args) {
        Number t = new Number();
        t.start();
    }
}
