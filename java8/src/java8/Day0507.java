package java8;

import java.util.Random;

public class Day0507 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Random rd = new Random();
		int now = rd.nextInt(4) + 9;
		System.out.println("현재시간은 "+now+"시 입니다.");
		System.out.println("남은 일과");
		switch(now) {
		case 9:
			System.out.println("9시에는 출근합니다.");
		case 10:
			System.out.println("10시에는 회의를 합니다.");
		case 11:
			System.out.println("11시에는 업무를 처리합니다.");
		default:
			System.out.println("12시에는 점심을 먹습니다.");
	}

}
}
