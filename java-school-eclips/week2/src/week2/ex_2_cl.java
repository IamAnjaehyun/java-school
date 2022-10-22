package week2;

public class ex_2_cl {
	public static void main(String[] args) {
		int a1 = 1;
		int a2 = 2;
		int a3 = 0;
		System.out.print(a1 + ", ");
		System.out.print(a2 + ", ");

//		for (int i = 1; i <= 13; i++) 
		int i=1;//while 용
		while(i<=13){
			a3 = a1 + a2;
			System.out.print(a3);
			a1 = a2;
			a2 = a3;

			if (i != 13) {
				System.out.print(", ");
			}
			i++;//while 용
		}
	}
}
