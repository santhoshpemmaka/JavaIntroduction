import java.lang.reflect.Array;
import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
        // byte age = 30;
        // int viewsCount = 3456677;
        // double price = 202.45;
        // char letter = 'A';
        // String name = "Santhosh";
        // boolean isTrue = true;
        // Date now = new Date();

        // System.out.println("Hello world");

        System.out.println("Programming Strted!");
        printNumber(6);
        System.out.println("Programming finises");

    }
    
    public static void printNumber(int number) {
        for (int i = 0; i < number; i = i + 2) {
            System.out.println(i);
        }
    }
}