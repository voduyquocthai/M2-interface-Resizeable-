public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    @Override
    public void resize(double percent){
        double newside = (double) Math.round(getSide() * percent)/100;
        this.setSide(newside);
    }
    public static void main(String[] args) {
        Square squares [] = new Square[3];
        squares[0] = new Square(3.0);
        squares[1] = new Square(1.5);
        squares[2] = new Square(4.7);

        System.out.println("Pre-resized:");
        for (Square square : squares) {
            System.out.println(square);
        }

        for (Square square : squares) {
            square.resize(Math.random()*200.0);
        }

        System.out.println("After-resized:");
        for (Square square : squares) {
            System.out.println(square);
        }
    }
}
