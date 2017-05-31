/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package namebackwards;
 import java.util.Scanner;
  
 /**
  * A name is displayed backwards.
  */
 public class NameBackwards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		char[] nameLetters;
		
		/* prompt user for name */
		System.out.print("Enter your name: ");
		name = input.nextLine();
		
		/* display name backwards */
		nameLetters = name.toCharArray();
		for (int letter = nameLetters.length; letter > 0 ; letter--) {
			System.out.print(nameLetters[letter - 1]);
		}
		System.out.println();
	}
}
