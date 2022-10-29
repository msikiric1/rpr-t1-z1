package ba.unsa.etf.rpr;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * @param args input arguments from console
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Unesite x: ");
        int x = in.nextInt();
        System.out.println("Unesite y: ");
        int y = in.nextInt();
        System.out.println("x: " + x + ", y: " + y);
    }
}
