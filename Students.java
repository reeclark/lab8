package lab8;

import java.util.Scanner;
import validator.LabValidator;

public class Students {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] name = { "Tim Smith", "Bob Clark", "Tom Cook", "Sam Cook", "Joe Brown", "Ian Jones" };
		String[] food = { "French Fries", "Burgers", "Cake", "Pizza", "Tacos", "Salad" };
		String[] home = { "Detorit, MI", "Lansing, MI", "Flint, MI", "Troy, MI", "Dearborn, MI", "Novi, MI" };

		System.out.println(
				"Welcome to our Java class! Which student would you like to learn more about? (enter a number between 1 and 6): ");
		System.out.println();
		for (int i = 0; i < name.length; i++) {
			System.out.println((i + 1) + ". " + name[i]);
		}

		int input = LabValidator.getInt(scan, "\nPick a student: ", 1, name.length);
		System.out.println("Student " + input + " is " + name[input - 1] + ". ");
		
		LabValidator.myRegex(scan,"What would you like to know about " + name[input - 1].substring(0, 3) + " (enter \"hometown\" or \"favorite food\"): ", "hometown");
		System.out.println(name[input - 1] + " is from " + home[input - 1] + ". ");
		LabValidator.myRegex(scan,"What would you like to know more? ", "yes");
		System.out.println(name[input - 1] + " favorite food is " + food[input - 1] + ". ");
		System.out.println("Thanks!");
		
	}

}
