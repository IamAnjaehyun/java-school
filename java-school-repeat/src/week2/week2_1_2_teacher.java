package week2;

import java.util.Scanner;

public class week2_1_2_teacher {
    public static void main(String[] args) {
        System.out.println("세 수를 입력하시오 :");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = 0;
        int mid = 0;
        int min = 0;

        if(a>b) {
            if(a>c) {
                max = a;
                if(b>c) {
                    mid=b;
                    min=c;
                }else {
                    mid=c;
                    min=b;
                }
            }else {
                max=c;
                mid=a;
                min=b;
            }
        }else {
            if(b>c) {
                max=b;
                if(a>c) {
                    mid=a;
                    min=c;
                }else {
                    mid=c;
                    min=a;
                }
            }else {
                max=c;
                mid=b;
                min=a;
            }
        }
        System.out.println("max= "+max);
        System.out.println("mid= "+mid);
        System.out.println("min= "+min);
    }

}