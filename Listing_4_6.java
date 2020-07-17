/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-17 06:30:44
 * @modify date 2020-07-17 06:42:21
 * @desc [Listing 4.6 gives a program that uses printf to display a table.]
 */
package src;
public class Listing_4_6 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees", "Radians", "Sine", "Cosine", "Tangent");
        int degrees = 30;
        double radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n",degrees,radians,Math.sin(radians),Math.cos(radians),Math.tan(radians));
        degrees = 60;
        radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n",degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
    }
}