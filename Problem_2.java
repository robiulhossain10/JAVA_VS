import java.util.Scanner;

public class Problem_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Three Number");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double average = (number1+number2+number3)/3;

        System.out.println("The Average of "+ number1+" "+number2+" "+number3+" is "+ average);
    }
}
