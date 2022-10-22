package week2;

import java.util.Scanner;

public class ex_1_1 {
	public static void main(String[] args) {
		System.out.println("세 수를 입력하시오 :");
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int max = 0;
		int mid = 0;
		int min = 0;

		if (a > b && a > c) {
			max = a;
			if (b > c) {
				mid = b;
				min = c;
			} else {
				mid = c;
				min = b;
			}
		}
		if (b > a && b > c) {
			max = b;
			if (a > c) {
				mid = a;
				min = c;
			} else {
				mid = c;
				min = a;
			}
		}
		if (c > a && c > b) {
			max = c;
			if (a > c) {
				mid = a;
				min = b;
			} else {
				mid = b;
				min = a;
			}
		}
		System.out.println("가장 큰 값 = " + max);
		System.out.println("중간 값 = " + mid);
		System.out.println("가장 작은 값 = " + min);
	}
}

