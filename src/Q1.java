import javax.swing.*;
import java.util.*;
public class Q1 {
    static double pie = 3.14;
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double radius = Integer.parseInt(JOptionPane.showInputDialog("What is the radius of the circle? "));
        String c = Double.toString(circumference(radius));
        String a = Double.toString(area(radius));
        JOptionPane.showMessageDialog(null, "Circum: " + c+"\n" + " Area: " + a);

    }
    public static double circumference(double rad){
        double cir = 2*pie*rad;
        return cir;
    }
    public static double area(double radious){
        double area = pie*(radious*radious);
        return area;
    }

}
