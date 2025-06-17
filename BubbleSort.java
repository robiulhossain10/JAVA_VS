import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        

        int [] arr = {9,7,5,2,1,4,3,6};

        // System.out.println(Arrays.toString(arr));
        sort(arr);


         Scanner input = new Scanner(System.in);
    System.out.println("Enter a Number");
        CheckPrime(input.nextInt());
    }

        public static void sort(int[] array){

            for(int i = 0; i < array.length; i++){
                for(int j = i + 1; j < array.length; j++){
                    if(array[i] > array[j]){
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            System.out.println("Arrays: " + Arrays.toString(array));

}


public static void CheckPrime(int number){
   
    for(int i = 2; i < number ; i++){
        if(number % i == 0){
            System.out.println("Not a Prime Number");
            return;
        }
        }
        System.out.println("Prime Number");
    }//close




















}

