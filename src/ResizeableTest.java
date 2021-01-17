
public class ResizeableTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);

        System.out.println("Pre-resized:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        for (Circle circle: circles){
            circle.resize(Math.random()*1000.0);
        }


        System.out.println("After-resized:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
