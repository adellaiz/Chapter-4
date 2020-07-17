/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-14 17:11:51
 * @modify date 2020-07-14 17:21:21
 * @desc [You can find out the date of the month when your friend was born by asking five questions.
Each question asks whether the day is in one of the five sets of numbers. The birthday is the sum of the first numbers in the sets where the day appears. For example,
if the birthday is 19, it appears in Set1, Set2, and Set5. The first numbers in these three sets
are 1, 2, and 16. Their sum is 19.]
 */
package Chapter_4;
import java.util.Scanner;
public class Listing_4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String set1 = " 1 3 5 7\n" + " 9 11 13 15\n" + "17 19 21 23\n" + "25 27 29 31";
        String set2 = " 2 3 6 7\n" + "10 11 14 15\n" + "18 19 22 23\n" + "26 27 30 31";
        String set3 = " 4 5 6 7\n" + "12 13 14 15\n" + "20 21 22 23\n" + "28 29 30 31";
        String set4 = " 8 9 10 11\n" + "12 13 14 15\n" + "24 25 26 27\n" + "28 29 30 31";
        String set5 = " 16 17 18 19\n" + "20 21 22 23\n" + "24 25 26 27\n" + "28 29 30 31";
        int day = 0;
        System.out.print("Is your birthday in Set1?\n ");
        System.out.print(set1);
        System.out.println("\nEnter 0 for No and 1 for Yes = ");
        int answer = input.nextInt();
        if(answer == 1){
            day += 1;
        }
        System.out.print("\nIs your birthday in Set2?\n ");
        System.out.print(set2);
        System.out.println("\nEnter 0 for No and 1 for Yes = ");
        answer = input.nextInt();
        if(answer == 1){
            day += 2;
        }
        System.out.print("\nIs your birthday in Set3?\n ");
        System.out.print(set3);
        System.out.println("\nEnter 0 for No and 1 for Yes = ");
        answer = input.nextInt();
        if(answer == 1){
            day += 4;
        }
        System.out.print("\nIs your birthday in Set4?\n ");
        System.out.print(set4);
        System.out.println("\nEnter 0 for No and 1 for Yes = ");
        answer = input.nextInt();
        if(answer == 1){
            day += 8;
        }
        System.out.print("\nIs your birthday in Set5?\n ");
        System.out.print(set5);
        System.out.println("\nEnter 0 for No and 1 for Yes = ");
        answer = input.nextInt();
        if(answer == 1){
            day += 16;
        }
        System.out.println("\nYour birthday is " + day + "!");
    }
}