package week2;

import java.util.Scanner;

public class week2_1_2 {
    public static void main(String[] args) {
        System.out.println("세 수를 입력하세요.");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = 0, mid = 0, min = 0;

        if(a>b && a>c){
            max = a;
            if(b>c){
                mid = b;
                min = c;
            }else{
                mid = c;
                min = b;
            }
        }

        if(b>a && b>c){
            max = b;
            if(a>c){
                mid = a;
                min = c;
            }else{
                mid = c;
                min = a;
            }
        }

        if(c>a && c>b){
            max = c;
            if(a>b){
                mid = a;
                min = b;
            }else{
                mid = b;
                min = a;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + mid);
        System.out.println("min = " + min);
    }
}
