
    import java.awt.Rectangle;
    public class PerimeterTester {
        public static void main(String[] args) {
            Rectangle rec = new Rectangle(15, 20, 9,19);
            double perimeter;
            perimeter = (rec.getWidth()*2) + (rec.getHeight()*2);
            System.out.println("The EXPECTED perimeter is: 56");
            System.out.println("The ACTUAL perimeter is: " +perimeter);
        }
    }
