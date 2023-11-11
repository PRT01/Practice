package OOPs_Basic;



abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    void calculateArea() {
        System.out.println("Calculating the area of a circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }

    void calculateArea() {
        System.out.println("Calculating the area of a square");
    }
}

public class PolymorphismExample2 {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();

        circle.draw();
        square.draw();

       
    }
}

