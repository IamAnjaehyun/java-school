package week5;
//k가 1부터라서 첫줄 000000 & printf("%4d",sco[i][j]) 기억
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Week5_1_practice2 {

    public static void main(String[] args) {
        int total = 0;
        int rank;
        int[][] sco = new int[20][6];
        int r = 0;
        String str = "";
        try {
            File fil = new File("res/index.txt");
            Scanner sc = new Scanner(fil);

            while (sc.hasNextLine()) {
                str = sc.nextLine();
                String st[] = str.split(" ");
                r++;
                for (int i = 0; i < st.length; i++) {
                    sco[r][i] = Integer.parseInt(st[i]);
                    sco[r][4] = sco[r][1] + sco[r][2] + sco[r][3];
                }

                for (int k = 1; k <= r; k++) {
                    rank = 1;
                    for (int j = 1; j <= r; j++) {
                        if (sco[k][4] < sco[j][4]) rank++;
                    }
                    sco[k][5] = rank;
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("파일이 없습니다.");
        }

        for (int i = 0; i <= r; i++) {
            for (int j = 0; j < sco[0].length; j++) {
                System.out.printf("%4d", sco[i][j]);
            }
            System.out.println("");
        }
    }
}

