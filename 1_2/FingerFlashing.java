package study02;

import java.util.Random;

public class FingerFlashing {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		System.out.print("컴퓨터가 낸 것 : ");
		int hand = rand.nextInt(3);
		
		if(hand == 0) {
			System.out.println("가위");
		} else if (hand == 1) {
			System.out.println("바위");
		} else {
			System.out.println("보");
		}
	}
}
//        switch 문 이용
//        switch(hand) {
//        case 0 : System.out.println("가위"); break;
//        case 1 : System.out.println("바위"); break;
//        case 2 : System.out.println("보"); break;
//        }
