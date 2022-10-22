package week3;

import java.util.Scanner;

public class week3_1 {
	public static void main(String[] args) {
		//10개의 수를 입력받아
		
		int data[] = new int[11];
		int i,j,temp;
		Scanner sc = new Scanner(System.in);
		for(i=1; i<=10; i++) {
			data[i] = sc.nextInt();
		}
		
		for(i=1; i<=data.length; i++) {
			for(j=(i+1); j<=data.length-1; j++) {
				if(data[i] > data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
			/*for(int h=1;h<=data.length; h++) {
				System.out.print(data[h] + "  ");
			}
			System.out.println();
			*/
		}
		for(i=1;i<=data.length; i++) {
			System.out.print(data[i] + "  ");
		}
		
	}
}
