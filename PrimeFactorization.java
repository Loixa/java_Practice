
import java.util.Scanner;

/**
 *
 * @author Loixa Prime Factorization – Have the user enter a number and find all
 * Prime Factors (if there are any) and display them.
 *
 */
public class PrimeFactorization {

    public static void main(String[] args) {
        int n;
        int p = 3;
        int t;
        boolean check = true;
        System.out.print("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        t=n;
        while (n % 2 == 0) {//keep dividing by 2 until we hit an odd value.
            System.out.print("2, ");
            n = n / 2;
        }

        while (check) {
            check=false;
            while (n % p == 0) {//keep dividing by prime numbers starting with 3
                n = n / p;
                System.out.print(p + " ");//print if the remainder is still 0
                check = true;
            }
            if(!check && p<=t){//if the above fails (no remainder)then check
                //another value example another prime value by adding 2 then 
                //check again
                p=p+2;
                check=true;
            }

        }

        System.out.println();
    }

}
