package step3;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 쓰시오");
		int num = sc.nextInt();

		int sum=0;
		for (int i = 1; i <= num; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
