
import java.util.Scanner;


/**
 *
 * @author Loixa
 * Fibonacci Sequence – Enter a number and have the program generate the 
 * Fibonacci sequence to that number or to the Nth number.

 */
public class FibonacciSequence {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n; 
        int r;
        System.out.print("Enter Nth number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.print("The Fibonacci Sequence is: 0, 1");
        for (int i = 0; i < n; i++) {
            r = a+b;
            System.out.print(", "+r);
            a=b;
            b=r;
        }
        System.out.println();
        
        
        
        
    }
    
}
