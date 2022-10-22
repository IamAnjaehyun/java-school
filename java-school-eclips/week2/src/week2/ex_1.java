package week2;

import java.util.Scanner;

public class ex_1 {
	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요. : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = 0;
		int min = 999;

		if (a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
	}
}
