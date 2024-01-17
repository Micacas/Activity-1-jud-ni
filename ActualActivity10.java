/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actual.activity.pkg1.pkg0;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class ActualActivity10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the value of n: ");
            int n = scanner.nextInt();
            int a = 0, b = 1, i = 1;
            while (i <= n) {
                System.out.print(a + " ");
                
                int nextTerm = a + b;
                a = b;
                b = nextTerm;
                
                i++;
            }
        }
    }
}