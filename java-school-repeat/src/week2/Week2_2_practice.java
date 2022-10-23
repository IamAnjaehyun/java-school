package week2;

public class Week2_2_practice {
    public static void main(String[] args) {
        int a1 = 1;
        int a2 = 1;
        int a3 = 0;
        System.out.print(a1 + " " + a2 +" " );
        for(int i=0;i<=12;i++){
            a3 = a1+a2;
            a1 = a2;
            a2 = a3;
//            System.out.println("a1 = " + a1);
//            System.out.println("a2 = " + a2);


            System.out.print(a3 + " ");
        }
    }
}
