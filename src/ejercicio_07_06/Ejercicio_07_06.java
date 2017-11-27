/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_07_06;

/**
 *
 * @author ASUS
 */
public class Ejercicio_07_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] conteos = new int[10]; // Array of ten integers

		// Store the counts of 100 random numbers
		for (int i = 1; i <= 100; i++) {
			conteos[(int)(Math.random() * 10)]++;
		}

		// Display the results
		System.out.println("Cuente para cada número entre 0 y 9:");
		for (int i = 0; i < conteos.length; i++) {
			System.out.println(i + "s: " + conteos[i]);
		}
	}
}
    
    

