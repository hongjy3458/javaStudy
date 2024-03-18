package main;

import java.util.Scanner;

public class Main04 {

	public static void main(String[] args) {
		// 키 몸무게 받아서, 비만도 출력
		
		// 표준몸무게 = (실제 키 - 100) * 0.9
		// 비만도 = (실제몸무게 - 표준몸무게) * 100 / 표준몸무게
		
		// <비만도 등급>
		// 10 이하 		: 정상
		// 10 초과 20이하 	: 과체중
		// 20 초과 		: 비만
		
		Scanner sc = new Scanner(System.in);
		double height = sc.nextDouble();
		double weight = sc.nextDouble();
		
		double stdWeight = (height - 100) * 0.9;
		double bmi = (weight - stdWeight) * 100 / stdWeight;
		
		if(bmi <= 10) {
			System.out.println("정상");
		}else if(bmi <= 20) {
			System.out.println("과체중");
		}else {
			System.out.println("비만");
		}
		
		
	}

}











