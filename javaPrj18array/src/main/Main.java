package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("===== 배열 =====");
		
		//학생 성적 관리 (배열)
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수 : ");
		int stdCnt = sc.nextInt();
		int[] scoreArr = new int[stdCnt];
		
		for(int i = 0 ; i < scoreArr.length; i++) {
			System.out.print(i + "번 학생 성적 : ");
			scoreArr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i = 0 ; i < stdCnt; ++i) {
			sum += scoreArr[i];
		}
		
		
		System.out.println(sum);
		System.out.println(sum / stdCnt);
		
		
		
		
		
		
		
		
		//학생 성적 관리 (변수)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("1번 학생 성적 : ");
//		int score01 = sc.nextInt();
//		System.out.print("2번 학생 성적 : ");
//		int score02 = sc.nextInt();
//		System.out.print("3번 학생 성적 : ");
//		int score03 = sc.nextInt();
//		System.out.print("4번 학생 성적 : ");
//		int score04 = sc.nextInt();
//		System.out.print("5번 학생 성적 : ");
//		int score05 = sc.nextInt();
//		
//		int sum = 0;
//		sum += score01;
//		sum += score02;
//		sum += score03;
//		sum += score04;
//		sum += score05;
//		
//		int studentCount = 5;
//		
//		System.out.println(sum);
//		System.out.println(sum / studentCount);

	}

}








