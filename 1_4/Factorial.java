package study04;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a;
		
		do {
			System.out.print("양의 정숫값 : ");
			a = stdIn.nextInt();			
		} while (a <= 0);   // 입력한 값이 0 보다 작거나 같으면 do문으로 돌아감
		
		int factorial = 1;
		int i = 1;
		
		while(i<=a) {
			factorial *= i;
			i++;
		}
		System.out.println("1부터 " + a + "까지의 곱은 " + factorial + "입니다." );
	}

}
