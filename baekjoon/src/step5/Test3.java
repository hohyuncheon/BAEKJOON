package step5;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력해보세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int total = num1 * num2 * num3;

		String change = String.valueOf(total);

		System.out.println("3개곱한 값은" + change);

		// 배열생성
		char[] ch = new char[change.length()];

		int [] count = new int[];

		// 값넣기
		for (int i = 0; i < ch.length; i++) {
			ch[i] = change.charAt(i);

			for (int j = 0; j < ch.length; j++) {
				if (j == ch[i]) {
					count[i]++;

				}
			}
			System.out.println(i + " = count : " + count);

		}
	}
}
