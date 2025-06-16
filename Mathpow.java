import java.util.Arrays;

public class Mathpow {
    public static void main(String[] args) {
        System.out.println("Ceil: " + Math.ceil(2.1));
        char ch = 'A';
        System.out.println("Char" + ch);
        System.out.println("ASCII: " + (int) ch);
        System.out.println("floor: " + Math.floor(2.9));
        System.out.println("Rint: " + Math.rint(2.1));
        System.out.println("round: " + Math.round(2.6));
        System.out.println("Absoulate: " + Math.abs(-10));
        System.out.println("SquareRoot: " + Math.sqrt(49));
        System.out.println("Power: " + Math.pow(5,2));
        System.out.println("Random: " + (int)(Math.random() * 1000));

        for(int i = 32; i <= 126; i++) {
            System.out.println(i + " : " + (char)i);
        }
        double score = 50;
        if(score >= 80){
            System.out.println("A+");
        } else{
            System.out.println("F");
        }


        String as = "Hello Java";

        System.out.println("Length: " + as.length());
        System.out.println("Char 1: " + as.charAt(1));
        System.out.println("UpperCase: " + as.toUpperCase());
        System.out.println("LowerCase: " + as.toLowerCase());
        System.out.println("Substring: " + as.substring(0,5));
        System.out.println("Replace: " + as.replace('a','@'));
        System.out.println("Contains Boolean: " + as.contains("Java"));
        System.out.println("StarWith Hello: " + as.startsWith("Hello"));
        System.out.println("EndsWith Java: " + as.endsWith("Java"));
        System.out.println("IndexOf: " + as.indexOf("a"));
        System.out.println("LastIndexOf: " + as.lastIndexOf("a"));
        System.out.println("Trim: " + as.trim());
        System.out.println("Split: " + String.join(", ", as.split(" ")));
        System.out.println("Concat: " + as.concat(" is fun!"));
        System.out.println("Equals: " + as.equals("Hello Java"));

        String[] words = as.split(" ");
        System.out.println("Words = " + Arrays.toString(words));

        for(int i = 0; i < words.length; i++){
            System.out.println(i + " words: " + words[i]);
        }


            
    }
}
