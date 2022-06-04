package study05;

import java.util.Scanner;

public class SeasonRepeat {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry = 0;
		
		System.out.println("계절을 찾습니다.");
		
		do {
			int month;
			do {
				System.out.print("몇 월입니까? : ");
				month = stdIn.nextInt();			
			} while (month<1 || month>12);
			
			if(3<=month && month<=5) {
				System.out.println("봄입니다.");
			} else if(6<=month && month<=8) {
				System.out.println("여름입니다.");
			} else if(9<=month && month<=11) {
				System.out.println("가을입니다.");
			} else {
				System.out.println("겨울입니다.");
			}
			System.out.println("다시 하시겠습니까? 1...Yes / 0...No");
			retry = stdIn.nextInt();
		} while (retry == 1);
    }
}
