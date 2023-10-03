package q2941;

//예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
//
//dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String a = br.readLine(); // 받은 문자열
		List<String> cros = new ArrayList<>(); // 크로아티아어 리스트

		for (int i = 0; i < a.length(); i++) {
			int b;
			if(a.charAt(0) == 'd') {
				if(a.charAt(1)== 'z') {
					if(a.charAt(2)=='=') {
						b = 3;
					}
				}
			}
			if(cro.equals("c=") && cro.equals("c-") && cro.equals("dz=") && cro.equals("d-") && cro.equals("lj") && cro.equals("nj")
				&& cro.equals("s=") && cro.equals("z=")) {
				
			}
				
		
		}
		
	}
}
