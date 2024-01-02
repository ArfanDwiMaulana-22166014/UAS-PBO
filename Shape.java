package shape;

import java.util.Scanner;

public class Shape { 
    private final String color;
    
    public Shape(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public double getArea() {
        return 0;
    }
    
    class Circle extends Shape {
        private final double radius;
        
        public Circle(String color, double radius) {
            super(color);
            this.radius = radius;
        }
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }
    
    class Rectangle extends Shape {
        private final double length;
        private final double width;
        
        public Rectangle(String color, double length, double width) {
            super(color);
            this.length = length;
            this.width = width;
        }
        
        public double getArea() {
            return length * width;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Perhitungan Luas Lingkaran");
        System.out.println("===========================");
        System.out.println("Masukan wawna lingkaran");
        String colorCircle = scanner.nextLine();
        System.out.println("Masukkan radius lingkaran");
        double radius = scanner.nextDouble();

        Shape shape = new Shape(colorCircle);

        Shape.Circle circle = shape.new Circle(colorCircle, radius);
        System.out.println("Luas Lingkaran: " + circle.getArea());
        
        System.out.println("");
        System.out.println("Perhitungan Luas Persegi Panjang");
        System.out.println("======================================");
        System.out.println("Masukan Luas Persegi Panjang");
        scanner.nextLine();
        String colorRectangle = scanner.nextLine();
        System.out.println("Masukan Panjang persegi panjang: ");
        double length = scanner.nextDouble();
        
        System.out.println("Masukan Lebar Persegi Panjang");
        double  width = scanner.nextDouble();
        Shape.Rectangle rectangle = shape.new Rectangle(colorRectangle, length, width);
        System.out.println("Luas persegi panjang: " + rectangle.getArea()); 

        scanner.close();
    }
}