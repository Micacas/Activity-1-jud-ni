/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actprime1;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class act1multiplicationtable1point3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number to generate its multiplication table: ");
            int num = scanner.nextInt();
            
            for (int i = 1; i <= 10; i++) {
                int result = num * i;
                System.out.println(num + " x " + i + " = " + result);
            }
        }
    }
}