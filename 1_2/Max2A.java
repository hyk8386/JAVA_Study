package study02;

import java.util.Scanner;

public class Max2A {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("실수 a :"); double a = stdIn.nextDouble();
		System.out.print("실수 b :"); double b = stdIn.nextDouble();
		
		if(a>b) {
			System.out.println("큰 쪽의 값은 " + a + "입니다.");
		} else {
			System.out.println("큰 쪽의 값은 " + b + "입니다.");
		}
	}
}
