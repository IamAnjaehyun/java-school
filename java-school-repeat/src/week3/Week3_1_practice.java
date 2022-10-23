package week3;

import java.util.Scanner;

public class Week3_1_practice {
    public static void main(String[] args) {

        int[] data = new int[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            data[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = (i + 1); j < 3; j++) {
                if (data[i] > data[j]) {
                    int temp;
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
            System.out.println("data[" + i + "] = " + data[i]);
        }


    }
}
