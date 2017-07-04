package org.study.java;

/**
 * Created by YS on 2017-07-04.
 */
public class Mainfor {
    public static void run() {

        for(int num=0; num <= 20; num++) {
            if (num % 2 == 1) {
                System.out.println(num +"은(는) 홀수");
            }
            if (num % 2 == 0) {
                System.out.println(num +"은(는) 짝수");
            }
            if (num % 3 == 0) {
                System.out.println(num +"은(는) 3의 배수");
            }
            if (num % 5 == 0) {
                System.out.println(num +"은(는) 5의 배수");
            }
        }

        // 무한루프 예제
        for(int i=0; true; i++){
            System.out.println(i);

            if(i > 32678) {
                break;
            }
        }

        // 홀수만 더하기
        // 짝수만 더하기
        // 2의 배수만 더하기
        // 3의 배수만 더하기
    }
}
