package study04;

import java.util.Scanner;

public class CountDownFor {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("카운트다운 합니다.");
		
		int n;
		
		do {
			System.out.print("양의 정숫값 : ");
			n = stdIn.nextInt();
		} while (n<=0);
		
		int i;
		
		for(i=n; i>=0; i--) {
			System.out.println(i);
		}
	}
}
