package q2884;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b;

		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();

		if (b > 45) {
			if (a == 0) {
				System.out.println("23" + " " + (b - 45));
			} else {
				System.out.println(a + " " + (b - 45));
			}
		} else if (b < 45) {
			if (a == 0) {
				System.out.println("23" + " " + (b + 15));
			} else {
				System.out.println((a - 1) + " " + (b + 15));
			}
		} else if (b == 0) {
			System.out.println((a + 1) + " " + "00");
		}

	}

}
