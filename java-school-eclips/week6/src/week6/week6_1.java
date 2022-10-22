package week6;

import java.util.Arrays;
//Lotto
public class week6_1 {
	public static void main(String[] args) {
		int i;
		int j[] = new int[6];
		int k;
		j[1] = (int)(Math.random()*45+1);
		for(i=2; i<=5; i++) {
			j[i] = (int)(Math.random()*45+1);
			
			for(k=1; k<i; k++) {
				if(j[i] == j[k]) {
					i--;
					continue;
				}
			}
		}
		Arrays.sort(j);
		for(i=1;i<=5;i++) {
			System.out.println(j[i]+" ");
		}
	}
}
