package step2;

import java.util.Scanner;

public class Test5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h,m;

        System.out.print("상근이의 알람시간을 입력하세요(정수 두개, 시 분) : ");
        h=sc.nextInt();
        m=sc.nextInt();

        //10:43 == 10 58
        
        if((m-45)<0) {
            m+=15;
            
            if((h-1)<0)
                h=23;
            else
                h--;
            
        }else
            m-=45;

        System.out.println("상근이의 새 알림시간 : "+h+"시 " + m+"분!!!!");
    }
}