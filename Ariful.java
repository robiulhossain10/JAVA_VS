public class Ariful {
    public static void main(String[] args) {
        Ariful obj = new Ariful();
        obj.tableOf1to100();
    }

    public void tableOf1to100() {
        for (int i = 1; i <= 100; i++) {
            System.out.println();
            System.out.println("Table of " + i);
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                int multi = i * j;
                System.out.println(i + " X " + j + " = " + multi);
            }
        }
    }
}

public static void maxmin() {
    int[] abc = { 45, 32, 77, 65, 90, 12, 38 };
    
     int max = abc[0];
     int min = abc[0];

     for (int i = 0; i < abc.length; i++) {
        if (abc[i] > max) {
            max = abc[i];
        } 
        if (abc[i] < min) {
            min = abc[i];
        }
     }
     System.out.println("Maximum Number is : " + max);
     System.out.println("Manimum Number is : " + min);
}
