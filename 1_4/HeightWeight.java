package study04;

import java.util.Scanner;

public class HeightWeight {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("몇 cm부터 : "); int hMin = stdIn.nextInt();
		System.out.print("몇 cm까지 : "); int hMax = stdIn.nextInt();
		System.out.print("몇 cm단위 : "); int unit = stdIn.nextInt();
		
		System.out.println("신장    표준체중");
		System.out.println("-------------");

		
		for(int i=hMin; i<=hMax; i+=unit) {
			System.out.println(i + "    " + (i - 100) * 0.9);
		}
		
	
		
	}

}
