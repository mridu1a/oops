class Rectangle{
    private int length;
    private int breadth;
    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public int area(){
        return length*breadth;
    }
    public int peremeter(){
        return 2*(length+breadth);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,20);
        System.out.println("area"+r.area());
        System.out.println("peremeter"+r.peremeter());
    
}

}