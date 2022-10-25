package week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Week5_1 {
    public static void main(String[] args) {
        String str = "";
        int sco[][] = new int[20][6];
        int r = 0, c = 0, rank = 0;

        try {
            File fin = new File("res/index.txt");
            Scanner sc = new Scanner(fin);

            while (sc.hasNextLine()) {
                str = sc.nextLine();
                String st[] = str.split(" ");
                r++;
                for (c = 0; c < st.length; c++) {
                    sco[r][c] = Integer.parseInt(st[c]);
                    sco[r][4] = sco[r][1]+sco[r][2]+sco[r][3];
                }
            }
            for (int i = 1; i <= r; i++) {
                rank = 1;
                for (int j = 1; j <=r; j++) {
                    if(sco[i][4]<sco[j][4]) rank++;
                }
                sco[i][5] = rank;
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        }
        for (int i = 0; i <= r; i++) {
            for (int j = 0; j < sco[0].length; j++) {
                System.out.printf("%4d", sco[i][j]);
            }
            System.out.println();
        }
    }
}