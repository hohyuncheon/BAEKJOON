package step3;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번 돌릴까요");
		int num1 = sc.nextInt();

		
		//num1숫자만큼 반복
		for (int i = 0; i < num1; i++) {
			System.out.println("더하고 싶은 숫자 두개 입력");
			int number1= sc.nextInt();
			int number2= sc.nextInt();
			System.out.println("case #"+(i+1)+" = "+(number1 + number2));
		}
	}
}
