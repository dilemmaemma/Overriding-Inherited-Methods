public class Calculation {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(10);
        r.setWidth(20);
        r.print();
        System.out.println("Perimeter of Rectangle: " + r.calculatePerimeter());

        Square s = new Square();
        s.setLength(10);
        s.print("square");
        System.out.println("Perimeter of Square: " + s.calculatePerimeter());
    }
}
