package E23;
import java.awt.Rectangle;
public class AreaTester {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(15, 20, 18,28);
        double area;
        area = rec.getWidth() * rec.getHeight();
        System.out.println("The EXPECTED area is: 504");
        System.out.println("The ACTUAL area is: " + area);
    }
}
