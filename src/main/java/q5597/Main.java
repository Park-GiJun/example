package q5597;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = 30;
		int[] arry1 = new int[n];
		
		for(int i =0; i<arry1.length;i++) {
			arry1[i] = i;
		}
		Arrays.sort(arry1);
		
		int m = 30 ;
		int[] arry2 = new int[m];
		arry2[0] = 31;
		arry2[1] = 31;
		for(int i =2; i<arry2.length; i++) {
			arry2[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arry2);
		
		
		

	}

}
