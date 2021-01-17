public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }
    @Override
    public void resize(double percent){
        width *= Math.round(((percent / 100)*100)/100);
        length *= Math.round(((percent / 100)*100)/100);
    }
    public static void main(String[] args) {
        Rectangle rectangles [] = new Rectangle[3];
        rectangles[0] = new Rectangle(2.0,3.0);
        rectangles[1] = new Rectangle(3.0,1.5);
        rectangles[2] = new Rectangle(2.4,4.7);

        System.out.println("Pre-resized:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }

        for (Rectangle rectangle : rectangles){
            rectangle.resize(Math.random()*1000);
        }

        System.out.println("After-resized:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }
}
