import java.util.Scanner;

public class DaySecMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Seconds");
        int sec = input.nextInt();
        int Daysec = 60*60*24;
        int day = sec / Daysec;
        int hours = (sec % Daysec) / 3600;
        int minutes = (sec % Daysec) % 3600 / 60;
        int Seconds = ((sec % Daysec) % 3600) % 60;

        System.out.println(" Seconds = "+ Seconds+" Minutes = "+minutes+" Hour = "+ hours +" Day = "+ day);

        int a = 15;
        int b = 25;

        System.out.println(a++);// post increament 
        System.out.println(++a);// pre increament
        System.out.println(b--); // post decreament
        System.out.println(--b); //pre decreament
    }
}
