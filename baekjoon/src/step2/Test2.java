package step2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 시험 점수는");
		int num = sc.nextInt();
		
		if(num>=90&&num<=100) {
			System.out.println("A");
		}
		else if(num>=80&&num<=89) {
			System.out.println("B");
		}
		else if(num>=70&&num<=79) {
			System.out.println("C");
		}
		else if(num>=60&&num<=69) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}

}
