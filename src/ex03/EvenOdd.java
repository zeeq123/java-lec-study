package ex03;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int number;

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하시오: ");

        number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println("짝수");
        }else {
            System.out.println("홀수");
        }
    }
}
