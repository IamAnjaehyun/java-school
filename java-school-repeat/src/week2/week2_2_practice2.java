package week2;
//a3 a1 a2 기억!!

public class week2_2_practice2 {
    public static void main(String[] args) {
        int a1=1;
        int a2=1;
        int a3=0;
        System.out.print(a1 + " "+ a2 + " ");
        for(int i=0;i<13;i++){
            a3=a1+a2;
            a1=a2;
            a2=a3;
            System.out.print(a3+ " ");
        }
    }
}
