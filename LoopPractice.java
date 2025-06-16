import java.util.Arrays;
import java.util.Scanner;

public class LoopPractice {

    public static void main(String[] args) {

        //FOR LOOP
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 3; j++){
                System.out.println(" Outer: " + i + " Inner: " + j);
            }
        };

        //do while loop
        int num = 0;
        do{
            System.out.println("Do While Loop " + ++num);
        } while (num < 10);

// Object for loop[]
            String[] names = {"Alive","Bob","Charlie","Diana","Eve"};

    for(String name : names){
        if(name.equalsIgnoreCase("Diana")){
            System.out.println("Found Diana Beaking the loop");
            continue;
        }

        System.out.println("name: " + name);
        System.out.println("LengthOf: " + name + ": " + name.length());
    }

    // 7 multiplication table
        
    
        // for(int i = 7; i < 12; i++){
        //   int a = i;

        //      for(int j = 1; j <= 10; j++){

        //     System.out.println(a + "X" + + j + " = " + a*j);
        // }

        // }
 
        // Factorial Value

        int b = 5;
        Long factorialResult = 1l;

        for(int i = 1; i <= b; i++){
            factorialResult *= i;

        }
        System.out.println();
        System.out.println("Factorial: " + factorialResult);



        // Dynamic Multifications
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Multipication Number");
        int a = input.nextInt();
        for(int j = 1; j <= 10; j++){

            System.out.println(a + " X " + j + " = " + a*j);
        }


// Sorted Arrays
    int [] array = {9,7,8,6,5,4,3,2,1};

      Arrays.sort(array);
              System.out.print("Sorted array: ");
        for (int hi : array) {
            System.out.print(hi + " ");
        }










    }
}