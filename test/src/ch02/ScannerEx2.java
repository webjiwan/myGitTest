package ch02;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next();
		System.out.print("나이를 입력하세요 : ");
		short age = scan.nextShort();
		System.out.print("현재 가진 현금의 금액을 입력하세요 : ");
		int money = scan.nextInt();
		System.out.print("집에서 직장까지의 거리를 m단위로 입력하세요 : ");
		long distance = scan.nextLong();
		System.out.print("자신의 키(신장)을 입력하세요 : ");
		float height = scan.nextFloat();
		System.out.print("몸무게를 입력하세요. : ");
		double weight = scan.nextDouble();
		
		System.out.println("==========================");
		System.out.println("당신의 이름은" + name + "입니다.");
		System.out.println("당신의 나이는" + age + "입니다.");
		System.out.println("당신의 현재 현금은" + money + "입니다.");
		System.out.println("당신의 출근거리는" + distance + "입니다.");
		System.out.println("당신의 키는" + height + "입니다.");
		System.out.println("당신의 몸무게는" + weight + "입니다.");
		
		scan.close();
	}

}
