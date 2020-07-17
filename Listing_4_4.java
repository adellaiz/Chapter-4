/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-14 17:26:57
 * @modify date 2020-07-14 17:30:38
 * @desc [The hexadecimal number system has 16 digits: 0–9, A–F. The letters A, B, C, D, E, and F
correspond to the decimal numbers 10, 11, 12, 13, 14, and 15. We now write a program that
prompts the user to enter a hex digit and display its corresponding decimal value, as shown
in Listing 4.4.]
 */
package Chapter_4;
import java.util.Scanner;
public class Listing_4_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit = ");
        String hexString = input.nextLine();
        if(hexString.length() != 1){
            System.out.println("You must enter exactly one character!");
            System.exit(1);
        }
        char ch = hexString.charAt(0);
        if( ch<= 'F' && ch >= 'A'){
            int value = ch - 'A' + 10;
            System.out.println("The decimal value for hex digit " + ch + " is " + value);
        } else if (Character.isDigit(ch)){
            System.out.println("The decimal value for hex digit " + ch + " is " + ch);
        } else {
            System.out.println(ch + " is an invalid input");
        }
    }
}