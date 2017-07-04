package org.study.java;

/**
 * Created by YS on 2017-07-04.
 */
public class MainIf {
    public static void run() {

        if( 1 == 1) {
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }

        // 1. 점수가 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 미만이면 D를 출력하는 조건문을 만들어야 한다.
        // 1-1. 점수가 98점이면 A+를 출력하도록 추가한다.

        // 2. 입력받은 값이 아래와 같은 조건일 때 출력하는 조건문을 만들어야 한다.
        // 홀수만 출력하기
        // 짝수만 출력하기
        // 3의 배수만 출력하기
        // 5의 배수만 출력하기
        int num = 2;
        if (num % 2 == 1) {
            System.out.println(num);
        }
        if (num % 2 == 0) {
            System.out.println(num);
        }
        if (num % 3 == 0) {
            System.out.println(num);
        }
        if (num % 5 == 0) {
            System.out.println(num);
        }

        // 3. 성이 "이"씨면 "이가"를 출력하고, 김씨면 "김가"를 출력하고, 오씨면 "오가"를 출력하라.
        String name = "이승엽";
        if(name.startsWith("이")) {
            System.out.println("이가");
        } else if(name.startsWith("김")) {
            System.out.println("김가");
        } else if(name.startsWith("오")) {
            System.out.println("오가");
        } else {
            System.out.println("??가");
        }

    }
}
