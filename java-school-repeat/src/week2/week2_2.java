package week2;

public class week2_2 {
    public static void main(String[] args) {
        int a1 = 1;
        int a2 = 1;
        int a3 = 0;
        System.out.print(a1 + " ");
        System.out.print(a2 + " ");
        int i = 1;
        while (i<=13){
            a3 = a1+a2;
            System.out.print(a3 + " ");
            a1 = a2;
            a2 = a3;
            i++;
        }
    }
}
