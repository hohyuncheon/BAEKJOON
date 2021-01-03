package step2;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("x좌표, y좌표 각각 적어주세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1>0 && num2>0) {
			System.out.println("1");
		}
		if(num1<0 && num2>0) {
			System.out.println("2");
		}
		if(num1<0 && num2<0) {
			System.out.println("3");
		}
		if(num1>0 && num2<0) {
			System.out.println("4");
		}
		
		
	}

}
