package week2;
//피보나치
public class ex_2 {
	public static void main(String[] args) {
		int fin = 13;
		for (int i = 1; i < fin; i++) {
			System.out.print(fibo(i)+" ");
		}
	}

	public static int fibo(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibo(n - 2) + fibo(n- 1);
		}
	}
}
