package q1978;

//주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int sum = 0;
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(st.nextToken());
			if (isPrime(a)) {
				sum++;
			}

		}
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
		br.close();
	}

	// 주어진 숫자가 소수인지 판별하는 함수
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

		// 5 이상의 소수는 6k ± 1 형태를 가짐 (k는 자연수)
		// 따라서 6k ± 1 형태의 수만 검사하면 됨
		for (int i = 5; i * i <= num; i += 6) {
			if (num % i == 0 || num % (i + 2) == 0) {
				return false;
			}
		}

		return true;
	}
}
