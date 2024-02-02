public class Circle extends Shape {
    private double radius; // Field for the radius of the circle

    // Constructor
    public Circle(int x, int y, double radius) {
        super(x, y); // Calls the constructor of the superclass (Shape)
        this.radius = radius;
    }

    // Implement the area method for a circle
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // Implement the perimeter method for a circle (circumference)
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Override the display method to include radius information
    @Override
    public void display() {
        super.display(); // Call the display method of the superclass (Shape)
        System.out.println("Radius: " + radius);
    }
}
