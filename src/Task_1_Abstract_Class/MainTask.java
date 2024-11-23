package Task_1_Abstract_Class;

public class MainTask {
    public static void main(String[] args) {
        Shape triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
        System.out.println("Triangle Area: " + triangle.calculateArea());

        Shape circle = new Circle(7);
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
        System.out.println("Circle Area: " + circle.calculateArea());
    }
}

