package step3;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int num1 = sc.nextInt();
		System.out.println("입력한 숫자보다 낮은값 찾아드릴게요");
		int num2 = sc.nextInt();
		
		
		System.out.println(num2 + "보다 낮은 숫자는");
		for (int i = 1; i <= num1; i++) {
			if(num2>i) {
				System.out.print(i +" ");
			}
		}
	}
}