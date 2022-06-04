package study05;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정방향을 표시합니다.");
		System.out.print("단수는 : ");
		
		int num = stdIn.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num; j++) {
				System.out.print("*");
			} System.out.println();	 
		} 
	}
}


