package study01;

import java.util.Scanner;

public class Grade1 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("점수 : ");
		int n = stdIn.nextInt();
		
		if(0<=n && n<=49) {
			System.out.println("가");
		} else if (50<=n && n<=59) {
			System.out.println("양");
		} else if (60<=n && n<=69) {
			System.out.println("미");
		} else if (70<=n && n<=79) {
			System.out.println("우");
		} else if (80<=n && n<=100) {
			System.out.println("수");
		} else
			System.out.println("잘못된 점수입니다.");
	}
}
