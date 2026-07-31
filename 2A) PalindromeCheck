package info.java;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        String original = str.toLowerCase();
	        String reverse = "";

	        // Reverse the string
	        for (int i = original.length() - 1; i >= 0; i--) {
	            reverse += original.charAt(i);
	        }

	        // Check palindrome
	        if (original.equals(reverse)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }

	        sc.close();
	    }
	
}
