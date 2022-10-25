package week6;
//반복문 한 번만 쓰고 0정해두고 i에서 1빼기
import java.util.Arrays;

public class Week6_1_practice2 {
    public static void main(String[] args) {
        int[] lotto = new int[7];
        lotto[0] = (int) (Math.random() * 45 + 1);

        for (int i = 1; i < lotto.length; i++) {
            lotto[i] = (int) (Math.random() * 45 + 1);
            if (lotto[i - 1] == lotto[i]) {
                i--;
            }
        }
        Arrays.sort(lotto);

        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }
    }
}
