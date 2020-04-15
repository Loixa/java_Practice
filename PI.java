
import java.text.DecimalFormat;
import java.util.Scanner;



/**
 *
 * @author Loixa
 * Find PI to the Nth Digit – Enter a number and have the program generate PI up
 * to that many decimal places. Keep a limit to how far the program will go.
 */
public class PI {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        num = sc.nextInt();
        while(num>15){
            System.out.println("please enter a value less than or equal to 15");
            num = sc.nextInt();
        }
        double pI;
        pI = Math.PI;
        String n=("%."+num+"f");
        System.out.format(n, pI);
        System.out.println();

        
        
        
    }
    
}
