public abstract class Shape {
    // Fields representing the position of the shape
    protected int x;
    protected int y;
    protected String color = "blue";

    // Constructor to initialize the position of the shape
    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    // Abstract methods that subclasses must implement
    public abstract double area();
    public abstract double perimeter();

    // Getter and Setter methods for x and y
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // A method to display basic information about the shape
    // This method can be overridden by subclasses to provide more specific information
    public void display() {
        System.out.println("Shape position - X: " + x + ", Y: " + y);
    }
}
