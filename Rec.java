public class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor to initialize the rectangle's properties along with x, y coordinates
    public Rectangle(int x, int y, double width, double height) {
        super(x, y); // Call the superclass constructor to set x and y
        this.width = width;
        this.height = height;
    }

    // Implement the area() method for a rectangle
    @Override
    public double area() {
        return width * height;
    }

    // Implement the perimeter() method for a rectangle
    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Override the display method to include rectangle's width and height
    @Override
    public void display() {
        super.display(); // Call the superclass method to display x, y
        System.out.println("Width: " + width + ", Height: " + height);
    }
}
