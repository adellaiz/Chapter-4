/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-14 15:02:12
 * @modify date 2020-07-14 15:02:12
 * @desc [Listing 4.2 gives a program that prompts the user to enter two cities and displays them in
alphabetical order.]
 */
package Chapter_4;
import java.util.Scanner;
public class Listing_4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();
        if (city1.compareTo(city2) < 0){
            System.out.println("The cities in alphabetical order are " + city1 + " " + city2);
        } else {
            System.out.println("The cities in alphabetical order are " + city2 + " " + city1);
        }
    }
}