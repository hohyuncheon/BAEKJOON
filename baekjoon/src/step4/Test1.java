package step4;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번 돌릴까요");
		int num = sc.nextInt();
		
		int i = 0;
		while(i<num) {
			System.out.println("정수2개입력해봐 더해줄게");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.print(num1+"+"+num2+"="+(num1+num2));
			System.out.println();
		}i++;
	}
}
