package step5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test4 {

	public static void main(String[] args) {
		//중복제거하는 set활용
		Set<Integer> set = new HashSet<Integer>();
		Scanner sc= new Scanner(System.in);
		System.out.println("정수 10개를 입력하시오");
		for (int i = 0; i < 10; i++) {
			set.add(sc.nextInt()%42);
		}
		System.out.println(set.size());

	}
}
