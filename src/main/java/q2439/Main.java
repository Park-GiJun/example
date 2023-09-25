package q2439;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//
//		하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
		Scanner sc = new Scanner(System.in);
		
		String star = "*";
		
		int a = sc.nextInt();
		sc.close();
		
		
		for (int i =0;i<a;i++) {
			System.out.printf("%i", " ");
			System.out.print(star+"\n");
		}

	}

}
