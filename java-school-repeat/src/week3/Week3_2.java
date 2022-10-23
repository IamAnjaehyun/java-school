package week3;

import java.util.Scanner;

public class Week3_2 {
    public static void main(String[] args) {
        int KUK[] = new int[11];
        int MAT[] = new int[11];
        int SUM[] = new int[11];

        Scanner sc = new Scanner(System.in);
        int RANK = 1;
        int i, j, k, temp;

        for (i = 1; i <= 10; i++) {
            System.out.println("국어 점수, 수학점수를 차례로 입력하세요. : ");
            KUK[i] = sc.nextInt();
            MAT[i] = sc.nextInt();
            SUM[i] = KUK[i] + MAT[i];
        }

        for(i=1;i<=9;i++) {
            for(j=(i+1);j<=10;j++) {
                if(SUM[i]<SUM[j]) {
                    temp=KUK[i]; KUK[i]=KUK[j]; KUK[j]=temp;
                    temp=MAT[i]; MAT[i]=MAT[j]; MAT[j]=temp;
                    temp=SUM[i]; SUM[i]=SUM[j]; SUM[j]=temp;
                }
            }
        }
        for(i = 1; i<=10; i++) {
            System.out.println(RANK+"등의 국어 점수는 "+KUK[i]+"점 이며 수학점수는 "+MAT[i]+"점 이며 총 점수는 "+SUM[i]+" 입니다.");
            RANK++;
        }
    }
}