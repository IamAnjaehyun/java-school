package week6;

import java.util.Arrays;
//Lotto
public class Week6_1 {
    public static void main(String[] args) {
        int i;
        int j[] = new int[7];
        int k;
        j[0] = (int)(Math.random()*45+1);
        for(i=1; i<=6; i++) {
            j[i] = (int)(Math.random()*45+1);

            for(k=1; k<i; k++) {
                if(j[i] == j[k]) {
                    i--;
                    continue;
                }
            }
        }
        Arrays.sort(j);
        for(i=0;i<=6;i++) {
            System.out.println(j[i]+" ");
        }
    }
}