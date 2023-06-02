interface Polygon {
    int getArea();

    int getSides();
}

class Rectangle implements Polygon {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public int getArea() {
        return (int) (length * breadth);
    }

    @Override
    public int getSides() {
        return 4;
    }
}

class Square implements Polygon {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return (int) (side * side);
    }

    @Override
    public int getSides() {
        return 4;
    }
}
