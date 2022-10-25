package week3;
//한번에 입력받고 등수는 출력할때 1등씩 더하면 편함
import java.util.Scanner;

public class Week3_2_practice2 {
    public static void main(String[] args) {

        //국어 수학 합계

        int[] kor = new int[3];
        int[] mat = new int[3];
        int[] sum = new int[3];
        int rank = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("국어 + 수학 입력");
            kor[i] = sc.nextInt();
            mat[i] = sc.nextInt();
            sum[i] = kor[i] + mat[i];
        }
        for (int i = 0; i < 3; i++) {
            rank++;
            for (int j = i+1; j < 3; j++) {
                if(sum[i] < sum[j]){
                    int temp;
                    temp = kor[i]; kor[i] = kor[j]; kor[j]=temp;
                    temp = mat[i]; mat[i] = mat[j]; mat[j]=temp;
                    temp = sum[i]; sum[i] = sum[j]; sum[j]=temp;
                }
            }
            System.out.println(rank + "등 국어 - " +kor[i]+ " 수학 - " +mat[i] +" 총점 - " +sum[i]);
        }
    }
}
