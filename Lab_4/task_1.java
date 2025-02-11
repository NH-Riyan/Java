package Lab_4;

  class Triangle {
       
        private double height;
        private double base;
    
        public Triangle(double h, double b) {
            height = h;
            base = b;
        }
    
        public void setHeight(double x) {
            height = x;
        }  
        public void setBase(double x) {
            base = x;
        }
    
        public double getHeight() {
            return height;
        }
        public double getBase() {
            return base;
        }
    
        public double getArea() {
            return 0.5*base*height;
        }
    }

public class task_1 {
        public static void main(String[] args) {

            Triangle t1 = new Triangle(10, 5);
            System.out.println("Height: " + t1.getHeight());
            System.out.println("Base: " + t1.getBase());
            System.out.println("Area: " + t1.getArea());
    
            t1.setHeight(5);
            t1.setBase(8);
            System.out.println("Updated Height: " + t1.getHeight());
            System.out.println("Updated Base: " + t1.getBase());
            System.out.println("Updated Area: " + t1.getArea());
        }
}
    

