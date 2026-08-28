public class Square extends AShape {
    private int side;

    private Square(Cartesianpoint location, int side) {
        super(location);
        this.side = side;
    }
}
