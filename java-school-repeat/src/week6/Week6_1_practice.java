package week6;

import java.util.Arrays;

public class Week6_1_practice {
    public static void main(String[] args) {
        int[] j = new int[7];

        j[0] = (int)(Math.random()*45+1);

        for(int i=1; i<=6;i++){
            j[i] = (int)(Math.random()*45+1);

            for(int k=1; k<i; k++) {
                if(j[i]==j[k]){
                    i--;
                }
            }
        }

        Arrays.sort(j);
        for(int i=0;i<j.length; i++){
            System.out.print(j[i] + " ");
        }
    }

}
