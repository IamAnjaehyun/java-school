package week3;

import java.util.Scanner;

public class Week3_2_practice {
    public static void main(String[] args) {

        int KOR[] = new int[3];
        int MAT[] = new int[3];
        int SUM[] = new int[3];
        int RANK = 1;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println(i+1 +"번쨰 사람");
            System.out.print("국어 : ");
            KOR[i] = sc.nextInt();
            System.out.print("수학 : ");
            MAT[i] = sc.nextInt();

            SUM[i] = KOR[i] + MAT[i];
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                if (SUM[i] < SUM[j]) {
                    int temp;
                    temp = KOR[i];
                    KOR[i] = KOR[j];
                    KOR[j] = temp;
                    temp = MAT[i];
                    MAT[i] = MAT[j];
                    MAT[j] = temp;
                    temp = SUM[i];
                    SUM[i] = SUM[j];
                    SUM[j] = temp;

                }
            }
        }
        for(int i=0; i<3; i++){
            System.out.println(RANK +" 등의 국어 "+KOR[i] +"점, 수학 "+MAT[i] +"점, 총점" +SUM[i] +"점");
            RANK++;
        }
    }
}

