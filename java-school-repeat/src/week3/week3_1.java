package week3;

import java.util.Scanner;

public class week3_1 {
    public static void main(String[] args) {
        //10개의 수를 입력받아

        int data[] = new int[10];
        int i,j,temp;
        Scanner sc = new Scanner(System.in);
        for(i=0; i<10; i++) {
            data[i] = sc.nextInt();
        }

        for(i=0; i<10; i++) {
            for(j=(i+1); j<10; j++) {
                if(data[i] > data[j]) {
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        for(i=0;i<10; i++) {
            System.out.print(data[i] + "  ");
        }

    }
}