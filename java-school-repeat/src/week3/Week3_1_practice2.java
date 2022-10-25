package week3;
//큰놈부터 내려가려면 꺾쇠 대가리 오른쪽 " < " 내림차순(DESC)
//작은놈부터 올라가려면 꺾쇠 대가리 왼쪽 " > " 오름차순(ASC)
import java.util.Scanner;

public class Week3_1_practice2 {
    public static void main(String[] args) {
        //숫자 입력받아서 sort 큰수가 앞으로

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int[] data = new int[3];
        for (int i = 0; i < T; i++) {
            data[i] = sc.nextInt();
        }

        for(int i=0;i<T;i++){
            for (int j=i+1; j<T; j++){
                if(data[i]<data[j]){
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }

        for (int i = 0; i < T; i++) {
            System.out.print(data[i] + " " + (i + 1) + "등  ");
        }
    }
}
