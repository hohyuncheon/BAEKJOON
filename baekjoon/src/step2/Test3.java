package step2;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 년도를 입력하시오 (윤년인지 찾아드림)");
		int num1 = sc.nextInt();
		
		if(num1%4==0&&num1%100!=0||num1%400==0) {
			System.out.println("윤년입니다");
		}else {
			System.out.println("윤년이아닙니다");
		}
		
		
		
		

	}

}
