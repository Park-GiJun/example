package q3009;

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[3][2];
		for(int i = 0 ; i < arr.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0 ; j < arr[i].length; j ++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

	}

}
