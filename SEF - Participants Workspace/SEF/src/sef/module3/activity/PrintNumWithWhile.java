/**
 *
 */
package sef.module3.activity;

/**
 * @Julija Melnika
 *
 */
public class PrintNumWithWhile {

    /**
     * @param args
     */
    public static void main(String[] args) {


        // Print all even numbers less than 100
        int i = 0;
        while (i < 100) {
            System.out.println(i);
            i = i + 2;
        }

		// write code to Print all odd numbers less than 100

        System.out.println("\n*** ODD NUMBERS");

        i = 1;
        while (i < 100) {
            System.out.println(i);
            i = i + 2;
        }
    }

}
