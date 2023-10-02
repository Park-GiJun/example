package q1157;

//알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] a = br.readLine().toUpperCase().split("");
		int[] b = new int[26];

		for (int i = 0; i < a.length - 1; i++) {
			int c = (int)a[i].charAt(i) - 65;
			b[c]++;

		}

		bw.flush();
		bw.close();
		br.close();

	}

}
