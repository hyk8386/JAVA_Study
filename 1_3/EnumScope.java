package study03;

import java.util.Scanner;

public class EnumScope {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 A : "); int A = stdIn.nextInt();
		System.out.print("정수 B : "); int B = stdIn.nextInt();
		
		int tmp;
		
		if(A>B) {
			tmp = A; A = B; B = tmp; 
		} 
		
		do {
			System.out.print(A + " ");
			A += 1;
		} while (A<=B);
		System.out.println();
	}

}
