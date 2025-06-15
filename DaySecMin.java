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
    }
}
