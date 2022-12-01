package application;

import java.util.Locale;
import java.util.Scanner;

import entities.RentRecord;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;

		do {
			System.out.print("How many rooms will be rented? (1 - 10) ");
			n = sc.nextInt();

			if (n < 1 || n > 10) {
				System.out.println("Value is invalid. Enter again.\n");
			}
		} while (n < 1 || n > 10);

		RentRecord arr[] = new RentRecord[9];

		for (int i = 0; i < n; i++) {
			System.out.println("\nRent #" + (i + 1));

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("E-mail: ");
			String email = sc.next();

			System.out.print("Room: ");
			int room = sc.nextInt();

			arr[room] = new RentRecord(name, email, room);
		}

		System.out.println("\nBusy rooms:");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				System.out.printf("%d: %s, %s\n", arr[i].getRoom(), arr[i].getName(), arr[i].getEmail());
			}
		}

		sc.close();
	}

}
