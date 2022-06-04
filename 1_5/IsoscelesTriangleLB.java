package study05;

import java.util.Scanner;

public class IsoscelesTriangleLB {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
		System.out.print("단수는? : ");
		
		int num = stdIn.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			} System.out.println();
		}
	}

}
