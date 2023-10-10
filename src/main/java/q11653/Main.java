package q11653;

//정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		boolean zero = true;
		int b = 0;
		

		while (zero) {
			int i = 0;
			if (isPrime(i)) {
				b = n / i++;
				if (n / i == 0) {
					zero = false;
				}
				bw.write(String.valueOf(b));
			} else {
				i++;
			}

		}

		bw.flush();
		bw.close();
		br.close();

	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		if (num <= 3) {
			return true;
		}
		if (num % 2 == 0 || num % 3 == 0) {
			return false;
		}

		for (int i = 5; i * i <= num; i += 6) {
			if (num % i == 0 || num % (i + 2) == 0) {
				return false;
			}
		}

		return true;
	}

}
