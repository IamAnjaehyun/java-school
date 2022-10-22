package week2;

import java.util.Scanner;

public class week2_1_1 {
    public static void main(String[] args) {
        System.out.println("두 수를 입력하세요.");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = 999;
        int min = 0;

        if(a>b){
            max = a;
            min = b;
        }else{
            max = b;
            min = a;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
