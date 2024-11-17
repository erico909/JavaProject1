package emailapp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		String firstN = sc.next();
		
		System.out.print("Enter your last name: ");
		String lastN = sc.next();
		
		Email em1 = new Email(firstN, lastN);
		
		System.out.println(em1.showInfo());
	}

}
