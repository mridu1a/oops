abstract class Shape{
    abstract void numberOfSides();
}
class Rectangle extends Shape{
    void numberOfSides(){
        System.out.println("number of sides is 4");
    }
}
class Triangle extends Shape{
    void numberOfSides(){
        System.out.println("number of sides is 3");
    }
}
class Hexagon extends Shape{
    void numberOfSides(){
        System.out.println("number of sides is 6");
    }
}
public class Abstraction{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.numberOfSides();
        Triangle t = new Triangle();
        t.numberOfSides();
        Hexagon h = new Hexagon();
        h.numberOfSides();
    }
}