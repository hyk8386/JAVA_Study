package study03;

import java.util.Scanner;

public class ThreeDigits {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
        int a;
        
		do {
			System.out.print("세 자리의 정숫값: ");	
			a = stdIn.nextInt();
		} while (100>a || a>999);	
		System.out.println("입력한 값은 " + a + "입니다.");
	}
}
