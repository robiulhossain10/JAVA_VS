import java.util.Scanner;

public class Problem_1 {


public static void calculateArea(double radius) {
    final double pi = 3.14159;
    double area = Math.pow(radius, 2) * pi;
    System.out.println("Area"+ radius+" is "+area);
}

// public static double calculateArea2(double radius) {
//     final double pi = 3.14159;
//     double area = Math.pow(radius, 2) * pi;
//     System.out.println("Area"+ radius+" is "+area);
//     return area;
// }

    
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the radius of the circle: ");
    calculateArea(input.nextDouble());
    calculateArea(input.nextDouble());
}
}
