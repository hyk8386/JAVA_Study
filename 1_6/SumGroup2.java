package study06;

import java.util.Scanner;

public class SumGroup2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 더합니다.");
		
		int total = 0;
		
		
		Outer:
			for(int i=1; i<=10; i++) {
				System.out.println(i + "그룹");
				for (int j=1; j<=10; j++) {
					System.out.print("정수 : ");
					int num = stdIn.nextInt();
					if(num==99999) {
						break Outer;
					} else if(num==88888) {
						continue Outer;
					} total += num;
				} 
			}
		System.out.println("\n합계는 " + total + "입니다.");
	}	
}