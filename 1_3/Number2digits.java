package study03;

import java.util.Random;
import java.util.Scanner;

public class Number2digits {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int random = (int)(Math.random()*(99-10+1)+10);
		int a;
		
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("10부터 99사이의 숫자를 맞추세요");
		
		do {
			System.out.print("어떤 숫자일까? : ");
			
			a = stdIn.nextInt();
			
			if(a<random) {
				System.out.println("더 큰 숫자입니다.");
			} else if (a>random) {
				System.out.println("더 작은 숫자입니다.");
			} else {
				System.out.println("정답입니다.");
			}
			
		} while (a!=random);
		
		
		
		
	}

}
