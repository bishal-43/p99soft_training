package Day4.java;

public class shape {
    String colour;

    public double calculateArea(){
        return 0;
    }



    public static class square extends shape {
        
        int side;

        square(int side) {
            this.side = side;
        }

        public double calculateArea() {
            return this.side * this.side;

        }

    }

    public static class circle extends shape {
        
        int radius;

        circle(int radius) {
            this.radius = radius;
        }

        
        public double calculateArea() {
            return Math.PI * radius * radius  ;

        }

    }

    public static class Rectangle extends shape{
        double length;
        double width;

        Rectangle(double length, double width){
            this.length=length;
            this.width = width;
        }

        public double calculateArea(){
            return length*width;
        }
    }



  

    public static void main(String[] args){
        shape s = new square(4);
        shape c = new circle(7);
        shape r = new Rectangle(5, 06);

        

        s.colour = "red";
        c.colour = "blue";
        r.colour = "green";

        System.out.println(c.colour);
        System.out.println("Circle Area: " + c.calculateArea());
        System.out.println(r.colour);
        System.out.println("Rectangle Area: " + r.calculateArea());
        System.out.println(s.colour);
        System.out.println("Square Area: " + s.calculateArea());
    }
      
}