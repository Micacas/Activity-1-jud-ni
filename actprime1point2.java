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
public class actprime1point2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number to check for primality: ");
            int num = scanner.nextInt();
            
            boolean isPrime = true;
            int i = 2;
            
            do {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            } while (i <= Math.sqrt(num));
            
            if (num <= 1) {
                isPrime = false;
            }
            
            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }
}
