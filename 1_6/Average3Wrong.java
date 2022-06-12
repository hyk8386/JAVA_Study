package study06;

import java.util.Scanner;

public class Average3Wrong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정숫값 x, y, z의 평균을 구합니다.");
		System.out.print("x값 : "); int x = sc.nextInt();
		System.out.print("y값 : "); int y = sc.nextInt();
		System.out.print("z값 : "); int z = sc.nextInt();
		
		int sum = x+y+z;
		double avg = sum/3.0;
		
		System.out.printf("x, y, z의 평균은 %.3f 입니다.", avg);
		
	}

}
