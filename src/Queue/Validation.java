/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Validation {
    public static Scanner sc = new Scanner(System.in);
    public static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number integer : ");
                System.out.println("Enter again : ");
            }
        }
    }
    public static double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine().trim());
                if (result>0 && result <1) {
                    return result;
                }else{
                    System.out.println("Enter again");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter again : ");
            }
        }
    }

}
