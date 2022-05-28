package study03;

import java.util.Scanner;

public class DigitNo {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("양의 정숫값의 자릿수를 표시합니다.");
		System.out.print("양의 정숫값 : ");
		int a = stdIn.nextInt();
		
		System.out.print("입력한 숫자는 " + (int)( Math.log10(a)+1 ) + "자리 입니다." );
	}

}
